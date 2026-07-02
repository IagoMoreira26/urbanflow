package com.iagomoreira.urbanflow.service.media;

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

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.repository.MediaRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;

@ExtendWith(MockitoExtension.class)
class MediaValidationServiceTest {

	@Mock
	private MediaRepository mediaRepository;

	@Mock
	private RequestRepository requestRepository;

	@InjectMocks
	private MediaValidationService mediaValidationService;

	private Media media;

	@BeforeEach
	void setUp() {
		media = new Media();
		media.setId("media-id");
	}

	@Test
	void shouldValidateRequest() {

		when(requestRepository.existsById("request-id")).thenReturn(true);
		assertDoesNotThrow(() -> mediaValidationService.validateRequest("request-id"));
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.existsById("request-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> mediaValidationService.validateRequest("request-id"));
	}

	@Test
	void shouldReturnMediaWhenMediaExists() {

		when(mediaRepository.findById("media-id")).thenReturn(Optional.of(media));
		Media result = mediaValidationService.validateMediaExists("media-id");
		assertEquals(media, result);
	}

	@Test
	void shouldThrowWhenMediaDoesNotExist() {

		when(mediaRepository.findById("media-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> mediaValidationService.validateMediaExists("media-id"));
	}
}