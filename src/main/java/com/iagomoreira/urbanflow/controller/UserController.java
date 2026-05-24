package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<UserResponseDTO>> findAll() {

		List<UserResponseDTO> users = userService.findAll();

		return ResponseEntity.ok().body(users);
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserResponseDTO> findById(@PathVariable String id) {

		UserResponseDTO user = userService.findById(id);

		return ResponseEntity.ok().body(user);
	}

	@PostMapping
	public ResponseEntity<UserResponseDTO> createUser(@RequestBody @Valid CreateUserDTO dto) {

		UserResponseDTO response = userService.createUser(dto);

		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}
