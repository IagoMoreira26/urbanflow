package com.iagomoreira.urbanflow.service.requesthistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;

@Service
public class RequestHistoryQueryService {

	@Autowired
	private RequestHistoryRepository requestHistoryRepository;

	@Autowired
	private RequestHistoryValidationService validationService;

	public List<RequestHistoryResponseDTO> findByRequest(String requestId) {

		validationService.validateRequest(requestId);

		return requestHistoryRepository.findByRequestIdOrderByChangedAtAsc(requestId).stream()
				.map(RequestHistoryResponseDTO::new).toList();
	}
}