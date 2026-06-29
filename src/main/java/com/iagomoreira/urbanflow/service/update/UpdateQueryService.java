package com.iagomoreira.urbanflow.service.update;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.repository.UpdateRepository;

@Service
public class UpdateQueryService {

	@Autowired
	private UpdateRepository updateRepository;

	@Autowired
	private UpdateValidationService validationService;

	public List<UpdateResponseDTO> findAll() {

		return updateRepository.findAll().stream().map(UpdateResponseDTO::new).toList();
	}

	public List<UpdateResponseDTO> findByRequest(String requestId) {

		validationService.validateRequest(requestId);

		return updateRepository.findByRequestIdOrderByUpdatedAtAsc(requestId).stream().map(UpdateResponseDTO::new)
				.toList();
	}
}