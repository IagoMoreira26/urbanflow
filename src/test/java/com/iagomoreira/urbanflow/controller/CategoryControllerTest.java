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
import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.category.CategoryService;

@WebMvcTest(CategoryController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class CategoryControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private CategoryService categoryService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateCategoryDTO createDTO;
	private UpdateCategoryDTO updateDTO;
	private CategoryResponseDTO responseDTO;

	@BeforeEach
	void setUp() {
		createDTO = new CreateCategoryDTO();
		createDTO.setName("Infrastructure");
		createDTO.setDescription("Infrastructure category description");
		createDTO.setDepartmentId("dep-1");

		updateDTO = new UpdateCategoryDTO();
		updateDTO.setName("Infrastructure Updated");
		updateDTO.setDescription("Updated description");
		updateDTO.setDepartmentId("dep-1");

		responseDTO = new CategoryResponseDTO();
		responseDTO.setId("cat-1");
		responseDTO.setName("Infrastructure");
		responseDTO.setDescription("Infrastructure category description");
		responseDTO.setDepartmentId("dep-1");
	}

	@Test
	void shouldCreateCategory() throws Exception {
		when(categoryService.create(any(CreateCategoryDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/categories").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value("cat-1"))
				.andExpect(jsonPath("$.name").value("Infrastructure"))
				.andExpect(jsonPath("$.description").value("Infrastructure category description"))
				.andExpect(jsonPath("$.departmentId").value("dep-1"));

		verify(categoryService).create(any(CreateCategoryDTO.class));
	}

	@Test
	void shouldFindAllCategories() throws Exception {
		when(categoryService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/categories")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value("cat-1")).andExpect(jsonPath("$[0].name").value("Infrastructure"))
				.andExpect(jsonPath("$[0].description").value("Infrastructure category description"))
				.andExpect(jsonPath("$[0].departmentId").value("dep-1"));

		verify(categoryService).findAll();
	}

	@Test
	void shouldFindCategoryById() throws Exception {
		when(categoryService.findById("cat-1")).thenReturn(responseDTO);

		mockMvc.perform(get("/categories/{id}", "cat-1")).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("cat-1")).andExpect(jsonPath("$.name").value("Infrastructure"))
				.andExpect(jsonPath("$.description").value("Infrastructure category description"))
				.andExpect(jsonPath("$.departmentId").value("dep-1"));

		verify(categoryService).findById("cat-1");
	}

	@Test
	void shouldUpdateCategory() throws Exception {
		responseDTO.setName("Infrastructure Updated");
		responseDTO.setDescription("Updated description");

		when(categoryService.update(eq("cat-1"), any(UpdateCategoryDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/categories/{id}", "cat-1").contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("cat-1"))
				.andExpect(jsonPath("$.name").value("Infrastructure Updated"))
				.andExpect(jsonPath("$.description").value("Updated description"))
				.andExpect(jsonPath("$.departmentId").value("dep-1"));

		verify(categoryService).update(eq("cat-1"), any(UpdateCategoryDTO.class));
	}

	@Test
	void shouldDeleteCategory() throws Exception {
		doNothing().when(categoryService).delete("cat-1");

		mockMvc.perform(delete("/categories/{id}", "cat-1")).andExpect(status().isNoContent());

		verify(categoryService).delete("cat-1");
	}
}