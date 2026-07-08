package com.iagomoreira.urbanflow.service.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@ExtendWith(MockitoExtension.class)
class TokenServiceTest {

	private TokenService tokenService;

	private static final String SECRET = "mySuperSecretKeyForJWTGeneration12345678901234567890";
	private static final Long EXPIRATION = 3600000L;

	@BeforeEach
	void setUp() throws Exception {
		tokenService = new TokenService();

		Field secretField = TokenService.class.getDeclaredField("secret");
		secretField.setAccessible(true);
		secretField.set(tokenService, SECRET);

		Field expirationField = TokenService.class.getDeclaredField("expiration");
		expirationField.setAccessible(true);
		expirationField.set(tokenService, EXPIRATION);
	}

	@Test
	void generateToken_shouldReturnValidToken() {
		String token = tokenService.generateToken("test@email.com", "ADMIN");
		assertNotNull(token);
		assertTrue(token.split("\\.").length == 3);
	}

	@Test
	void extractUsername_shouldReturnCorrectEmail() {
		String token = tokenService.generateToken("test@email.com", "ADMIN");
		String extracted = tokenService.extractUsername(token);
		assertNotNull(extracted);
		assertTrue(extracted.equals("test@email.com"));
	}

	@Test
	void isTokenValid_shouldReturnTrueForValidToken() {
		String token = tokenService.generateToken("test@email.com", "ADMIN");
		assertTrue(tokenService.isTokenValid(token));
	}

	@Test
	void isTokenValid_shouldReturnFalseForExpiredToken() {
		Date pastDate = new Date(System.currentTimeMillis() - 10000);
		String token = Jwts.builder().subject("test@email.com").claim("role", "ADMIN").issuedAt(new Date())
				.expiration(pastDate).signWith(tokenService.getSigningKey()).compact();

		assertFalse(tokenService.isTokenValid(token));
	}

	@Test
	void isTokenValid_shouldReturnFalseForExpiredToken_WithSetter() throws InterruptedException {
		tokenService.setExpirationForTest(1L);
		String token = tokenService.generateToken("test@email.com", "ADMIN");
		Thread.sleep(10);
		assertFalse(tokenService.isTokenValid(token));
	}

	@Test
	void extractClaims_shouldContainRoleClaim() {
		String token = tokenService.generateToken("test@email.com", "OPERATOR");
		Claims claims = Jwts.parser().verifyWith(tokenService.getSigningKey()).build().parseSignedClaims(token)
				.getPayload();
		assertTrue(claims.get("role").equals("OPERATOR"));
	}
}