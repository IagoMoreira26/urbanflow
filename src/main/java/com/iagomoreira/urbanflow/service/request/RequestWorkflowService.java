package com.iagomoreira.urbanflow.service.request;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestStatusDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.RequestHistory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.service.SecurityService;

@Service
public class RequestWorkflowService {

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private RequestValidationService requestValidationService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	private RequestHistoryRepository requestHistoryRepository;

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

		return new RequestResponseDTO(request);
	}
}
