package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.service.legislation.LegislationService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/legislations")
@Tag(name = "Legislations", description = "Endpoints for querying legislation documents")
public class LegislationController {

	private final LegislationService legislationService;

	public LegislationController(LegislationService legislationService) {
		this.legislationService = legislationService;
	}

	@GetMapping
	@Operation(summary = "List all legislations", description = "Returns all legislation documents")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Legislations retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LegislationResponseDTO.class))) })
	public ResponseEntity<List<LegislationResponseDTO>> findAll() {
		return ResponseEntity.ok(legislationService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get legislation by ID", description = "Returns a single legislation document")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Legislation found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LegislationResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Legislation not found", content = @Content) })
	public ResponseEntity<LegislationResponseDTO> findById(
			@Parameter(description = "ID of the legislation") @PathVariable String id) {
		return ResponseEntity.ok(legislationService.findById(id));
	}

	@GetMapping("/search")
	@Operation(summary = "Search legislations by keyword", description = "Returns legislations matching a keyword")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Search results", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LegislationResponseDTO.class))) })
	public ResponseEntity<List<LegislationResponseDTO>> findByKeyword(
			@Parameter(description = "Keyword to search") @RequestParam String keyword) {
		return ResponseEntity.ok(legislationService.findByKeyword(keyword));
	}
}