package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.service.requesthistory.RequestHistoryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/request-history")
@Tag(name = "Request History", description = "Endpoints for viewing request history")
public class RequestHistoryController {

	private final RequestHistoryService requestHistoryService;

	public RequestHistoryController(RequestHistoryService requestHistoryService) {
		this.requestHistoryService = requestHistoryService;
	}

	@PreAuthorize("hasAnyRole('ADMIN','OPERATOR')")
	@GetMapping("/request/{requestId}")
	@Operation(summary = "Get history of a request", description = "Returns the change history for a specific request (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "History retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RequestHistoryResponseDTO.class))),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content),
			@ApiResponse(responseCode = "404", description = "Request not found", content = @Content) })
	public ResponseEntity<List<RequestHistoryResponseDTO>> findByRequest(
			@Parameter(description = "ID of the request") @PathVariable String requestId) {
		return ResponseEntity.ok(requestHistoryService.findByRequest(requestId));
	}
}