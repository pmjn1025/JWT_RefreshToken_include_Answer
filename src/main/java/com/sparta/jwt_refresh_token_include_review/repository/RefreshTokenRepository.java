package com.sparta.jwt_refresh_token_include_review.repository;



import com.sparta.jwt_refresh_token_include_review.domain.Member;
import com.sparta.jwt_refresh_token_include_review.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
  Optional<RefreshToken> findByMember(Member member);
}
