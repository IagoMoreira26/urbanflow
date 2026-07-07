package com.iagomoreira.urbanflow.service.feedback;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@ExtendWith(MockitoExtension.class)
class FeedbackQueryServiceTest {

	@Mock
	private FeedbackRepository feedbackRepository;

	@Mock
	private FeedbackValidationService feedbackValidationService;

	@Mock
	private FeedbackMapper feedbackMapper;

	@InjectMocks
	private FeedbackQueryService feedbackQueryService;

	private Feedback feedback;
	private FeedbackResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		feedback = new Feedback();
		feedback.setId("feedback-id");
		feedback.setRequestId("request-id");
		feedback.setUserId("user-id");
		feedback.setRating(5);
		feedback.setComment("Excelente atendimento");
		feedback.setCreatedAt(LocalDateTime.now());

		responseDTO = new FeedbackResponseDTO();
		responseDTO.setId("feedback-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setUserId("user-id");
		responseDTO.setRating(5);
		responseDTO.setComment("Excelente atendimento");
		responseDTO.setCreatedAt(feedback.getCreatedAt());
	}

	@Test
	void shouldFindAllFeedbacks() {

		when(feedbackRepository.findAll()).thenReturn(List.of(feedback));
		when(feedbackMapper.toResponse(feedback)).thenReturn(responseDTO);

		List<FeedbackResponseDTO> result = feedbackQueryService.findAll();
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(feedbackRepository).findAll();
		verify(feedbackMapper).toResponse(feedback);
	}

	@Test
	void shouldFindFeedbacksByRequest() {

		when(feedbackValidationService.validateRequestExists("request-id")).thenReturn(null);
		when(feedbackRepository.findByRequestId("request-id")).thenReturn(List.of(feedback));
		when(feedbackMapper.toResponse(feedback)).thenReturn(responseDTO);

		List<FeedbackResponseDTO> result = feedbackQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(feedbackValidationService).validateRequestExists("request-id");
		verify(feedbackRepository).findByRequestId("request-id");
		verify(feedbackMapper).toResponse(feedback);
	}
}