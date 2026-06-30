package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@Service
public class FeedbackQueryService {

	private final FeedbackRepository feedbackRepository;
	private final FeedbackValidationService feedbackValidationService;

	public FeedbackQueryService(FeedbackRepository feedbackRepository,
			FeedbackValidationService feedbackValidationService) {
		super();
		this.feedbackRepository = feedbackRepository;
		this.feedbackValidationService = feedbackValidationService;
	}

	public List<FeedbackResponseDTO> findAll() {
		return feedbackRepository.findAll().stream().map(FeedbackResponseDTO::new).toList();
	}

	public List<FeedbackResponseDTO> findByRequest(String requestId) {
		feedbackValidationService.validateRequestExists(requestId);
		return feedbackRepository.findByRequestId(requestId).stream().map(FeedbackResponseDTO::new).toList();
	}
}