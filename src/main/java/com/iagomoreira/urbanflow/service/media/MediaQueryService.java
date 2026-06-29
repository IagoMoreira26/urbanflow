package com.iagomoreira.urbanflow.service.media;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.repository.MediaRepository;

@Service
public class MediaQueryService {

	@Autowired
	private MediaRepository mediaRepository;

	@Autowired
	private MediaValidationService validationService;

	public List<MediaResponseDTO> findAll() {

		return mediaRepository.findAll().stream().map(MediaResponseDTO::new).toList();
	}

	public List<MediaResponseDTO> findByRequest(String requestId) {

		validationService.validateRequest(requestId);

		return mediaRepository.findByRequestId(requestId).stream().map(MediaResponseDTO::new).toList();
	}

	public MediaResponseDTO findById(String id) {

		return new MediaResponseDTO(validationService.validateMediaExists(id));
	}
}