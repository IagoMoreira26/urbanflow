package com.iagomoreira.urbanflow.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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

import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.requesthistory.RequestHistoryService;

@WebMvcTest(RequestHistoryController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class RequestHistoryControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private RequestHistoryService requestHistoryService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private RequestHistoryResponseDTO historyDTO;
	private final String requestId = "req-123";
	private final String historyId = "hist-456";

	@BeforeEach
	void setUp() {
		historyDTO = new RequestHistoryResponseDTO();
		historyDTO.setId(historyId);
		historyDTO.setOldStatus(RequestStatus.RECEIVED);
		historyDTO.setNewStatus(RequestStatus.IN_PROGRESS);
		historyDTO.setChangedBy("Operador Patos");
		historyDTO.setNote("Iniciando atendimento");
		historyDTO.setChangedAt(LocalDateTime.now().minusHours(1));
	}

	@Test
	void shouldFindHistoryByRequest() throws Exception {
		when(requestHistoryService.findByRequest(requestId)).thenReturn(List.of(historyDTO));

		mockMvc.perform(get("/request-history/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(historyId))
				.andExpect(jsonPath("$[0].oldStatus").value("RECEIVED"))
				.andExpect(jsonPath("$[0].newStatus").value("IN_PROGRESS"))
				.andExpect(jsonPath("$[0].changedBy").value("Operador Patos"))
				.andExpect(jsonPath("$[0].note").value("Iniciando atendimento"));

		verify(requestHistoryService).findByRequest(requestId);
	}
}