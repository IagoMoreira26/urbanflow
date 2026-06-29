package com.iagomoreira.urbanflow.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class CategoryValidationService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public Category validateCategoryExists(String id) {

		return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
	}

	public void validateDepartmentExists(String departmentId) {

		if (!departmentRepository.existsById(departmentId)) {
			throw new ResourceNotFoundException("Department not found");
		}
	}
}