package com.iagomoreira.urbanflow.service.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@Service
public class UpdateValidationService {

	@Autowired
	private RequestRepository requestRepository;

	public Request validateRequest(String requestId) {

		return requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));
	}
}