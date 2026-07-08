package com.iagomoreira.urbanflow.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
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
import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.legislation.LegislationService;

@WebMvcTest(LegislationController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class LegislationControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private LegislationService legislationService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private LegislationResponseDTO responseDTO;
	private final String legislationId = "leg-123";
	private final String keyword = "mobilidade";

	@BeforeEach
	void setUp() {
		responseDTO = new LegislationResponseDTO();
		responseDTO.setId(legislationId);
		responseDTO.setTitle("Lei de Mobilidade Urbana");
		responseDTO.setDescription("Regulamenta a mobilidade urbana");
		responseDTO.setDocumentUrl("http://example.com/doc.pdf");
		responseDTO.setKeywords(Arrays.asList("mobilidade", "transporte", "urbano"));
	}

	@Test
	void shouldFindAllLegislations() throws Exception {
		when(legislationService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/legislations")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(legislationId))
				.andExpect(jsonPath("$[0].title").value("Lei de Mobilidade Urbana"))
				.andExpect(jsonPath("$[0].description").value("Regulamenta a mobilidade urbana"))
				.andExpect(jsonPath("$[0].documentUrl").value("http://example.com/doc.pdf"))
				.andExpect(jsonPath("$[0].keywords[0]").value("mobilidade"))
				.andExpect(jsonPath("$[0].keywords[1]").value("transporte"))
				.andExpect(jsonPath("$[0].keywords[2]").value("urbano"));

		verify(legislationService).findAll();
	}

	@Test
	void shouldFindLegislationById() throws Exception {
		when(legislationService.findById(legislationId)).thenReturn(responseDTO);

		mockMvc.perform(get("/legislations/{id}", legislationId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(legislationId))
				.andExpect(jsonPath("$.title").value("Lei de Mobilidade Urbana"))
				.andExpect(jsonPath("$.description").value("Regulamenta a mobilidade urbana"))
				.andExpect(jsonPath("$.documentUrl").value("http://example.com/doc.pdf"))
				.andExpect(jsonPath("$.keywords[0]").value("mobilidade"));

		verify(legislationService).findById(legislationId);
	}

	@Test
	void shouldFindByKeyword() throws Exception {
		when(legislationService.findByKeyword(keyword)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/legislations/search").param("keyword", keyword)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(legislationId))
				.andExpect(jsonPath("$[0].title").value("Lei de Mobilidade Urbana"));

		verify(legislationService).findByKeyword(keyword);
	}
}