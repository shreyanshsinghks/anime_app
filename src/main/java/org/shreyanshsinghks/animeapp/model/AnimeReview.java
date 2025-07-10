package org.shreyanshsinghks.animeapp.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "anime_reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimeReview {

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

    @Column(name = "review_text", length = 2000)
    private String reviewText;

    @Column(name = "rating")
    private Integer rating; // 1-10

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
