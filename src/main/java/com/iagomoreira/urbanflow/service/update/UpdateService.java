package com.iagomoreira.urbanflow.service.update;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;

@Service
public class UpdateService {

	@Autowired
	private UpdateCommandService updateCommandService;

	@Autowired
	private UpdateQueryService updateQueryService;

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
