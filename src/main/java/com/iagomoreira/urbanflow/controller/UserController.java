package com.iagomoreira.urbanflow.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.service.user.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
@Tag(name = "Users", description = "Endpoints for managing users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	@Operation(summary = "List all users", description = "Returns a list of all users")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Users retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))) })
	public ResponseEntity<List<UserResponseDTO>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get user by ID", description = "Returns a single user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })
	public ResponseEntity<UserResponseDTO> findById(
			@Parameter(description = "ID of the user") @PathVariable String id) {
		return ResponseEntity.ok(userService.findById(id));
	}

	@GetMapping("/operators/department/{departmentId}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Get operators by department", description = "Returns operators belonging to a department (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Operators retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<List<UserResponseDTO>> findOperatorsByDepartment(
			@Parameter(description = "Department ID") @PathVariable String departmentId) {
		return ResponseEntity.ok(userService.findOperatorsByDepartment(departmentId));
	}

	@PostMapping
	@Operation(summary = "Create a new user", description = "Creates a user (public registration)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "User created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content) })
	public ResponseEntity<UserResponseDTO> create(@Valid @RequestBody CreateUserDTO dto) {
		UserResponseDTO user = userService.create(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(user);
	}

	@PutMapping("/{id}")
	@Operation(summary = "Update a user", description = "Updates an existing user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })
	public ResponseEntity<UserResponseDTO> update(
			@Parameter(description = "ID of the user to update") @PathVariable String id,
			@Valid @RequestBody UpdateUserDTO dto) {
		return ResponseEntity.ok(userService.update(id, dto));
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Delete a user", description = "Deletes a user by ID")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "User deleted", content = @Content),
			@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })
	public ResponseEntity<Void> delete(@Parameter(description = "ID of the user to delete") @PathVariable String id) {
		userService.delete(id);
		return ResponseEntity.noContent().build();
	}
}