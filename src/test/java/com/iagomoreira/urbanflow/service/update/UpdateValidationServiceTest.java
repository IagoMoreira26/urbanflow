package com.iagomoreira.urbanflow.service.update;

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

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@ExtendWith(MockitoExtension.class)
class UpdateValidationServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@InjectMocks
	private UpdateValidationService updateValidationService;

	private Request request;

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setId("request-id");
	}

	@Test
	void shouldReturnRequestWhenRequestExists() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		Request result = updateValidationService.validateRequest("request-id");
		assertEquals(request, result);
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> updateValidationService.validateRequest("request-id"));
	}
}