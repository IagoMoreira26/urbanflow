package com.iagomoreira.urbanflow.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UpdateRepository;

@Service
public class UpdateService {

	@Autowired
	private UpdateRepository updateRepository;

	@Autowired
	private RequestRepository requestRepository;

	private Update fromDTO(CreateUpdateDTO dto) {

		Update update = new Update();

		update.setStatus(dto.getStatus());
		update.setDescription(dto.getDescription());
		update.setRequestId(dto.getRequestId());

		return update;
	}

	public UpdateResponseDTO create(CreateUpdateDTO dto) {

		Request request = validateRequest(dto.getRequestId());

		Update update = fromDTO(dto);

		update.setUpdatedAt(LocalDateTime.now());

		update = updateRepository.save(update);

		request.setStatus(dto.getStatus());

		requestRepository.save(request);

		return new UpdateResponseDTO(update);
	}

	public List<UpdateResponseDTO> findAll() {

		return updateRepository.findAll().stream().map(UpdateResponseDTO::new).collect(Collectors.toList());
	}

	public List<UpdateResponseDTO> findByRequest(String requestId) {

		validateRequest(requestId);

		return updateRepository.findByRequestIdOrderByUpdatedAtAsc(requestId).stream().map(UpdateResponseDTO::new)
				.collect(Collectors.toList());
	}

	private Request validateRequest(String requestId) {

		return requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));
	}
}
