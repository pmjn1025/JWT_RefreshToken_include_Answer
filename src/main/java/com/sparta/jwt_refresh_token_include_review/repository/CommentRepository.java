package com.sparta.jwt_refresh_token_include_review.repository;


import com.sparta.jwt_refresh_token_include_review.domain.Comment;
import com.sparta.jwt_refresh_token_include_review.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
  List<Comment> findAllByPost(Post post);
}
