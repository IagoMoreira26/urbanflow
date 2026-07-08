package com.iagomoreira.urbanflow.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
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
import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.update.UpdateService;

@WebMvcTest(UpdateController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class UpdateControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private UpdateService updateService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateUpdateDTO createDTO;
	private UpdateResponseDTO responseDTO;
	private final String updateId = "upd-123";
	private final String requestId = "req-456";

	@BeforeEach
	void setUp() {
		createDTO = new CreateUpdateDTO();
		createDTO.setStatus(RequestStatus.IN_PROGRESS);
		createDTO.setDescription("Update description");
		createDTO.setRequestId(requestId);

		responseDTO = new UpdateResponseDTO();
		responseDTO.setId(updateId);
		responseDTO.setStatus(RequestStatus.IN_PROGRESS);
		responseDTO.setDescription("Update description");
		responseDTO.setUpdatedAt(LocalDateTime.now());
		responseDTO.setRequestId(requestId);
	}

	@Test
	void shouldCreateUpdate() throws Exception {
		when(updateService.create(any(CreateUpdateDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/updates").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(updateId))
				.andExpect(jsonPath("$.status").value("IN_PROGRESS"))
				.andExpect(jsonPath("$.description").value("Update description"))
				.andExpect(jsonPath("$.requestId").value(requestId));

		verify(updateService).create(any(CreateUpdateDTO.class));
	}

	@Test
	void shouldFindAllUpdates() throws Exception {
		when(updateService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/updates")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(updateId)).andExpect(jsonPath("$[0].status").value("IN_PROGRESS"))
				.andExpect(jsonPath("$[0].description").value("Update description"))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(updateService).findAll();
	}

	@Test
	void shouldFindUpdatesByRequestId() throws Exception {
		when(updateService.findByRequest(requestId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/updates/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(updateId))
				.andExpect(jsonPath("$[0].status").value("IN_PROGRESS"))
				.andExpect(jsonPath("$[0].description").value("Update description"))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(updateService).findByRequest(requestId);
	}
}