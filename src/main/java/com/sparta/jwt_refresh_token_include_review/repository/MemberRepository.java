package com.sparta.jwt_refresh_token_include_review.repository;

import com.sparta.jwt_refresh_token_include_review.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

  Optional<Member> findById(Long id);
  Optional<Member> findByNickname(String nickname);
}
