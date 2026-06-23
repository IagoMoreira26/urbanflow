package com.iagomoreira.urbanflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@Service
public class RequestHistoryService {

	@Autowired
	private RequestHistoryRepository requestHistoryRepository;

	@Autowired
	private RequestRepository requestRepository;

	public List<RequestHistoryResponseDTO> findByRequest(String requestId) {

		if (!requestRepository.existsById(requestId)) {
			throw new ResourceNotFoundException("Request not found");
		}

		return requestHistoryRepository.findByRequestIdOrderByChangedAtAsc(requestId).stream()
				.map(RequestHistoryResponseDTO::new).toList();
	}
}