package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.service.update.UpdateService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/updates")
public class UpdateController {

	@Autowired
	private UpdateService updateService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UpdateResponseDTO create(@Valid @RequestBody CreateUpdateDTO dto) {
		return updateService.create(dto);
	}

	@GetMapping
	public List<UpdateResponseDTO> findAll() {
		return updateService.findAll();
	}

	@GetMapping("/request/{requestId}")
	public List<UpdateResponseDTO> findByRequest(@PathVariable String requestId) {
		return updateService.findByRequest(requestId);
	}
}