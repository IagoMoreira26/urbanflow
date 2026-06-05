package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.service.FeedbackService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public FeedbackResponseDTO create(@Valid @RequestBody CreateFeedbackDTO dto) {

		return feedbackService.create(dto);
	}

	@GetMapping
	public List<FeedbackResponseDTO> findAll() {

		return feedbackService.findAll();
	}

	@GetMapping("/request/{requestId}")
	public List<FeedbackResponseDTO> findByRequest(@PathVariable String requestId) {

		return feedbackService.findByRequest(requestId);
	}

	@GetMapping("/request/{requestId}/statistics")
	public FeedbackStatisticsDTO getStatistics(@PathVariable String requestId) {

		return feedbackService.getStatistics(requestId);
	}
}
