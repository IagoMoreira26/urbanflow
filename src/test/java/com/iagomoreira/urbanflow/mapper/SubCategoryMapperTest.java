package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.model.SubCategory;

class SubCategoryMapperTest {

	private SubCategoryMapper subCategoryMapper;

	@BeforeEach
	void setUp() {
		subCategoryMapper = new SubCategoryMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateSubCategoryDTO dto = new CreateSubCategoryDTO();
		dto.setName("Pavimentação");
		dto.setDescription("Subcategoria para pavimentação");
		dto.setCategoryId("cat-1");
		dto.setDepartmentId("dep-1");

		SubCategory entity = subCategoryMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getDescription(), entity.getDescription());
		assertEquals(dto.getCategoryId(), entity.getCategoryId());
		assertEquals(dto.getDepartmentId(), entity.getDepartmentId());
	}

	@Test
	void updateEntity_shouldUpdateEntityFromDto() {
		SubCategory subCategory = new SubCategory();
		subCategory.setName("Antigo");
		subCategory.setDescription("Antiga descrição");
		subCategory.setCategoryId("cat-antigo");
		subCategory.setDepartmentId("dep-antigo");

		UpdateSubCategoryDTO dto = new UpdateSubCategoryDTO();
		dto.setName("Pavimentação");
		dto.setDescription("Subcategoria para pavimentação");
		dto.setCategoryId("cat-1");
		dto.setDepartmentId("dep-1");

		subCategoryMapper.updateEntity(subCategory, dto);

		assertEquals(dto.getName(), subCategory.getName());
		assertEquals(dto.getDescription(), subCategory.getDescription());
		assertEquals(dto.getCategoryId(), subCategory.getCategoryId());
		assertEquals(dto.getDepartmentId(), subCategory.getDepartmentId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		SubCategory subCategory = new SubCategory();
		subCategory.setId("sub-1");
		subCategory.setName("Pavimentação");
		subCategory.setDescription("Subcategoria para pavimentação");
		subCategory.setCategoryId("cat-1");
		subCategory.setDepartmentId("dep-1");

		SubCategoryResponseDTO dto = subCategoryMapper.toResponse(subCategory);

		assertNotNull(dto);
		assertEquals(subCategory.getId(), dto.getId());
		assertEquals(subCategory.getName(), dto.getName());
		assertEquals(subCategory.getDescription(), dto.getDescription());
		assertEquals(subCategory.getCategoryId(), dto.getCategoryId());
		assertEquals(subCategory.getDepartmentId(), dto.getDepartmentId());
	}

	@Test
	void toResponse_shouldReturnNullWhenSubCategoryIsNull() {
		SubCategoryResponseDTO dto = subCategoryMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toStatisticsResponse_shouldMapAllFields() {
		String subCategoryId = "sub-1";
		String subCategoryName = "Pavimentação";
		Integer totalRequests = 100;
		Integer receivedRequests = 20;
		Integer inProgressRequests = 30;
		Integer resolvedRequests = 40;
		Integer cancelledRequests = 10;
		Double resolutionRate = 40.0;

		SubCategoryStatisticsDTO dto = subCategoryMapper.toStatisticsResponse(subCategoryId, subCategoryName,
				totalRequests, receivedRequests, inProgressRequests, resolvedRequests, cancelledRequests,
				resolutionRate);

		assertNotNull(dto);
		assertEquals(subCategoryId, dto.getSubCategoryId());
		assertEquals(subCategoryName, dto.getSubCategoryName());
		assertEquals(totalRequests, dto.getTotalRequests());
		assertEquals(receivedRequests, dto.getReceivedRequests());
		assertEquals(inProgressRequests, dto.getInProgressRequests());
		assertEquals(resolvedRequests, dto.getResolvedRequests());
		assertEquals(cancelledRequests, dto.getCancelledRequests());
		assertEquals(resolutionRate, dto.getResolutionRate());
	}
}