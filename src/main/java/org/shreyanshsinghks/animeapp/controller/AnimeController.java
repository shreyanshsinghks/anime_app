package org.shreyanshsinghks.animeapp.controller;


import lombok.RequiredArgsConstructor;
import org.shreyanshsinghks.animeapp.model.Anime;
import org.shreyanshsinghks.animeapp.service.AnimeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AnimeController {

    private final AnimeService animeService;

    @GetMapping("/")
    public String home(Model model) {
        List<Anime> topAnime = animeService.getTopAnime();
        model.addAttribute("topAnime", topAnime);
        return "index";
    }

    @GetMapping("/search")
    public String searchAnime(@RequestParam("q") String query, Model model) {
        List<Anime> searchResults = animeService.searchAnime(query);
        model.addAttribute("animeList", searchResults);
        model.addAttribute("query", query);
        return "anime-list";
    }

    @GetMapping("/anime/{id}")
    public String animeDetail(@PathVariable Long id, Model model) {
        Anime anime = animeService.getAnimeById(id);
        model.addAttribute("anime", anime);
        return "anime-detail";
    }

    // REST API endpoints
    @RestController
    @RequestMapping("/api")
    @RequiredArgsConstructor
    public static class AnimeRestController {

        private final AnimeService animeService;

        @GetMapping("/anime/search")
        public List<Anime> searchAnimeApi(@RequestParam("q") String query) {
            return animeService.searchAnime(query);
        }

        @GetMapping("/anime/top")
        public List<Anime> getTopAnimeApi() {
            return animeService.getTopAnime();
        }

        @GetMapping("/anime/{id}")
        public Anime getAnimeByIdApi(@PathVariable Long id) {
            return animeService.getAnimeById(id);
        }
    }
}
