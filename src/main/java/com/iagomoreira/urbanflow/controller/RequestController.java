package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
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
		return requestService.create(dto);
	}

	@GetMapping
	public List<RequestResponseDTO> findAll() {
		return requestService.findAll();
	}

	@GetMapping("/{id}")
	public RequestResponseDTO findById(@PathVariable String id) {
		return requestService.findById(id);
	}

	@GetMapping("/status/{status}")
	public List<RequestResponseDTO> findByStatus(@PathVariable RequestStatus status) {

		return requestService.findByStatus(status);
	}

	@GetMapping("/category/{categoryId}")
	public List<RequestResponseDTO> findByCategory(@PathVariable String categoryId) {

		return requestService.findByCategory(categoryId);
	}

	@GetMapping("/subcategory/{subCategoryId}")
	public List<RequestResponseDTO> findBySubCategory(@PathVariable String subCategoryId) {

		return requestService.findBySubCategory(subCategoryId);
	}

	@GetMapping("/user/{userId}")
	public List<RequestResponseDTO> findByUser(@PathVariable String userId) {

		return requestService.findByUser(userId);
	}

	@GetMapping("/search")
	public Page<RequestResponseDTO> search(

			@RequestParam(required = false) RequestStatus status,

			@RequestParam(required = false) String categoryId,

			@RequestParam(required = false) String subCategoryId,

			@RequestParam(required = false) String userId,

			@RequestParam(defaultValue = "0") int page,

			@RequestParam(defaultValue = "10") int size,

			@RequestParam(defaultValue = "createdAt") String sortBy,

			@RequestParam(defaultValue = "desc") String direction) {

		return requestService.search(status, categoryId, subCategoryId, userId, page, size, sortBy, direction);
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
