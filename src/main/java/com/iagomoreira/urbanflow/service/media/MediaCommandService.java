package com.iagomoreira.urbanflow.service.media;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.mapper.MediaMapper;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;

@Service
public class MediaCommandService {

	private final MediaRepository mediaRepository;
	private final MediaValidationService mediaValidationService;
	private final MediaMapper mediaMapper;

	public MediaCommandService(MediaRepository mediaRepository, MediaValidationService mediaValidationService,
			MediaMapper mediaMapper) {

		this.mediaRepository = mediaRepository;
		this.mediaValidationService = mediaValidationService;
		this.mediaMapper = mediaMapper;
	}

	public MediaResponseDTO create(CreateMediaDTO dto) {

		mediaValidationService.validateRequest(dto.getRequestId());
		Media media = mediaMapper.toEntity(dto);

		media.setUploadedAt(LocalDateTime.now());

		media = mediaRepository.save(media);
		return new MediaResponseDTO(media);
	}
}