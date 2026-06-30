package com.iagomoreira.urbanflow.service.media;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.repository.MediaRepository;

@Service
public class MediaQueryService {

	private final MediaRepository mediaRepository;
	private final MediaValidationService mediaValidationService;

	public MediaQueryService(MediaRepository mediaRepository, MediaValidationService mediaValidationService) {
		super();
		this.mediaRepository = mediaRepository;
		this.mediaValidationService = mediaValidationService;
	}

	public List<MediaResponseDTO> findAll() {
		return mediaRepository.findAll().stream().map(MediaResponseDTO::new).toList();
	}

	public List<MediaResponseDTO> findByRequest(String requestId) {
		mediaValidationService.validateRequest(requestId);
		return mediaRepository.findByRequestId(requestId).stream().map(MediaResponseDTO::new).toList();
	}

	public MediaResponseDTO findById(String id) {
		return new MediaResponseDTO(mediaValidationService.validateMediaExists(id));
	}
}