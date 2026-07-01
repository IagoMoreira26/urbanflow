package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@Service
public class FeedbackQueryService {

	private final FeedbackRepository feedbackRepository;
	private final FeedbackValidationService feedbackValidationService;
	private final FeedbackMapper feedbackMapper;

	public FeedbackQueryService(FeedbackRepository feedbackRepository,
			FeedbackValidationService feedbackValidationService, FeedbackMapper feedbackMapper) {
		this.feedbackRepository = feedbackRepository;
		this.feedbackValidationService = feedbackValidationService;
		this.feedbackMapper = feedbackMapper;
	}

	public List<FeedbackResponseDTO> findAll() {
		return feedbackRepository.findAll().stream().map(feedbackMapper::toResponse).toList();
	}

	public List<FeedbackResponseDTO> findByRequest(String requestId) {
		feedbackValidationService.validateRequestExists(requestId);
		return feedbackRepository.findByRequestId(requestId).stream().map(feedbackMapper::toResponse).toList();
	}
}