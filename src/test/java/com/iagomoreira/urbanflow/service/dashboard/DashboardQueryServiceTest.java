package com.iagomoreira.urbanflow.service.dashboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.mapper.DashboardMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@ExtendWith(MockitoExtension.class)
class DashboardQueryServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private DashboardMapper dashboardMapper;

	@InjectMocks
	private DashboardQueryService queryService;

	private Request request1;
	private Request request2;
	private Request request3;
	private Request request4;
	private Request request5;
	private Request request6;

	private Category category1;
	private Category category2;

	private SubCategory subCategory1;
	private SubCategory subCategory2;

	@BeforeEach
	void setUp() {
		request1 = new Request();
		request1.setCategoryId("cat-1");
		request1.setSubCategoryId("sub-1");

		request2 = new Request();
		request2.setCategoryId("cat-1");
		request2.setSubCategoryId("sub-1");

		request3 = new Request();
		request3.setCategoryId("cat-1");
		request3.setSubCategoryId("sub-2");

		request4 = new Request();
		request4.setCategoryId("cat-2");
		request4.setSubCategoryId("sub-2");

		request5 = new Request();
		request5.setCategoryId("cat-2");
		request5.setSubCategoryId("sub-2");

		request6 = new Request();
		request6.setCategoryId("cat-3");
		request6.setSubCategoryId("sub-3");

		category1 = new Category();
		category1.setId("cat-1");
		category1.setName("Infraestrutura");

		category2 = new Category();
		category2.setId("cat-2");
		category2.setName("Limpeza Urbana");

		subCategory1 = new SubCategory();
		subCategory1.setId("sub-1");
		subCategory1.setName("Pavimentação");

		subCategory2 = new SubCategory();
		subCategory2.setId("sub-2");
		subCategory2.setName("Coleta de Lixo");
	}

	@Test
	void getTopCategories_shouldReturnTop5Categories() {
		List<Request> requests = List.of(request1, request2, request3, request4, request5, request6);
		when(requestRepository.findAll()).thenReturn(requests);

		when(categoryRepository.findById("cat-1")).thenReturn(Optional.of(category1));
		when(categoryRepository.findById("cat-2")).thenReturn(Optional.of(category2));
		when(categoryRepository.findById("cat-3")).thenReturn(Optional.empty());

		TopCategoryDTO dto1 = new TopCategoryDTO();
		dto1.setCategoryId("cat-1");
		dto1.setCategoryName("Infraestrutura");
		dto1.setTotalRequests(3);
		when(dashboardMapper.toTopCategoryResponse("cat-1", "Infraestrutura", 3)).thenReturn(dto1);

		TopCategoryDTO dto2 = new TopCategoryDTO();
		dto2.setCategoryId("cat-2");
		dto2.setCategoryName("Limpeza Urbana");
		dto2.setTotalRequests(2);
		when(dashboardMapper.toTopCategoryResponse("cat-2", "Limpeza Urbana", 2)).thenReturn(dto2);

		TopCategoryDTO dto3 = new TopCategoryDTO();
		dto3.setCategoryId("cat-3");
		dto3.setCategoryName("Unknown");
		dto3.setTotalRequests(1);
		when(dashboardMapper.toTopCategoryResponse("cat-3", "Unknown", 1)).thenReturn(dto3);

		List<TopCategoryDTO> result = queryService.getTopCategories();

		assertNotNull(result);
		assertEquals(3, result.size());
		assertEquals("cat-1", result.get(0).getCategoryId());
		assertEquals("Infraestrutura", result.get(0).getCategoryName());
		assertEquals(3, result.get(0).getTotalRequests());
		assertEquals("cat-2", result.get(1).getCategoryId());
		assertEquals("Limpeza Urbana", result.get(1).getCategoryName());
		assertEquals(2, result.get(1).getTotalRequests());
		assertEquals("cat-3", result.get(2).getCategoryId());
		assertEquals("Unknown", result.get(2).getCategoryName());
		assertEquals(1, result.get(2).getTotalRequests());

		verify(requestRepository).findAll();
		verify(categoryRepository).findById("cat-1");
		verify(categoryRepository).findById("cat-2");
		verify(categoryRepository).findById("cat-3");
		verify(dashboardMapper).toTopCategoryResponse("cat-1", "Infraestrutura", 3);
		verify(dashboardMapper).toTopCategoryResponse("cat-2", "Limpeza Urbana", 2);
		verify(dashboardMapper).toTopCategoryResponse("cat-3", "Unknown", 1);
	}

	@Test
	void getTopCategories_shouldUseUnknownForMissingCategory() {
		List<Request> requests = List.of(request1);
		when(requestRepository.findAll()).thenReturn(requests);

		when(categoryRepository.findById("cat-1")).thenReturn(Optional.empty());

		TopCategoryDTO expectedDto = new TopCategoryDTO();
		expectedDto.setCategoryId("cat-1");
		expectedDto.setCategoryName("Unknown");
		expectedDto.setTotalRequests(1);
		when(dashboardMapper.toTopCategoryResponse("cat-1", "Unknown", 1)).thenReturn(expectedDto);

		List<TopCategoryDTO> result = queryService.getTopCategories();

		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("cat-1", result.get(0).getCategoryId());
		assertEquals("Unknown", result.get(0).getCategoryName());
		assertEquals(1, result.get(0).getTotalRequests());

		verify(dashboardMapper).toTopCategoryResponse("cat-1", "Unknown", 1);
	}

	@Test
	void getTopCategories_shouldReturnEmptyListWhenNoRequests() {
		when(requestRepository.findAll()).thenReturn(List.of());

		List<TopCategoryDTO> result = queryService.getTopCategories();

		assertNotNull(result);
		assertEquals(0, result.size());

		verify(requestRepository).findAll();
		verify(categoryRepository, never()).findById(anyString());
		verify(dashboardMapper, never()).toTopCategoryResponse(anyString(), anyString(), anyInt());
	}

	@Test
	void getTopSubCategories_shouldReturnTop5SubCategories() {
		List<Request> requests = List.of(request1, request2, request3, request4, request5, request6);
		when(requestRepository.findAll()).thenReturn(requests);

		when(subCategoryRepository.findById("sub-1")).thenReturn(Optional.of(subCategory1));
		when(subCategoryRepository.findById("sub-2")).thenReturn(Optional.of(subCategory2));
		when(subCategoryRepository.findById("sub-3")).thenReturn(Optional.empty());

		TopSubCategoryDTO dto1 = new TopSubCategoryDTO();
		dto1.setSubCategoryId("sub-1");
		dto1.setSubCategoryName("Pavimentação");
		dto1.setTotalRequests(2);
		when(dashboardMapper.toTopSubCategoryResponse("sub-1", "Pavimentação", 2)).thenReturn(dto1);

		TopSubCategoryDTO dto2 = new TopSubCategoryDTO();
		dto2.setSubCategoryId("sub-2");
		dto2.setSubCategoryName("Coleta de Lixo");
		dto2.setTotalRequests(3);
		when(dashboardMapper.toTopSubCategoryResponse("sub-2", "Coleta de Lixo", 3)).thenReturn(dto2);

		TopSubCategoryDTO dto3 = new TopSubCategoryDTO();
		dto3.setSubCategoryId("sub-3");
		dto3.setSubCategoryName("Unknown");
		dto3.setTotalRequests(1);
		when(dashboardMapper.toTopSubCategoryResponse("sub-3", "Unknown", 1)).thenReturn(dto3);

		List<TopSubCategoryDTO> result = queryService.getTopSubCategories();

		assertNotNull(result);
		assertEquals(3, result.size());
		assertEquals("sub-2", result.get(0).getSubCategoryId());
		assertEquals("Coleta de Lixo", result.get(0).getSubCategoryName());
		assertEquals(3, result.get(0).getTotalRequests());
		assertEquals("sub-1", result.get(1).getSubCategoryId());
		assertEquals("Pavimentação", result.get(1).getSubCategoryName());
		assertEquals(2, result.get(1).getTotalRequests());
		assertEquals("sub-3", result.get(2).getSubCategoryId());
		assertEquals("Unknown", result.get(2).getSubCategoryName());
		assertEquals(1, result.get(2).getTotalRequests());

		verify(requestRepository).findAll();
		verify(subCategoryRepository).findById("sub-2");
		verify(subCategoryRepository).findById("sub-1");
		verify(subCategoryRepository).findById("sub-3");
		verify(dashboardMapper).toTopSubCategoryResponse("sub-2", "Coleta de Lixo", 3);
		verify(dashboardMapper).toTopSubCategoryResponse("sub-1", "Pavimentação", 2);
		verify(dashboardMapper).toTopSubCategoryResponse("sub-3", "Unknown", 1);
	}

	@Test
	void getTopSubCategories_shouldUseUnknownForMissingSubCategory() {
		List<Request> requests = List.of(request1);
		when(requestRepository.findAll()).thenReturn(requests);

		when(subCategoryRepository.findById("sub-1")).thenReturn(Optional.empty());

		TopSubCategoryDTO expectedDto = new TopSubCategoryDTO();
		expectedDto.setSubCategoryId("sub-1");
		expectedDto.setSubCategoryName("Unknown");
		expectedDto.setTotalRequests(1);
		when(dashboardMapper.toTopSubCategoryResponse("sub-1", "Unknown", 1)).thenReturn(expectedDto);

		List<TopSubCategoryDTO> result = queryService.getTopSubCategories();

		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("sub-1", result.get(0).getSubCategoryId());
		assertEquals("Unknown", result.get(0).getSubCategoryName());
		assertEquals(1, result.get(0).getTotalRequests());

		verify(dashboardMapper).toTopSubCategoryResponse("sub-1", "Unknown", 1);
	}

	@Test
	void getTopSubCategories_shouldReturnEmptyListWhenNoRequests() {
		when(requestRepository.findAll()).thenReturn(List.of());

		List<TopSubCategoryDTO> result = queryService.getTopSubCategories();

		assertNotNull(result);
		assertEquals(0, result.size());

		verify(requestRepository).findAll();
		verify(subCategoryRepository, never()).findById(anyString());
		verify(dashboardMapper, never()).toTopSubCategoryResponse(anyString(), anyString(), anyInt());
	}
}