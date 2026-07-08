package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CategoryStatisticsDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.model.Category;

class CategoryMapperTest {

	private CategoryMapper categoryMapper;

	@BeforeEach
	void setUp() {
		categoryMapper = new CategoryMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateCategoryDTO dto = new CreateCategoryDTO();
		dto.setName("Infraestrutura");
		dto.setDescription("Categoria de infraestrutura urbana");
		dto.setDepartmentId("dep-1");

		Category entity = categoryMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getDescription(), entity.getDescription());
		assertEquals(dto.getDepartmentId(), entity.getDepartmentId());
	}

	@Test
	void updateEntity_shouldUpdateEntityFromDto() {
		Category category = new Category();
		category.setName("Antigo");
		category.setDescription("Antiga descrição");
		category.setDepartmentId("dep-antigo");

		UpdateCategoryDTO dto = new UpdateCategoryDTO();
		dto.setName("Infraestrutura");
		dto.setDescription("Categoria de infraestrutura urbana");
		dto.setDepartmentId("dep-1");

		categoryMapper.updateEntity(category, dto);

		assertEquals(dto.getName(), category.getName());
		assertEquals(dto.getDescription(), category.getDescription());
		assertEquals(dto.getDepartmentId(), category.getDepartmentId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Category category = new Category();
		category.setId("cat-1");
		category.setName("Infraestrutura");
		category.setDescription("Categoria de infraestrutura urbana");
		category.setDepartmentId("dep-1");

		CategoryResponseDTO dto = categoryMapper.toResponse(category);

		assertNotNull(dto);
		assertEquals(category.getId(), dto.getId());
		assertEquals(category.getName(), dto.getName());
		assertEquals(category.getDescription(), dto.getDescription());
		assertEquals(category.getDepartmentId(), dto.getDepartmentId());
	}

	@Test
	void toResponse_shouldReturnNullWhenCategoryIsNull() {
		CategoryResponseDTO dto = categoryMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toStatisticsResponse_shouldMapAllFields() {
		String categoryId = "cat-1";
		String categoryName = "Infraestrutura";
		Integer totalRequests = 100;
		Integer receivedRequests = 20;
		Integer inProgressRequests = 30;
		Integer resolvedRequests = 40;
		Integer cancelledRequests = 10;
		Double resolutionRate = 40.0;

		CategoryStatisticsDTO dto = categoryMapper.toStatisticsResponse(categoryId, categoryName, totalRequests,
				receivedRequests, inProgressRequests, resolvedRequests, cancelledRequests, resolutionRate);

		assertNotNull(dto);
		assertEquals(categoryId, dto.getCategoryId());
		assertEquals(categoryName, dto.getCategoryName());
		assertEquals(totalRequests, dto.getTotalRequests());
		assertEquals(receivedRequests, dto.getReceivedRequests());
		assertEquals(inProgressRequests, dto.getInProgressRequests());
		assertEquals(resolvedRequests, dto.getResolvedRequests());
		assertEquals(cancelledRequests, dto.getCancelledRequests());
		assertEquals(resolutionRate, dto.getResolutionRate());
	}
}