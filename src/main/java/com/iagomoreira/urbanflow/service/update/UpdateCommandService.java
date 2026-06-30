package com.iagomoreira.urbanflow.service.update;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.mapper.UpdateMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UpdateRepository;

@Service
public class UpdateCommandService {

	private final UpdateRepository updateRepository;
	private final RequestRepository requestRepository;
	private final UpdateValidationService updateValidationService;
	private final UpdateMapper updateMapper;

	public UpdateCommandService(UpdateRepository updateRepository, RequestRepository requestRepository,
			UpdateValidationService updateValidationService, UpdateMapper updateMapper) {

		this.updateRepository = updateRepository;
		this.requestRepository = requestRepository;
		this.updateValidationService = updateValidationService;
		this.updateMapper = updateMapper;
	}

	public UpdateResponseDTO create(CreateUpdateDTO dto) {

		Request request = updateValidationService.validateRequest(dto.getRequestId());
		Update update = updateMapper.toEntity(dto);

		update.setUpdatedAt(LocalDateTime.now());
		update = updateRepository.save(update);

		request.setStatus(dto.getStatus());
		request.setUpdatedAt(LocalDateTime.now());

		requestRepository.save(request);
		return new UpdateResponseDTO(update);
	}
}