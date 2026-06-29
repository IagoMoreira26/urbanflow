package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.service.requesthistory.RequestHistoryService;

@RestController
@RequestMapping("/request-history")
public class RequestHistoryController {

	@Autowired
	private RequestHistoryService requestHistoryService;

	@PreAuthorize("hasAnyRole('ADMIN','PUBLIC_AGENT')")
	@GetMapping("/request/{requestId}")
	public ResponseEntity<List<RequestHistoryResponseDTO>> findByRequest(@PathVariable String requestId) {

		return ResponseEntity.ok(requestHistoryService.findByRequest(requestId));
	}
}