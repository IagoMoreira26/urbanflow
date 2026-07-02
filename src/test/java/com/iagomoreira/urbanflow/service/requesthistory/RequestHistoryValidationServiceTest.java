package com.iagomoreira.urbanflow.service.requesthistory;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@ExtendWith(MockitoExtension.class)
class RequestHistoryValidationServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@InjectMocks
	private RequestHistoryValidationService requestHistoryValidationService;

	@Test
	void shouldValidateRequest() {

		when(requestRepository.existsById("request-id")).thenReturn(true);
		assertDoesNotThrow(() -> requestHistoryValidationService.validateRequest("request-id"));
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.existsById("request-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class,
				() -> requestHistoryValidationService.validateRequest("request-id"));
	}
}