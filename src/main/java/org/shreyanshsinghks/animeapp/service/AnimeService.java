package org.shreyanshsinghks.animeapp.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.shreyanshsinghks.animeapp.model.Anime;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class AnimeService {

    private final WebClient webClient;
    private final ObjectMapper objectMapper;
    private static final String JIKAN_API_BASE_URL = "https://api.jikan.moe/v4";

    public AnimeService() {
        this.webClient = WebClient.builder()
                .baseUrl(JIKAN_API_BASE_URL)
                .build();
        this.objectMapper = new ObjectMapper();
    }

    public List<Anime> searchAnime(String query) {
        try {
            String response = webClient.get()
                    .uri("/anime?q={query}&limit=20", query)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            return parseAnimeList(response);
        } catch (Exception e) {
            log.error("Error searching anime: {}", e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Anime> getTopAnime() {
        try {
            String response = webClient.get()
                    .uri("/top/anime?limit=20")
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            return parseAnimeList(response);
        } catch (Exception e) {
            log.error("Error fetching top anime: {}", e.getMessage());
            return new ArrayList<>();
        }
    }

    public Anime getAnimeById(Long id) {
        try {
            String response = webClient.get()
                    .uri("/anime/{id}", id)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            JsonNode jsonNode = objectMapper.readTree(response);
            JsonNode dataNode = jsonNode.get("data");

            if (dataNode != null) {
                return objectMapper.treeToValue(dataNode, Anime.class);
            }

            return null;
        } catch (Exception e) {
            log.error("Error fetching anime by id {}: {}", id, e.getMessage());
            return null;
        }
    }

    private List<Anime> parseAnimeList(String jsonResponse) throws JsonProcessingException {
        JsonNode jsonNode = objectMapper.readTree(jsonResponse);
        JsonNode dataArray = jsonNode.get("data");

        List<Anime> animeList = new ArrayList<>();

        if (dataArray != null && dataArray.isArray()) {
            for (JsonNode animeNode : dataArray) {
                Anime anime = objectMapper.treeToValue(animeNode, Anime.class);
                animeList.add(anime);
            }
        }

        return animeList;
    }
}
