package com.iagomoreira.urbanflow.service.feedback;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@Service
public class FeedbackCommandService {

	private final FeedbackRepository feedbackRepository;
	private final FeedbackValidationService feedbackValidationService;
	private final FeedbackMapper feedbackMapper;

	public FeedbackCommandService(FeedbackRepository feedbackRepository,
			FeedbackValidationService feedbackValidationService, FeedbackMapper feedbackMapper) {

		this.feedbackRepository = feedbackRepository;
		this.feedbackValidationService = feedbackValidationService;
		this.feedbackMapper = feedbackMapper;
	}

	public FeedbackResponseDTO create(CreateFeedbackDTO dto) {

		feedbackValidationService.validateUserExists(dto.getUserId());
		Request request = feedbackValidationService.validateRequestExists(dto.getRequestId());

		feedbackValidationService.validateResolvedRequest(request);
		feedbackValidationService.validateDuplicateFeedback(dto.getUserId(), dto.getRequestId());

		Feedback feedback = feedbackMapper.toEntity(dto);

		feedback.setCreatedAt(LocalDateTime.now());
		feedback = feedbackRepository.save(feedback);
		return new FeedbackResponseDTO(feedback);
	}
}