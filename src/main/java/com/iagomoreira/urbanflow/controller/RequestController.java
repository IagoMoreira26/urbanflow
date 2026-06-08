package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.service.RequestService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/requests")
public class RequestController {

	@Autowired
	private RequestService requestService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public RequestResponseDTO createRequest(@Valid @RequestBody CreateRequestDTO dto) {
		return requestService.createRequest(dto);
	}

	@GetMapping
	public List<RequestResponseDTO> findAll() {
		return requestService.findAll();
	}

	@GetMapping("/{id}")
	public RequestResponseDTO findById(@PathVariable String id) {
		return requestService.findById(id);
	}

	@PutMapping("/{id}")
	public RequestResponseDTO update(@PathVariable String id, @Valid @RequestBody UpdateRequestDTO dto) {

		return requestService.update(id, dto);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {

		requestService.delete(id);
	}
}
