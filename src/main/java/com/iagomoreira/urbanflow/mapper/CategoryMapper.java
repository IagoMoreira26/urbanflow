package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.model.Category;

@Component
public class CategoryMapper {

	public Category toEntity(CreateCategoryDTO dto) {
		Category category = new Category();
		category.setName(dto.getName());
		category.setDescription(dto.getDescription());
		category.setDepartmentId(dto.getDepartmentId());
		return category;
	}

	public void updateEntity(Category category, UpdateCategoryDTO dto) {
		category.setName(dto.getName());
		category.setDescription(dto.getDescription());
		category.setDepartmentId(dto.getDepartmentId());
	}

	public CategoryResponseDTO toResponse(Category category) {
		CategoryResponseDTO dto = new CategoryResponseDTO();
		dto.setId(category.getId());
		dto.setName(category.getName());
		dto.setDescription(category.getDescription());
		dto.setDepartmentId(category.getDepartmentId());
		return dto;
	}

	public CategoryStatisticsDTO toStatisticsResponse(String categoryId, String categoryName, Integer totalRequests,
			Integer receivedRequests, Integer inProgressRequests, Integer resolvedRequests, Integer cancelledRequests,
			Double resolutionRate) {
		CategoryStatisticsDTO dto = new CategoryStatisticsDTO();
		dto.setCategoryId(categoryId);
		dto.setCategoryName(categoryName);
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setResolutionRate(resolutionRate);
		return dto;
	}
}