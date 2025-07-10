package org.shreyanshsinghks.animeapp.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_anime")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAnime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "anime_mal_id")
    private Long animeMalId;

    @Column(name = "anime_title")
    private String animeTitle;

    @Column(name = "anime_image_url")
    private String animeImageUrl;

    @Enumerated(EnumType.STRING)
    private WatchStatus status;

    @Column(name = "episodes_watched")
    private Integer episodesWatched = 0;

    @Column(name = "total_episodes")
    private Integer totalEpisodes;

    @Column(name = "user_rating")
    private Integer userRating; // 1-10

    @Column(name = "added_at")
    private LocalDateTime addedAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        addedAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public enum WatchStatus {
        WATCHING, COMPLETED, PLAN_TO_WATCH, DROPPED, ON_HOLD
    }
}
