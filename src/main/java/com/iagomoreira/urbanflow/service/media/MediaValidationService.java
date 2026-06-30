package com.iagomoreira.urbanflow.service.media;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@Service
public class MediaValidationService {

	private final MediaRepository mediaRepository;
	private final RequestRepository requestRepository;

	public MediaValidationService(MediaRepository mediaRepository, RequestRepository requestRepository) {
		super();
		this.mediaRepository = mediaRepository;
		this.requestRepository = requestRepository;
	}

	public void validateRequest(String requestId) {
		if (!requestRepository.existsById(requestId)) {
			throw new ResourceNotFoundException("Request not found");
		}
	}

	public Media validateMediaExists(String id) {
		return mediaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Media not found"));
	}
}