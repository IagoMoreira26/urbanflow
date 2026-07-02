package com.iagomoreira.urbanflow.service.feedback;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class FeedbackValidationServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private FeedbackRepository feedbackRepository;

	@InjectMocks
	private FeedbackValidationService feedbackValidationService;

	private Request request;

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setId("request-id");
		request.setStatus(RequestStatus.RESOLVED);
	}

	@Test
	void shouldValidateUserExists() {

		when(userRepository.existsById("user-id")).thenReturn(true);
		assertDoesNotThrow(() -> feedbackValidationService.validateUserExists("user-id"));
	}

	@Test
	void shouldThrowWhenUserDoesNotExist() {

		when(userRepository.existsById("user-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> feedbackValidationService.validateUserExists("user-id"));
	}

	@Test
	void shouldValidateRequestExists() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		Request result = feedbackValidationService.validateRequestExists("request-id");
		assertEquals(request, result);
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class,
				() -> feedbackValidationService.validateRequestExists("request-id"));
	}

	@Test
	void shouldValidateResolvedRequest() {

		request.setStatus(RequestStatus.RESOLVED);
		assertDoesNotThrow(() -> feedbackValidationService.validateResolvedRequest(request));
	}

	@Test
	void shouldThrowWhenRequestIsNotResolved() {

		request.setStatus(RequestStatus.IN_PROGRESS);
		assertThrows(BusinessException.class, () -> feedbackValidationService.validateResolvedRequest(request));
	}

	@Test
	void shouldValidateDuplicateFeedback() {

		when(feedbackRepository.existsByUserIdAndRequestId("user-id", "request-id")).thenReturn(false);
		assertDoesNotThrow(() -> feedbackValidationService.validateDuplicateFeedback("user-id", "request-id"));
	}

	@Test
	void shouldThrowWhenFeedbackAlreadyExists() {

		when(feedbackRepository.existsByUserIdAndRequestId("user-id", "request-id")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> feedbackValidationService.validateDuplicateFeedback("user-id", "request-id"));
	}
}