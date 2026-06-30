package com.iagomoreira.urbanflow.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.service.department.DepartmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<DepartmentResponseDTO> create(@Valid @RequestBody CreateDepartmentDTO dto) {

		DepartmentResponseDTO department = departmentService.create(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(department.getId())
				.toUri();

		return ResponseEntity.created(uri).body(department);
	}

	@GetMapping
	public ResponseEntity<List<DepartmentResponseDTO>> findAll() {
		return ResponseEntity.ok(departmentService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<DepartmentResponseDTO> findById(@PathVariable String id) {
		return ResponseEntity.ok(departmentService.findById(id));
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<DepartmentResponseDTO> update(@PathVariable String id,
			@Valid @RequestBody UpdateDepartmentDTO dto) {
		return ResponseEntity.ok(departmentService.update(id, dto));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		departmentService.delete(id);
		return ResponseEntity.noContent().build();
	}
}