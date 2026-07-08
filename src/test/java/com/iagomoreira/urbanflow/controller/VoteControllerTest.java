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
import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.vote.VoteService;

@WebMvcTest(VoteController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class VoteControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private VoteService voteService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateVoteDTO createDTO;
	private VoteResponseDTO voteResponseDTO;
	private RequestPriorityDTO priorityDTO;
	private final String voteId = "vote-123";
	private final String requestId = "req-456";
	private final String userId = "user-789";

	@BeforeEach
	void setUp() {
		createDTO = new CreateVoteDTO();
		createDTO.setRequestId(requestId);
		createDTO.setPriorityLevel(PriorityLevel.HIGH);

		voteResponseDTO = new VoteResponseDTO();
		voteResponseDTO.setId(voteId);
		voteResponseDTO.setUserId(userId);
		voteResponseDTO.setRequestId(requestId);
		voteResponseDTO.setPriorityLevel(PriorityLevel.HIGH);
		voteResponseDTO.setCreatedAt(LocalDateTime.now());

		priorityDTO = new RequestPriorityDTO();
		priorityDTO.setLowVotes(1);
		priorityDTO.setMediumVotes(2);
		priorityDTO.setHighVotes(3);
		priorityDTO.setTotalVotes(6);
		priorityDTO.setLowPercentage(16.67);
		priorityDTO.setMediumPercentage(33.33);
		priorityDTO.setHighPercentage(50.0);
	}

	@Test
	void shouldCreateVote() throws Exception {
		when(voteService.create(any(CreateVoteDTO.class))).thenReturn(voteResponseDTO);

		mockMvc.perform(
				post("/votes").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(voteId))
				.andExpect(jsonPath("$.userId").value(userId)).andExpect(jsonPath("$.requestId").value(requestId))
				.andExpect(jsonPath("$.priorityLevel").value("HIGH"));

		verify(voteService).create(any(CreateVoteDTO.class));
	}

	@Test
	void shouldFindAllVotes() throws Exception {
		when(voteService.findAll()).thenReturn(List.of(voteResponseDTO));

		mockMvc.perform(get("/votes")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(voteId)).andExpect(jsonPath("$[0].userId").value(userId))
				.andExpect(jsonPath("$[0].requestId").value(requestId))
				.andExpect(jsonPath("$[0].priorityLevel").value("HIGH"));

		verify(voteService).findAll();
	}

	@Test
	void shouldFindVotesByRequest() throws Exception {
		when(voteService.findByRequest(requestId)).thenReturn(List.of(voteResponseDTO));

		mockMvc.perform(get("/votes/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(voteId))
				.andExpect(jsonPath("$[0].userId").value(userId)).andExpect(jsonPath("$[0].requestId").value(requestId))
				.andExpect(jsonPath("$[0].priorityLevel").value("HIGH"));

		verify(voteService).findByRequest(requestId);
	}

	@Test
	void shouldGetRequestPriority() throws Exception {
		when(voteService.getRequestPriority(requestId)).thenReturn(priorityDTO);

		mockMvc.perform(get("/votes/request/{requestId}/priority", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.lowVotes").value(1)).andExpect(jsonPath("$.mediumVotes").value(2))
				.andExpect(jsonPath("$.highVotes").value(3)).andExpect(jsonPath("$.totalVotes").value(6))
				.andExpect(jsonPath("$.lowPercentage").value(16.67))
				.andExpect(jsonPath("$.mediumPercentage").value(33.33))
				.andExpect(jsonPath("$.highPercentage").value(50.0));

		verify(voteService).getRequestPriority(requestId);
	}
}