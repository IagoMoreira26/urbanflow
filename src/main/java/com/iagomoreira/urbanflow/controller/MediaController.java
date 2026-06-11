package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.service.MediaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/media")
public class MediaController {

	@Autowired
	private MediaService mediaService;

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