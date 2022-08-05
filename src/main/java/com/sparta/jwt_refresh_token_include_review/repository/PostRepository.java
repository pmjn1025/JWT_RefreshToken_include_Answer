package com.sparta.jwt_refresh_token_include_review.repository;

import com.sparta.jwt_refresh_token_include_review.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
  List<Post> findAllByOrderByModifiedAtDesc();
}
