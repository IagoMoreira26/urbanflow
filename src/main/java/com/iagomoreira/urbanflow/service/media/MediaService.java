package com.iagomoreira.urbanflow.service.media;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;

@Service
public class MediaService {

	private final MediaCommandService mediaCommandService;
	private final MediaQueryService mediaQueryService;

	public MediaService(MediaCommandService mediaCommandService, MediaQueryService mediaQueryService) {
		super();
		this.mediaCommandService = mediaCommandService;
		this.mediaQueryService = mediaQueryService;
	}

	public MediaResponseDTO create(CreateMediaDTO dto) {
		return mediaCommandService.create(dto);
	}

	public List<MediaResponseDTO> findAll() {
		return mediaQueryService.findAll();
	}

	public List<MediaResponseDTO> findByRequest(String requestId) {
		return mediaQueryService.findByRequest(requestId);
	}

	public MediaResponseDTO findById(String id) {
		return mediaQueryService.findById(id);
	}
}
