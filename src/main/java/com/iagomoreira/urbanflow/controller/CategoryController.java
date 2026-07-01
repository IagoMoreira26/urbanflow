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

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.service.category.CategoryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/categories")
@Tag(name = "Categories", description = "Endpoints for managing product categories")
public class CategoryController {

	private final CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Create a new category", description = "Creates a category (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Category created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input data", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<CategoryResponseDTO> create(@Valid @RequestBody CreateCategoryDTO dto) {
		CategoryResponseDTO response = categoryService.create(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	@PreAuthorize("isAuthenticated()")
	@Operation(summary = "List all categories", description = "Returns a list of all categories")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Categories retrieved successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryResponseDTO.class))),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<List<CategoryResponseDTO>> findAll() {
		List<CategoryResponseDTO> categories = categoryService.findAll();
		return ResponseEntity.ok(categories);
	}

	@GetMapping("/{id}")
	@PreAuthorize("isAuthenticated()")
	@Operation(summary = "Get category by ID", description = "Returns a single category")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Category found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryResponseDTO.class))),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content) })
	public ResponseEntity<CategoryResponseDTO> findById(
			@Parameter(description = "ID of the category to retrieve") @PathVariable String id) {
		CategoryResponseDTO response = categoryService.findById(id);
		return ResponseEntity.ok(response);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Update a category", description = "Updates an existing category (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Category updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CategoryResponseDTO.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input data", content = @Content),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<CategoryResponseDTO> update(
			@Parameter(description = "ID of the category to update") @PathVariable String id,
			@Valid @RequestBody UpdateCategoryDTO dto) {
		CategoryResponseDTO response = categoryService.update(id, dto);
		return ResponseEntity.ok(response);
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	@Operation(summary = "Delete a category", description = "Deletes a category by ID (admin only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Category deleted successfully", content = @Content),
			@ApiResponse(responseCode = "404", description = "Category not found", content = @Content),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<Void> delete(
			@Parameter(description = "ID of the category to delete") @PathVariable String id) {
		categoryService.delete(id);
		return ResponseEntity.noContent().build();
	}
}