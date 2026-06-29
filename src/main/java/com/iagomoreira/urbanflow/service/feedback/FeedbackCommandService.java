package com.iagomoreira.urbanflow.service.feedback;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@Service
public class FeedbackCommandService {

	@Autowired
	private FeedbackRepository repository;

	@Autowired
	private FeedbackValidationService validationService;

	private Feedback fromDTO(CreateFeedbackDTO dto) {

		Feedback feedback = new Feedback();

		feedback.setRating(dto.getRating());
		feedback.setComment(dto.getComment());

		feedback.setUserId(dto.getUserId());
		feedback.setRequestId(dto.getRequestId());

		return feedback;
	}

	public FeedbackResponseDTO create(CreateFeedbackDTO dto) {

		validationService.validateUserExists(dto.getUserId());

		Request request = validationService.validateRequestExists(dto.getRequestId());

		validationService.validateResolvedRequest(request);

		validationService.validateDuplicateFeedback(dto.getUserId(), dto.getRequestId());

		Feedback feedback = fromDTO(dto);

		feedback.setCreatedAt(LocalDateTime.now());

		feedback = repository.save(feedback);

		return new FeedbackResponseDTO(feedback);
	}
}