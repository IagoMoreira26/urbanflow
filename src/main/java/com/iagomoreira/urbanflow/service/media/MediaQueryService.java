package com.iagomoreira.urbanflow.service.media;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.mapper.MediaMapper;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;

@Service
public class MediaQueryService {

	private final MediaRepository mediaRepository;
	private final MediaValidationService mediaValidationService;
	private final MediaMapper mediaMapper;

	public MediaQueryService(MediaRepository mediaRepository, MediaValidationService mediaValidationService,
			MediaMapper mediaMapper) {
		this.mediaRepository = mediaRepository;
		this.mediaValidationService = mediaValidationService;
		this.mediaMapper = mediaMapper;
	}

	public List<MediaResponseDTO> findAll() {
		return mediaRepository.findAll().stream().map(mediaMapper::toResponse).toList();
	}

	public List<MediaResponseDTO> findByRequest(String requestId) {
		mediaValidationService.validateRequest(requestId);
		return mediaRepository.findByRequestId(requestId).stream().map(mediaMapper::toResponse).toList();
	}

	public MediaResponseDTO findById(String id) {
		Media media = mediaValidationService.validateMediaExists(id);
		return mediaMapper.toResponse(media);
	}
}