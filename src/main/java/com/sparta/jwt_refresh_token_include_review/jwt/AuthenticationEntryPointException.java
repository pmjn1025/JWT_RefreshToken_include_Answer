package com.sparta.jwt_refresh_token_include_review.jwt;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.jwt_refresh_token_include_review.controller.response.ResponseDto;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthenticationEntryPointException implements
    AuthenticationEntryPoint {

  @Override
  public void commence(HttpServletRequest request, HttpServletResponse response,
      AuthenticationException authException) throws IOException {
    response.setContentType("application/json;charset=UTF-8");
    response.getWriter().println(
        new ObjectMapper().writeValueAsString(
            ResponseDto.fail("BAD_REQUEST", "로그인이 필요합니다.")
        )
    );
    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
  }
}
