package org.shreyanshsinghks.animeapp.repository;


import org.shreyanshsinghks.animeapp.model.UserAnime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserAnimeRepository extends JpaRepository<UserAnime, Long> {
    List<UserAnime> findByUserIdOrderByUpdatedAtDesc(Long userId);
    List<UserAnime> findByUserIdAndStatus(Long userId, UserAnime.WatchStatus status);
    Optional<UserAnime> findByUserIdAndAnimeMalId(Long userId, Long animeMalId);
    Long countByUserIdAndStatus(Long userId, UserAnime.WatchStatus status);
}
