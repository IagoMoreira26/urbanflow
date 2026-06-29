package com.iagomoreira.urbanflow.service.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class FeedbackValidationService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private FeedbackRepository feedbackRepository;

	public void validateUserExists(String userId) {

		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("User not found");
		}
	}

	public Request validateRequestExists(String requestId) {

		return requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));
	}

	public void validateResolvedRequest(Request request) {

		if (request.getStatus() != RequestStatus.RESOLVED) {
			throw new BusinessException("Feedback can only be submitted for resolved requests");
		}
	}

	public void validateDuplicateFeedback(String userId, String requestId) {

		if (feedbackRepository.existsByUserIdAndRequestId(userId, requestId)) {
			throw new BusinessException("User has already submitted feedback for this request");
		}
	}
}