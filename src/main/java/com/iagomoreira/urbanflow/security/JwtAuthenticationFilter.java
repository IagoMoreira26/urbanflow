package com.iagomoreira.urbanflow.security;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.iagomoreira.urbanflow.service.JWTService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	private final JWTService jwtService;
	private final UserDetailsService userDetailsService;

	public JwtAuthenticationFilter(JWTService jwtService, UserDetailsService userDetailsService) {
		super();
		this.jwtService = jwtService;
		this.userDetailsService = userDetailsService;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			FilterChain filterChain) throws ServletException, IOException {

		String authHeader = httpServletRequest.getHeader("Authorization");

		if (authHeader == null || !authHeader.startsWith("Bearer ")) {

			filterChain.doFilter(httpServletRequest, httpServletResponse);
			return;
		}

		String token = authHeader.substring(7);

		String email = jwtService.extractUsername(token);

		if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {

			UserDetails userDetails = userDetailsService.loadUserByUsername(email);

			if (jwtService.isTokenValid(token)) {

				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());

				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));

				SecurityContextHolder.getContext().setAuthentication(authentication);
			}
		}

		filterChain.doFilter(httpServletRequest, httpServletResponse);
	}
}