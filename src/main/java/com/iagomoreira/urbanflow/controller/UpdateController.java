package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.service.update.UpdateService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/updates")
@Tag(name = "Updates", description = "Endpoints for managing status updates on requests")
public class UpdateController {

	private final UpdateService updateService;

	public UpdateController(UpdateService updateService) {
		this.updateService = updateService;
	}

	@PostMapping
	@PreAuthorize("hasAnyRole('ADMIN','OPERATOR')")
	@Operation(summary = "Create a new update", description = "Creates a status update for a request (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Update created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UpdateResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<UpdateResponseDTO> create(@Valid @RequestBody CreateUpdateDTO dto) {
		UpdateResponseDTO response = updateService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all updates", description = "Returns all updates")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Updates retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UpdateResponseDTO.class))) })
	public ResponseEntity<List<UpdateResponseDTO>> findAll() {
		return ResponseEntity.ok(updateService.findAll());
	}

	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get updates by request ID", description = "Returns all updates for a specific request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Updates retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UpdateResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<UpdateResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(updateService.findByRequest(requestId));
	}
}