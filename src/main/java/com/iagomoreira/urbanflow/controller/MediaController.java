package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.service.media.MediaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/media")
@Tag(name = "Media", description = "Endpoints for managing media files attached to requests")
public class MediaController {

	private final MediaService mediaService;

	public MediaController(MediaService mediaService) {
		this.mediaService = mediaService;
	}

	@PostMapping
	@Operation(summary = "Create a new media entry", description = "Creates a media record (file reference)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Media created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MediaResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content) })
	public ResponseEntity<MediaResponseDTO> create(@Valid @RequestBody CreateMediaDTO dto) {
		MediaResponseDTO response = mediaService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all media", description = "Returns all media records")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Media retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MediaResponseDTO.class))) })
	public ResponseEntity<List<MediaResponseDTO>> findAll() {
		return ResponseEntity.ok(mediaService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get media by ID", description = "Returns a single media record")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Media found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MediaResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Media not found", content = @Content) })
	public ResponseEntity<MediaResponseDTO> findById(
			@Parameter(description = "ID of the media") @PathVariable String id) {
		return ResponseEntity.ok(mediaService.findById(id));
	}

	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get media by request ID", description = "Returns all media for a specific request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Media retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MediaResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<MediaResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(mediaService.findByRequest(requestId));
	}
}