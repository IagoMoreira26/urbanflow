package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.service.category.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CategoryResponseDTO create(@Valid @RequestBody CreateCategoryDTO dto) {
		return categoryService.create(dto);
	}

	@PreAuthorize("isAuthenticated()")
	@GetMapping
	public List<CategoryResponseDTO> findAll() {
		return categoryService.findAll();
	}

	@PreAuthorize("isAuthenticated()")
	@GetMapping("/{id}")
	public CategoryResponseDTO findById(@PathVariable String id) {
		return categoryService.findById(id);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/{id}")
	public CategoryResponseDTO update(@PathVariable String id, @Valid @RequestBody UpdateCategoryDTO dto) {
		return categoryService.update(id, dto);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		categoryService.delete(id);
	}
}
