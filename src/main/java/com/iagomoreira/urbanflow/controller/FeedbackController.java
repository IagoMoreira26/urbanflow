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

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.service.feedback.FeedbackService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/feedbacks")
@Tag(name = "Feedbacks", description = "Endpoints for managing feedbacks on requests")
public class FeedbackController {

	private final FeedbackService feedbackService;

	public FeedbackController(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}

	@PostMapping
	@PreAuthorize("hasRole('CITIZEN')")
	@Operation(summary = "Create a new feedback", description = "Creates a feedback for a request (citizen only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Feedback created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<FeedbackResponseDTO> create(@Valid @RequestBody CreateFeedbackDTO dto) {
		FeedbackResponseDTO response = feedbackService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all feedbacks", description = "Returns a list of all feedbacks")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Feedbacks retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackResponseDTO.class))) })
	public ResponseEntity<List<FeedbackResponseDTO>> findAll() {
		return ResponseEntity.ok(feedbackService.findAll());
	}

	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get feedbacks by request ID", description = "Returns all feedbacks for a specific request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Feedbacks retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<FeedbackResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(feedbackService.findByRequest(requestId));
	}

	@GetMapping("/request/{requestId}/statistics")
	@Operation(summary = "Get feedback statistics for a request", description = "Returns aggregated statistics for a request")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FeedbackStatisticsDTO.class))),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<FeedbackStatisticsDTO> getStatistics(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(feedbackService.getStatistics(requestId));
	}
}