package org.shreyanshsinghks.animeapp.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Anime {
    @JsonProperty("mal_id")
    private Long malId;

    private String url;
    private Images images;
    private Trailer trailer;
    private Boolean approved;
    private List<Title> titles;

    private String title;

    @JsonProperty("title_english")
    private String titleEnglish;

    @JsonProperty("title_japanese")
    private String titleJapanese;

    @JsonProperty("title_synonyms")
    private List<String> titleSynonyms;

    private String type;
    private String source;
    private Integer episodes;
    private String status;
    private Boolean airing;
    private Aired aired;
    private String duration;
    private String rating;
    private Double score;

    @JsonProperty("scored_by")
    private Integer scoredBy;

    private Integer rank;
    private Integer popularity;
    private Integer members;
    private Integer favorites;
    private String synopsis;
    private String background;
    private String season;
    private Integer year;
    private Broadcast broadcast;

    private List<Producer> producers;
    private List<Producer> licensors;
    private List<Producer> studios;
    private List<Genre> genres;

    @JsonProperty("explicit_genres")
    private List<Genre> explicitGenres;

    private List<Genre> themes;
    private List<Genre> demographics;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Images {
        private ImageSet jpg;
        private ImageSet webp;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImageSet {
        @JsonProperty("image_url")
        private String imageUrl;

        @JsonProperty("small_image_url")
        private String smallImageUrl;

        @JsonProperty("large_image_url")
        private String largeImageUrl;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Trailer {
        @JsonProperty("youtube_id")
        private String youtubeId;

        private String url;

        @JsonProperty("embed_url")
        private String embedUrl;

        private TrailerImages images;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TrailerImages {
        @JsonProperty("image_url")
        private String imageUrl;

        @JsonProperty("small_image_url")
        private String smallImageUrl;

        @JsonProperty("medium_image_url")
        private String mediumImageUrl;

        @JsonProperty("large_image_url")
        private String largeImageUrl;

        @JsonProperty("maximum_image_url")
        private String maximumImageUrl;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Title {
        private String type;
        private String title;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Aired {
        private String from;
        private String to;
        private AiredProp prop;
        private String string;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AiredProp {
        private DateProp from;
        private DateProp to;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DateProp {
        private Integer day;
        private Integer month;
        private Integer year;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Broadcast {
        private String day;
        private String time;
        private String timezone;
        private String string;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Producer {
        @JsonProperty("mal_id")
        private Long malId;

        private String type;
        private String name;
        private String url;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Genre {
        @JsonProperty("mal_id")
        private Long malId;

        private String type;
        private String name;
        private String url;
    }
}
