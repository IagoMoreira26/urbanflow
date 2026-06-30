package com.iagomoreira.urbanflow.service.requesthistory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;

@Service
public class RequestHistoryQueryService {

	private final RequestHistoryRepository requestHistoryRepository;
	private final RequestHistoryValidationService requestHistoryValidationService;

	public RequestHistoryQueryService(RequestHistoryRepository requestHistoryRepository,
			RequestHistoryValidationService requestHistoryValidationService) {
		super();
		this.requestHistoryRepository = requestHistoryRepository;
		this.requestHistoryValidationService = requestHistoryValidationService;
	}

	public List<RequestHistoryResponseDTO> findByRequest(String requestId) {

		requestHistoryValidationService.validateRequest(requestId);
		return requestHistoryRepository.findByRequestIdOrderByChangedAtAsc(requestId).stream()
				.map(RequestHistoryResponseDTO::new).toList();
	}
}