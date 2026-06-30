package com.iagomoreira.urbanflow.service.update;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@Service
public class UpdateValidationService {

	private final RequestRepository requestRepository;

	public UpdateValidationService(RequestRepository requestRepository) {
		super();
		this.requestRepository = requestRepository;
	}

	public Request validateRequest(String requestId) {
		return requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));
	}
}