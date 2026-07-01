package com.iagomoreira.urbanflow.service.request;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.RequestHistory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class RequestWorkflowService {

	private final RequestRepository requestRepository;
	private final RequestValidationService requestValidationService;
	private final SecurityService securityService;
	private final RequestHistoryRepository requestHistoryRepository;
	private final RequestMapper requestMapper;

	public RequestWorkflowService(RequestRepository requestRepository,
			RequestValidationService requestValidationService, SecurityService securityService,
			RequestHistoryRepository requestHistoryRepository, RequestMapper requestMapper) {
		super();
		this.requestRepository = requestRepository;
		this.requestValidationService = requestValidationService;
		this.securityService = securityService;
		this.requestHistoryRepository = requestHistoryRepository;
		this.requestMapper = requestMapper;
	}

	public RequestResponseDTO updateStatus(String id, UpdateRequestStatusDTO dto) {

		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);
		requestValidationService.validateStatusTransition(request.getStatus(), dto.getStatus());

		RequestStatus oldStatus = request.getStatus();

		request.setStatus(dto.getStatus());
		request.setUpdatedAt(LocalDateTime.now());

		RequestHistory history = new RequestHistory();
		history.setRequestId(request.getId());
		history.setOldStatus(oldStatus);
		history.setNewStatus(dto.getStatus());
		history.setChangedBy(securityService.getAuthenticatedEmail());
		history.setNote(dto.getNote());
		history.setChangedAt(LocalDateTime.now());

		requestHistoryRepository.save(history);
		request = requestRepository.save(request);

		return requestMapper.toResponse(request);
	}
}