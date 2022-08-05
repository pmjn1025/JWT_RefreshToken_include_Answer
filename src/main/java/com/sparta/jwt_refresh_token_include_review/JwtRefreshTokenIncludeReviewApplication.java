package com.sparta.jwt_refresh_token_include_review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JwtRefreshTokenIncludeReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtRefreshTokenIncludeReviewApplication.class, args);

		System.out.println("반가워요");


	}

}
