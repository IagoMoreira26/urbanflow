package com.iagomoreira.urbanflow.service.update;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;

@Service
public class UpdateService {

	private final UpdateCommandService updateCommandService;
	private final UpdateQueryService updateQueryService;

	public UpdateService(UpdateCommandService updateCommandService, UpdateQueryService updateQueryService) {
		super();
		this.updateCommandService = updateCommandService;
		this.updateQueryService = updateQueryService;
	}

	public UpdateResponseDTO create(CreateUpdateDTO dto) {
		return updateCommandService.create(dto);
	}

	public List<UpdateResponseDTO> findAll() {
		return updateQueryService.findAll();
	}

	public List<UpdateResponseDTO> findByRequest(String requestId) {
		return updateQueryService.findByRequest(requestId);
	}
}
