package com.iagomoreira.urbanflow.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@Service
public class MediaService {

	@Autowired
	private MediaRepository mediaRepository;

	@Autowired
	private RequestRepository requestRepository;

	private Media fromDTO(CreateMediaDTO dto) {

		Media media = new Media();

		media.setType(dto.getType());
		media.setUrl(dto.getUrl());
		media.setRequestId(dto.getRequestId());

		return media;
	}

	public MediaResponseDTO create(CreateMediaDTO dto) {

		validateRequest(dto.getRequestId());

		Media media = fromDTO(dto);

		media.setUploadedAt(LocalDateTime.now());

		media = mediaRepository.save(media);

		return new MediaResponseDTO(media);
	}

	public List<MediaResponseDTO> findAll() {

		return mediaRepository.findAll().stream().map(MediaResponseDTO::new).collect(Collectors.toList());
	}

	public List<MediaResponseDTO> findByRequest(String requestId) {

		validateRequest(requestId);

		return mediaRepository.findByRequestId(requestId).stream().map(MediaResponseDTO::new)
				.collect(Collectors.toList());
	}

	public MediaResponseDTO findById(String id) {

		Media media = mediaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Media not found"));

		return new MediaResponseDTO(media);
	}

	private void validateRequest(String requestId) {

		if (!requestRepository.existsById(requestId)) {

			throw new ResourceNotFoundException("Request not found");
		}
	}
}
