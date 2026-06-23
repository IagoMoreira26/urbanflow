package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.service.RequestHistoryService;

@RestController
@RequestMapping("/request-history")
public class RequestHistoryController {

	@Autowired
	private RequestHistoryService requestHistoryService;

	@GetMapping("/request/{requestId}")
	public ResponseEntity<List<RequestHistoryResponseDTO>> findByRequest(@PathVariable String requestId) {

		return ResponseEntity.ok(requestHistoryService.findByRequest(requestId));
	}
}