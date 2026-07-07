package com.iagomoreira.urbanflow.service.feedback;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@ExtendWith(MockitoExtension.class)
class FeedbackCommandServiceTest {

	@Mock
	private FeedbackRepository feedbackRepository;

	@Mock
	private FeedbackValidationService feedbackValidationService;

	@Mock
	private FeedbackMapper feedbackMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@Mock
	private SecurityService securityService;

	@InjectMocks
	private FeedbackCommandService service;

	private CreateFeedbackDTO dto;
	private Feedback feedback;
	private FeedbackResponseDTO response;
	private Request request;

	@BeforeEach
	void setup() {

		dto = new CreateFeedbackDTO();
		dto.setRequestId("request-id");
		dto.setRating(5);
		dto.setComment("Excelente");

		feedback = new Feedback();
		response = new FeedbackResponseDTO();
		request = new Request();
	}

	@Test
	void shouldCreateFeedbackSuccessfully() {

		LocalDateTime now = LocalDateTime.now();

		when(securityService.getAuthenticatedUserId()).thenReturn("user-id");
		when(feedbackValidationService.validateRequestExists(dto.getRequestId())).thenReturn(request);
		when(feedbackMapper.toEntity(dto)).thenReturn(feedback);
		when(dateTimeProvider.now()).thenReturn(now);
		when(feedbackRepository.save(feedback)).thenReturn(feedback);
		when(feedbackMapper.toResponse(feedback)).thenReturn(response);

		FeedbackResponseDTO result = service.create(dto);

		ArgumentCaptor<Feedback> captor = ArgumentCaptor.forClass(Feedback.class);

		verify(feedbackRepository).save(captor.capture());

		Feedback saved = captor.getValue();

		assertEquals("user-id", saved.getUserId());
		assertEquals(now, saved.getCreatedAt());
		assertEquals(response, result);

		verify(feedbackValidationService).validateUserExists("user-id");
		verify(feedbackValidationService).validateRequestExists(dto.getRequestId());
		verify(feedbackValidationService).validateResolvedRequest(request);
		verify(feedbackValidationService).validateDuplicateFeedback("user-id", dto.getRequestId());
	}

	@Test
	void shouldStopExecutionWhenValidationFails() {

		when(securityService.getAuthenticatedUserId()).thenReturn("user-id");
		doThrow(new BusinessException("error")).when(feedbackValidationService).validateUserExists("user-id");

		assertThrows(BusinessException.class, () -> service.create(dto));

		verify(feedbackRepository, never()).save(any());
		verify(feedbackMapper, never()).toEntity(any());
	}
}