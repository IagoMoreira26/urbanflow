package com.iagomoreira.urbanflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.service.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private AuthService authService;

	@GetMapping("/me")
	public ResponseEntity<UserResponseDTO> me() {

		return ResponseEntity.ok(authService.getCurrentUser());
	}

	@PostMapping("/login")
	public LoginResponseDTO login(@Valid @RequestBody LoginDTO dto) {

		return authService.login(dto);
	}
}