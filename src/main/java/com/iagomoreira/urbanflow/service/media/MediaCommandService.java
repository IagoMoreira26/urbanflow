package com.iagomoreira.urbanflow.service.media;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.mapper.MediaMapper;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@Service
public class MediaCommandService {

	private final MediaRepository mediaRepository;
	private final MediaValidationService mediaValidationService;
	private final MediaMapper mediaMapper;
	private final DateTimeProvider dateTimeProvider;

	public MediaCommandService(MediaRepository mediaRepository, MediaValidationService mediaValidationService,
			MediaMapper mediaMapper, DateTimeProvider dateTimeProvider) {
		this.mediaRepository = mediaRepository;
		this.mediaValidationService = mediaValidationService;
		this.mediaMapper = mediaMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public MediaResponseDTO create(CreateMediaDTO dto) {
		mediaValidationService.validateRequest(dto.getRequestId());
		Media media = mediaMapper.toEntity(dto);

		media.setUploadedAt(dateTimeProvider.now());

		media = mediaRepository.save(media);
		return mediaMapper.toResponse(media);
	}
}