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

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.service.vote.VoteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/votes")
@Tag(name = "Votes", description = "Endpoints for managing votes on requests (citizen priority)")
public class VoteController {

	private final VoteService voteService;

	public VoteController(VoteService voteService) {
		this.voteService = voteService;
	}

	@PostMapping
	@PreAuthorize("hasRole('CITIZEN')")
	@Operation(summary = "Create a new vote", description = "Creates a vote for a request (citizen only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Vote created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = VoteResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<VoteResponseDTO> create(@Valid @RequestBody CreateVoteDTO dto) {
		VoteResponseDTO response = voteService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all votes", description = "Returns all votes")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Votes retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = VoteResponseDTO.class))) })
	public ResponseEntity<List<VoteResponseDTO>> findAll() {
		return ResponseEntity.ok(voteService.findAll());
	}

	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get votes by request ID", description = "Returns all votes for a specific request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Votes retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = VoteResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<VoteResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(voteService.findByRequest(requestId));
	}

	@GetMapping("/request/{requestId}/priority")
	@Operation(summary = "Get priority score for a request", description = "Returns the computed priority for a request based on votes")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Priority score retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestPriorityDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<RequestPriorityDTO> getRequestPriority(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(voteService.getRequestPriority(requestId));
	}
}