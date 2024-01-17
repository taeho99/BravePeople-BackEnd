package com.example.brave_people_backend.repository;

import com.example.brave_people_backend.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    // 사용자 기본키로 검색 (기본키가 문자열로 저장되어 있음)
    @Query("SELECT r FROM RefreshToken r WHERE r.updateAt = (SELECT MAX(t.updateAt) FROM RefreshToken t) and r.memberId = ?1")
    Optional<RefreshToken> findLatestRefreshToken(String memberId);

}
