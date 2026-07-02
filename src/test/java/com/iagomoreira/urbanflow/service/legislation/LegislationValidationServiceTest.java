package com.iagomoreira.urbanflow.service.legislation;

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
import com.iagomoreira.urbanflow.model.Legislation;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@ExtendWith(MockitoExtension.class)
class LegislationValidationServiceTest {

	@Mock
	private LegislationRepository legislationRepository;

	@InjectMocks
	private LegislationValidationService legislationValidationService;

	private Legislation legislation;

	@BeforeEach
	void setUp() {
		legislation = new Legislation();
		legislation.setId("legislation-id");
	}

	@Test
	void shouldReturnLegislationWhenExists() {

		when(legislationRepository.findById("legislation-id")).thenReturn(Optional.of(legislation));
		Legislation result = legislationValidationService.validateLegislationExists("legislation-id");
		assertEquals(legislation, result);
	}

	@Test
	void shouldThrowWhenLegislationDoesNotExist() {

		when(legislationRepository.findById("legislation-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class,
				() -> legislationValidationService.validateLegislationExists("legislation-id"));
	}
}