package com.iagomoreira.urbanflow.service.requesthistory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;

@Service
public class RequestHistoryService {

	private final RequestHistoryQueryService requestHistoryQueryService;

	public RequestHistoryService(RequestHistoryQueryService requestHistoryQueryService) {
		super();
		this.requestHistoryQueryService = requestHistoryQueryService;
	}

	public List<RequestHistoryResponseDTO> findByRequest(String requestId) {
		return requestHistoryQueryService.findByRequest(requestId);
	}
}
