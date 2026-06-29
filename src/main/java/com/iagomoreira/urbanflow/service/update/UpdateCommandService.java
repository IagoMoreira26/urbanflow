package com.iagomoreira.urbanflow.service.update;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UpdateRepository;

@Service
public class UpdateCommandService {

	@Autowired
	private UpdateRepository updateRepository;

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private UpdateValidationService validationService;

	private Update fromDTO(CreateUpdateDTO dto) {

		Update update = new Update();

		update.setStatus(dto.getStatus());
		update.setDescription(dto.getDescription());
		update.setRequestId(dto.getRequestId());

		return update;
	}

	public UpdateResponseDTO create(CreateUpdateDTO dto) {

		Request request = validationService.validateRequest(dto.getRequestId());

		Update update = fromDTO(dto);

		update.setUpdatedAt(LocalDateTime.now());

		update = updateRepository.save(update);

		request.setStatus(dto.getStatus());
		request.setUpdatedAt(LocalDateTime.now());

		requestRepository.save(request);

		return new UpdateResponseDTO(update);
	}
}