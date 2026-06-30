package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.service.media.MediaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/media")
public class MediaController {

	private final MediaService mediaService;

	public MediaController(MediaService mediaService) {
		super();
		this.mediaService = mediaService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MediaResponseDTO create(@Valid @RequestBody CreateMediaDTO dto) {
		return mediaService.create(dto);
	}

	@GetMapping
	public List<MediaResponseDTO> findAll() {
		return mediaService.findAll();
	}

	@GetMapping("/{id}")
	public MediaResponseDTO findById(@PathVariable String id) {
		return mediaService.findById(id);
	}

	@GetMapping("/request/{requestId}")
	public List<MediaResponseDTO> findByRequest(@PathVariable String requestId) {
		return mediaService.findByRequest(requestId);
	}
}