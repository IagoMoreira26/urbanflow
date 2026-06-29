package com.iagomoreira.urbanflow.service.media;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;

@Service
public class MediaCommandService {

	@Autowired
	private MediaRepository mediaRepository;

	@Autowired
	private MediaValidationService validationService;

	private Media fromDTO(CreateMediaDTO dto) {

		Media media = new Media();

		media.setType(dto.getType());
		media.setUrl(dto.getUrl());
		media.setRequestId(dto.getRequestId());

		return media;
	}

	public MediaResponseDTO create(CreateMediaDTO dto) {

		validationService.validateRequest(dto.getRequestId());

		Media media = fromDTO(dto);

		media.setUploadedAt(LocalDateTime.now());

		media = mediaRepository.save(media);

		return new MediaResponseDTO(media);
	}
}