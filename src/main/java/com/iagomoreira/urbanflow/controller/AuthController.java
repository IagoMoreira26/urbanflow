package com.iagomoreira.urbanflow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.service.auth.AuthService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "Endpoints for authentication and current user info")
public class AuthController {

	private final AuthService authService;

	public AuthController(AuthService authService) {
		this.authService = authService;
	}

	@GetMapping("/me")
	@Operation(summary = "Get current authenticated user", description = "Returns the details of the logged-in user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<UserResponseDTO> me() {
		return ResponseEntity.ok(authService.getCurrentUser());
	}

	@PostMapping("/login")
	@Operation(summary = "Authenticate user", description = "Performs login and returns an access token")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Login successful", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LoginResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid credentials", content = @Content) })
	public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginDTO dto) {
		return ResponseEntity.ok(authService.login(dto));
	}
}