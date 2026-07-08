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
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
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
import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.department.DepartmentService;

@WebMvcTest(DepartmentController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class DepartmentControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private DepartmentService departmentService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateDepartmentDTO createDTO;
	private UpdateDepartmentDTO updateDTO;
	private DepartmentResponseDTO responseDTO;

	@BeforeEach
	void setUp() {
		createDTO = new CreateDepartmentDTO();
		createDTO.setName("Infrastructure");
		createDTO.setDescription("Infrastructure department description");

		updateDTO = new UpdateDepartmentDTO();
		updateDTO.setName("Infrastructure Updated");
		updateDTO.setDescription("Updated description");

		responseDTO = new DepartmentResponseDTO();
		responseDTO.setId("dep-1");
		responseDTO.setName("Infrastructure");
		responseDTO.setDescription("Infrastructure department description");
	}

	@Test
	void shouldCreateDepartment() throws Exception {
		when(departmentService.create(any(CreateDepartmentDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/departments").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(header().exists("Location"))
				.andExpect(jsonPath("$.id").value("dep-1")).andExpect(jsonPath("$.name").value("Infrastructure"))
				.andExpect(jsonPath("$.description").value("Infrastructure department description"));

		verify(departmentService).create(any(CreateDepartmentDTO.class));
	}

	@Test
	void shouldFindAllDepartments() throws Exception {
		when(departmentService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/departments")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value("dep-1")).andExpect(jsonPath("$[0].name").value("Infrastructure"))
				.andExpect(jsonPath("$[0].description").value("Infrastructure department description"));

		verify(departmentService).findAll();
	}

	@Test
	void shouldFindDepartmentById() throws Exception {
		when(departmentService.findById("dep-1")).thenReturn(responseDTO);

		mockMvc.perform(get("/departments/{id}", "dep-1")).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("dep-1")).andExpect(jsonPath("$.name").value("Infrastructure"))
				.andExpect(jsonPath("$.description").value("Infrastructure department description"));

		verify(departmentService).findById("dep-1");
	}

	@Test
	void shouldUpdateDepartment() throws Exception {
		responseDTO.setName("Infrastructure Updated");
		responseDTO.setDescription("Updated description");

		when(departmentService.update(eq("dep-1"), any(UpdateDepartmentDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/departments/{id}", "dep-1").contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("dep-1"))
				.andExpect(jsonPath("$.name").value("Infrastructure Updated"))
				.andExpect(jsonPath("$.description").value("Updated description"));

		verify(departmentService).update(eq("dep-1"), any(UpdateDepartmentDTO.class));
	}

	@Test
	void shouldDeleteDepartment() throws Exception {
		doNothing().when(departmentService).delete("dep-1");

		mockMvc.perform(delete("/departments/{id}", "dep-1")).andExpect(status().isNoContent());

		verify(departmentService).delete("dep-1");
	}
}