package com.iagomoreira.urbanflow.service.vote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@Service
public class VoteValidationService {

	@Autowired
	private VoteRepository voteRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RequestRepository requestRepository;

	public void validateUser(String userId) {

		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("User not found");
		}
	}

	public Request validateRequest(String requestId) {

		return requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));
	}

	public void validateDuplicateVote(String userId, String requestId) {

		if (voteRepository.existsByUserIdAndRequestId(userId, requestId)) {
			throw new BusinessException("User has already voted on this request");
		}
	}

	public void validateOwnVote(String userId, String requestId) {

		Request request = validateRequest(requestId);

		if (request.getUserId().equals(userId)) {
			throw new BusinessException("Users cannot vote on their own requests");
		}
	}
}