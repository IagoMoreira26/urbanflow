package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@Service
public class FeedbackQueryService {

	@Autowired
	private FeedbackRepository repository;

	@Autowired
	private FeedbackValidationService validationService;

	public List<FeedbackResponseDTO> findAll() {

		return repository.findAll().stream().map(FeedbackResponseDTO::new).toList();
	}

	public List<FeedbackResponseDTO> findByRequest(String requestId) {

		validationService.validateRequestExists(requestId);

		return repository.findByRequestId(requestId).stream().map(FeedbackResponseDTO::new).toList();
	}
}