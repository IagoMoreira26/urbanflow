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
import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.model.enums.MediaType;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.media.MediaService;

@WebMvcTest(MediaController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class MediaControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private MediaService mediaService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateMediaDTO createDTO;
	private MediaResponseDTO responseDTO;
	private final String mediaId = "media-123";
	private final String requestId = "req-456";

	@BeforeEach
	void setUp() {
		createDTO = new CreateMediaDTO();
		createDTO.setType(MediaType.IMAGE);
		createDTO.setUrl("http://example.com/image.jpg");
		createDTO.setRequestId(requestId);

		responseDTO = new MediaResponseDTO();
		responseDTO.setId(mediaId);
		responseDTO.setType(MediaType.IMAGE);
		responseDTO.setUrl("http://example.com/image.jpg");
		responseDTO.setUploadedAt(LocalDateTime.now());
		responseDTO.setRequestId(requestId);
	}

	@Test
	void shouldCreateMedia() throws Exception {
		when(mediaService.create(any(CreateMediaDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/media").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(mediaId))
				.andExpect(jsonPath("$.type").value("IMAGE"))
				.andExpect(jsonPath("$.url").value("http://example.com/image.jpg"))
				.andExpect(jsonPath("$.requestId").value(requestId));

		verify(mediaService).create(any(CreateMediaDTO.class));
	}

	@Test
	void shouldFindAllMedia() throws Exception {
		when(mediaService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/media")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(mediaId)).andExpect(jsonPath("$[0].type").value("IMAGE"))
				.andExpect(jsonPath("$[0].url").value("http://example.com/image.jpg"))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(mediaService).findAll();
	}

	@Test
	void shouldFindMediaById() throws Exception {
		when(mediaService.findById(mediaId)).thenReturn(responseDTO);

		mockMvc.perform(get("/media/{id}", mediaId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(mediaId)).andExpect(jsonPath("$.type").value("IMAGE"))
				.andExpect(jsonPath("$.url").value("http://example.com/image.jpg"))
				.andExpect(jsonPath("$.requestId").value(requestId));

		verify(mediaService).findById(mediaId);
	}

	@Test
	void shouldFindMediaByRequest() throws Exception {
		when(mediaService.findByRequest(requestId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/media/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(mediaId))
				.andExpect(jsonPath("$[0].type").value("IMAGE"))
				.andExpect(jsonPath("$[0].url").value("http://example.com/image.jpg"))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(mediaService).findByRequest(requestId);
	}
}