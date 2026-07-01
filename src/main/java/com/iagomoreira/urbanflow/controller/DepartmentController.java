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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/departments")
@Tag(name = "Departments", description = "Endpoints for managing departments")
public class DepartmentController {

	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Create a new department", description = "Creates a department (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Department created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<DepartmentResponseDTO> create(@Valid @RequestBody CreateDepartmentDTO dto) {
		DepartmentResponseDTO department = departmentService.create(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(department.getId())
				.toUri();
		return ResponseEntity.created(uri).body(department);
	}

	@GetMapping
	@Operation(summary = "List all departments", description = "Returns a list of all departments")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Departments retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentResponseDTO.class))) })
	public ResponseEntity<List<DepartmentResponseDTO>> findAll() {
		return ResponseEntity.ok(departmentService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get department by ID", description = "Returns a single department")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Department found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Department not found", content = @Content) })
	public ResponseEntity<DepartmentResponseDTO> findById(
			@Parameter(description = "ID of the department") @PathVariable String id) {
		return ResponseEntity.ok(departmentService.findById(id));
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Update a department", description = "Updates an existing department (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Department updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "404", description = "Department not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<DepartmentResponseDTO> update(
			@Parameter(description = "ID of the department to update") @PathVariable String id,
			@Valid @RequestBody UpdateDepartmentDTO dto) {
		return ResponseEntity.ok(departmentService.update(id, dto));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Delete a department", description = "Deletes a department by ID (admin only)")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "Department deleted", content = @Content),
			@ApiResponse(responseCode = "404", description = "Department not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<Void> delete(
			@Parameter(description = "ID of the department to delete") @PathVariable String id) {
		departmentService.delete(id);
		return ResponseEntity.noContent().build();
	}
}