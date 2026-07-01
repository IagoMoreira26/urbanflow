package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
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

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.service.subcategory.SubCategoryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/subcategories")
@Tag(name = "Subcategories", description = "Endpoints for managing subcategories")
public class SubCategoryController {

	private final SubCategoryService subCategoryService;

	public SubCategoryController(SubCategoryService subCategoryService) {
		this.subCategoryService = subCategoryService;
	}

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Create a new subcategory", description = "Creates a subcategory (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Subcategory created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<SubCategoryResponseDTO> create(@Valid @RequestBody CreateSubCategoryDTO dto) {
		SubCategoryResponseDTO response = subCategoryService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@Operation(summary = "List all subcategories", description = "Returns a list of all subcategories")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Subcategories retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))) })
	public ResponseEntity<List<SubCategoryResponseDTO>> findAll() {
		return ResponseEntity.ok(subCategoryService.findAll());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Get subcategory by ID", description = "Returns a single subcategory")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Subcategory found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content) })
	public ResponseEntity<SubCategoryResponseDTO> findById(
			@Parameter(description = "ID of the subcategory") @PathVariable String id) {
		return ResponseEntity.ok(subCategoryService.findById(id));
	}

	@GetMapping("/category/{categoryId}")
	@Operation(summary = "Get subcategories by category", description = "Returns all subcategories belonging to a category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Subcategories retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content) })
	public ResponseEntity<List<SubCategoryResponseDTO>> findByCategory(
			@Parameter(description = "Category ID") @PathVariable String categoryId) {
		return ResponseEntity.ok(subCategoryService.findByCategory(categoryId));
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Update a subcategory", description = "Updates an existing subcategory (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Subcategory updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SubCategoryResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input", content = @Content),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<SubCategoryResponseDTO> update(
			@Parameter(description = "ID of the subcategory to update") @PathVariable String id,
			@Valid @RequestBody UpdateSubCategoryDTO dto) {
		return ResponseEntity.ok(subCategoryService.update(id, dto));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Delete a subcategory", description = "Deletes a subcategory by ID (admin only)")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "Subcategory deleted", content = @Content),
			@ApiResponse(responseCode = "404", description = "Subcategory not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<Void> delete(
			@Parameter(description = "ID of the subcategory to delete") @PathVariable String id) {
		subCategoryService.delete(id);
		return ResponseEntity.noContent().build();
	}
}