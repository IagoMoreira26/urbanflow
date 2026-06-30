package com.iagomoreira.urbanflow.service.requesthistory;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@Service
public class RequestHistoryValidationService {

	private final RequestRepository requestRepository;

	public RequestHistoryValidationService(RequestRepository requestRepository) {
		super();
		this.requestRepository = requestRepository;
	}

	public void validateRequest(String requestId) {
		if (!requestRepository.existsById(requestId)) {
			throw new ResourceNotFoundException("Request not found");
		}
	}
}