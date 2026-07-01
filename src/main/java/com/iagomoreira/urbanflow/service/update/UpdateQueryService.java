package com.iagomoreira.urbanflow.service.update;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.mapper.UpdateMapper;
import com.iagomoreira.urbanflow.repository.UpdateRepository;

@Service
public class UpdateQueryService {

	private final UpdateRepository updateRepository;
	private final UpdateValidationService updateValidationService;
	private final UpdateMapper updateMapper;

	public UpdateQueryService(UpdateRepository updateRepository, UpdateValidationService updateValidationService,
			UpdateMapper updateMapper) {
		this.updateRepository = updateRepository;
		this.updateValidationService = updateValidationService;
		this.updateMapper = updateMapper;
	}

	public List<UpdateResponseDTO> findAll() {
		return updateRepository.findAll().stream().map(updateMapper::toResponse).toList();
	}

	public List<UpdateResponseDTO> findByRequest(String requestId) {
		updateValidationService.validateRequest(requestId);
		return updateRepository.findByRequestIdOrderByUpdatedAtAsc(requestId).stream().map(updateMapper::toResponse)
				.toList();
	}
}