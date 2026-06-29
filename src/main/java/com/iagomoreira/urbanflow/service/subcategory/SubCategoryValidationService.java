package com.iagomoreira.urbanflow.service.subcategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryValidationService {

	@Autowired
	private SubCategoryRepository repository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public SubCategory validateSubCategoryExists(String id) {

		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));
	}

	public void validateCategoryExists(String categoryId) {

		if (!categoryRepository.existsById(categoryId)) {
			throw new ResourceNotFoundException("Category not found");
		}
	}

	public void validateDepartmentExists(String departmentId) {

		if (!departmentRepository.existsById(departmentId)) {
			throw new ResourceNotFoundException("Department not found");
		}
	}
}