package com.iagomoreira.urbanflow.service.requesthistory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;

@Service
public class RequestHistoryService {

	@Autowired
	private RequestHistoryQueryService requestQueryService;

	public List<RequestHistoryResponseDTO> findByRequest(String requestId) {
		return requestQueryService.findByRequest(requestId);
	}
}
