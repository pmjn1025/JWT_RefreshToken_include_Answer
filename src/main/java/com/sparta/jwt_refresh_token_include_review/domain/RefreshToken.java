package com.sparta.jwt_refresh_token_include_review.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "refresh_Token")
@Entity
public class RefreshToken extends Timestamped {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(nullable = false)
  private Long id;

  @JoinColumn(name = "member_id", nullable = false)
  @OneToOne(fetch = FetchType.LAZY)
  private Member member;

  @Column(nullable = false, name = "value")
  private String value;

  public void updateValue(String token) {
    this.value = token;
  }
}
