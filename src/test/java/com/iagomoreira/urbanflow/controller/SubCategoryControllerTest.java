package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.subcategory.SubCategoryService;

@WebMvcTest(SubCategoryController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class SubCategoryControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private SubCategoryService subCategoryService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateSubCategoryDTO createDTO;
	private UpdateSubCategoryDTO updateDTO;
	private SubCategoryResponseDTO responseDTO;
	private final String categoryId = "cat-123";
	private final String departmentId = "dep-456";
	private final String subCategoryId = "sub-789";

	@BeforeEach
	void setUp() {
		createDTO = new CreateSubCategoryDTO();
		createDTO.setName("Infrastructure Sub");
		createDTO.setDescription("Subcategory for infrastructure");
		createDTO.setCategoryId(categoryId);
		createDTO.setDepartmentId(departmentId);

		updateDTO = new UpdateSubCategoryDTO();
		updateDTO.setName("Infrastructure Sub Updated");
		updateDTO.setDescription("Updated description");
		updateDTO.setCategoryId(categoryId);
		updateDTO.setDepartmentId(departmentId);

		responseDTO = new SubCategoryResponseDTO();
		responseDTO.setId(subCategoryId);
		responseDTO.setName("Infrastructure Sub");
		responseDTO.setDescription("Subcategory for infrastructure");
		responseDTO.setCategoryId(categoryId);
		responseDTO.setDepartmentId(departmentId);
	}

	@Test
	void shouldCreateSubCategory() throws Exception {
		when(subCategoryService.create(any(CreateSubCategoryDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(post("/subcategories").contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(createDTO))).andExpect(status().isCreated())
				.andExpect(jsonPath("$.id").value(subCategoryId))
				.andExpect(jsonPath("$.name").value("Infrastructure Sub"))
				.andExpect(jsonPath("$.description").value("Subcategory for infrastructure"))
				.andExpect(jsonPath("$.categoryId").value(categoryId))
				.andExpect(jsonPath("$.departmentId").value(departmentId));

		verify(subCategoryService).create(any(CreateSubCategoryDTO.class));
	}

	@Test
	void shouldFindAllSubCategories() throws Exception {
		when(subCategoryService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/subcategories")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(subCategoryId))
				.andExpect(jsonPath("$[0].name").value("Infrastructure Sub"))
				.andExpect(jsonPath("$[0].description").value("Subcategory for infrastructure"))
				.andExpect(jsonPath("$[0].categoryId").value(categoryId))
				.andExpect(jsonPath("$[0].departmentId").value(departmentId));

		verify(subCategoryService).findAll();
	}

	@Test
	void shouldFindSubCategoryById() throws Exception {
		when(subCategoryService.findById(subCategoryId)).thenReturn(responseDTO);

		mockMvc.perform(get("/subcategories/{id}", subCategoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(subCategoryId))
				.andExpect(jsonPath("$.name").value("Infrastructure Sub"))
				.andExpect(jsonPath("$.description").value("Subcategory for infrastructure"))
				.andExpect(jsonPath("$.categoryId").value(categoryId))
				.andExpect(jsonPath("$.departmentId").value(departmentId));

		verify(subCategoryService).findById(subCategoryId);
	}

	@Test
	void shouldFindSubCategoriesByCategory() throws Exception {
		when(subCategoryService.findByCategory(categoryId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/subcategories/category/{categoryId}", categoryId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(subCategoryId))
				.andExpect(jsonPath("$[0].name").value("Infrastructure Sub"))
				.andExpect(jsonPath("$[0].description").value("Subcategory for infrastructure"))
				.andExpect(jsonPath("$[0].categoryId").value(categoryId))
				.andExpect(jsonPath("$[0].departmentId").value(departmentId));

		verify(subCategoryService).findByCategory(categoryId);
	}

	@Test
	void shouldUpdateSubCategory() throws Exception {
		responseDTO.setName("Infrastructure Sub Updated");
		responseDTO.setDescription("Updated description");

		when(subCategoryService.update(eq(subCategoryId), any(UpdateSubCategoryDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/subcategories/{id}", subCategoryId).contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(subCategoryId))
				.andExpect(jsonPath("$.name").value("Infrastructure Sub Updated"))
				.andExpect(jsonPath("$.description").value("Updated description"))
				.andExpect(jsonPath("$.categoryId").value(categoryId))
				.andExpect(jsonPath("$.departmentId").value(departmentId));

		verify(subCategoryService).update(eq(subCategoryId), any(UpdateSubCategoryDTO.class));
	}

	@Test
	void shouldDeleteSubCategory() throws Exception {
		doNothing().when(subCategoryService).delete(subCategoryId);

		mockMvc.perform(delete("/subcategories/{id}", subCategoryId)).andExpect(status().isNoContent());

		verify(subCategoryService).delete(subCategoryId);
	}
}