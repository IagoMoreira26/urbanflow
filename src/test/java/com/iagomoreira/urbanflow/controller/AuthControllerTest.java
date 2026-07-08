package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.service.auth.AuthService;
import com.iagomoreira.urbanflow.service.auth.TokenService;

@WebMvcTest(AuthController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class AuthControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private AuthService authService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private LoginDTO loginDTO;
	private LoginResponseDTO loginResponseDTO;
	private UserResponseDTO userResponseDTO;
	private final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
	private final String userId = "user-123";
	private final String email = "maria.patos@example.com";

	@BeforeEach
	void setUp() {
		loginDTO = new LoginDTO();
		loginDTO.setEmail("maria.patos@example.com");
		loginDTO.setPassword("patos123");

		loginResponseDTO = new LoginResponseDTO(token);

		userResponseDTO = new UserResponseDTO();
		userResponseDTO.setId(userId);
		userResponseDTO.setName("Maria Patos");
		userResponseDTO.setEmail(email);
		userResponseDTO.setRole(Role.CITIZEN);
		userResponseDTO.setDepartmentId(null);
		userResponseDTO.setAddress(null);
		userResponseDTO.setCreatedAt(LocalDateTime.now().minusDays(1));
		userResponseDTO.setUpdatedAt(LocalDateTime.now());
	}

	@Test
	void shouldLogin() throws Exception {
		when(authService.login(any(LoginDTO.class))).thenReturn(loginResponseDTO);

		mockMvc.perform(
				post("/auth/login").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(loginDTO)))
				.andExpect(status().isOk()).andExpect(jsonPath("$.token").value(token));

		verify(authService).login(any(LoginDTO.class));
	}

	@Test
	void shouldGetCurrentUser() throws Exception {
		when(authService.getCurrentUser()).thenReturn(userResponseDTO);

		mockMvc.perform(get("/auth/me")).andExpect(status().isOk()).andExpect(jsonPath("$.id").value(userId))
				.andExpect(jsonPath("$.name").value("Maria Patos")).andExpect(jsonPath("$.email").value(email))
				.andExpect(jsonPath("$.role").value("CITIZEN"));

		verify(authService).getCurrentUser();
	}
}