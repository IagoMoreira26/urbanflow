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
import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.feedback.FeedbackService;

@WebMvcTest(FeedbackController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class FeedbackControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private FeedbackService feedbackService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateFeedbackDTO createDTO;
	private FeedbackResponseDTO responseDTO;
	private FeedbackStatisticsDTO statisticsDTO;
	private final String feedbackId = "fb-123";
	private final String requestId = "req-456";
	private final String userId = "user-789";

	@BeforeEach
	void setUp() {
		createDTO = new CreateFeedbackDTO();
		createDTO.setRating(5);
		createDTO.setComment("Great service!");
		createDTO.setRequestId(requestId);

		responseDTO = new FeedbackResponseDTO();
		responseDTO.setId(feedbackId);
		responseDTO.setRating(5);
		responseDTO.setComment("Great service!");
		responseDTO.setCreatedAt(LocalDateTime.now());
		responseDTO.setUserId(userId);
		responseDTO.setRequestId(requestId);

		statisticsDTO = new FeedbackStatisticsDTO();
		statisticsDTO.setAverageRating(4.5);
		statisticsDTO.setTotalFeedbacks(10);
		statisticsDTO.setFiveStars(5);
		statisticsDTO.setFourStars(3);
		statisticsDTO.setThreeStars(1);
		statisticsDTO.setTwoStars(1);
		statisticsDTO.setOneStar(0);
		statisticsDTO.setSatisfactionPercentage(80.0);
	}

	@Test
	void shouldCreateFeedback() throws Exception {
		when(feedbackService.create(any(CreateFeedbackDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/feedbacks").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(jsonPath("$.id").value(feedbackId))
				.andExpect(jsonPath("$.rating").value(5)).andExpect(jsonPath("$.comment").value("Great service!"))
				.andExpect(jsonPath("$.userId").value(userId)).andExpect(jsonPath("$.requestId").value(requestId));

		verify(feedbackService).create(any(CreateFeedbackDTO.class));
	}

	@Test
	void shouldFindAllFeedbacks() throws Exception {
		when(feedbackService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/feedbacks")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(feedbackId)).andExpect(jsonPath("$[0].rating").value(5))
				.andExpect(jsonPath("$[0].comment").value("Great service!"))
				.andExpect(jsonPath("$[0].userId").value(userId))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(feedbackService).findAll();
	}

	@Test
	void shouldFindFeedbacksByRequest() throws Exception {
		when(feedbackService.findByRequest(requestId)).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/feedbacks/request/{requestId}", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value(feedbackId))
				.andExpect(jsonPath("$[0].rating").value(5)).andExpect(jsonPath("$[0].comment").value("Great service!"))
				.andExpect(jsonPath("$[0].userId").value(userId))
				.andExpect(jsonPath("$[0].requestId").value(requestId));

		verify(feedbackService).findByRequest(requestId);
	}

	@Test
	void shouldGetFeedbackStatistics() throws Exception {
		when(feedbackService.getStatistics(requestId)).thenReturn(statisticsDTO);

		mockMvc.perform(get("/feedbacks/request/{requestId}/statistics", requestId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.averageRating").value(4.5)).andExpect(jsonPath("$.totalFeedbacks").value(10))
				.andExpect(jsonPath("$.fiveStars").value(5)).andExpect(jsonPath("$.fourStars").value(3))
				.andExpect(jsonPath("$.threeStars").value(1)).andExpect(jsonPath("$.twoStars").value(1))
				.andExpect(jsonPath("$.oneStar").value(0)).andExpect(jsonPath("$.satisfactionPercentage").value(80.0));

		verify(feedbackService).getStatistics(requestId);
	}
}