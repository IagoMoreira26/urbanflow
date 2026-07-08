package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.model.SubCategory;

@Component
public class SubCategoryMapper {

	public SubCategory toEntity(CreateSubCategoryDTO dto) {

		SubCategory subCategory = new SubCategory();

		subCategory.setName(dto.getName());
		subCategory.setDescription(dto.getDescription());
		subCategory.setCategoryId(dto.getCategoryId());
		subCategory.setDepartmentId(dto.getDepartmentId());

		return subCategory;
	}

	public void updateEntity(SubCategory subCategory, UpdateSubCategoryDTO dto) {
		subCategory.setName(dto.getName());
		subCategory.setDescription(dto.getDescription());
		subCategory.setCategoryId(dto.getCategoryId());
		subCategory.setDepartmentId(dto.getDepartmentId());
	}

	public SubCategoryResponseDTO toResponse(SubCategory subCategory) {

		if (subCategory == null) {
			return null;
		}

		SubCategoryResponseDTO dto = new SubCategoryResponseDTO();
		dto.setId(subCategory.getId());
		dto.setName(subCategory.getName());
		dto.setDescription(subCategory.getDescription());
		dto.setCategoryId(subCategory.getCategoryId());
		dto.setDepartmentId(subCategory.getDepartmentId());
		return dto;
	}

	public SubCategoryStatisticsDTO toStatisticsResponse(String subCategoryId, String subCategoryName,
			Integer totalRequests, Integer receivedRequests, Integer inProgressRequests, Integer resolvedRequests,
			Integer cancelledRequests, Double resolutionRate) {
		SubCategoryStatisticsDTO dto = new SubCategoryStatisticsDTO();
		dto.setSubCategoryId(subCategoryId);
		dto.setSubCategoryName(subCategoryName);
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setResolutionRate(resolutionRate);
		return dto;
	}
}