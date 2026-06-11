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

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.service.SubCategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/subcategories")
public class SubCategoryController {

	@Autowired
	private SubCategoryService subCategoryService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SubCategoryResponseDTO create(@Valid @RequestBody CreateSubCategoryDTO dto) {
		return subCategoryService.create(dto);
	}

	@GetMapping
	public List<SubCategoryResponseDTO> findAll() {
		return subCategoryService.findAll();
	}

	@GetMapping("/{id}")
	public SubCategoryResponseDTO findById(@PathVariable String id) {
		return subCategoryService.findById(id);
	}

	@GetMapping("/category/{categoryId}")
	public List<SubCategoryResponseDTO> findByCategory(@PathVariable String categoryId) {
		return subCategoryService.findByCategory(categoryId);
	}

	@PutMapping("/{id}")
	public SubCategoryResponseDTO update(@PathVariable String id, @Valid @RequestBody UpdateSubCategoryDTO dto) {
		return subCategoryService.update(id, dto);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		subCategoryService.delete(id);
	}
}