package com.iagomoreira.urbanflow.service.feedback;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class FeedbackCommandService {

	private final FeedbackRepository feedbackRepository;
	private final FeedbackValidationService feedbackValidationService;
	private final FeedbackMapper feedbackMapper;
	private final DateTimeProvider dateTimeProvider;
	private final SecurityService securityService;

	public FeedbackCommandService(FeedbackRepository feedbackRepository,
			FeedbackValidationService feedbackValidationService, FeedbackMapper feedbackMapper,
			DateTimeProvider dateTimeProvider, SecurityService securityService) {
		this.feedbackRepository = feedbackRepository;
		this.feedbackValidationService = feedbackValidationService;
		this.feedbackMapper = feedbackMapper;
		this.dateTimeProvider = dateTimeProvider;
		this.securityService = securityService;
	}

	public FeedbackResponseDTO create(CreateFeedbackDTO dto) {

		String userId = securityService.getAuthenticatedUserId();
		feedbackValidationService.validateUserExists(userId);

		Request request = feedbackValidationService.validateRequestExists(dto.getRequestId());

		feedbackValidationService.validateResolvedRequest(request);
		feedbackValidationService.validateDuplicateFeedback(userId, dto.getRequestId());

		Feedback feedback = feedbackMapper.toEntity(dto);

		feedback.setUserId(userId);
		feedback.setCreatedAt(dateTimeProvider.now());

		feedback = feedbackRepository.save(feedback);
		return feedbackMapper.toResponse(feedback);
	}
}