package com.iagomoreira.urbanflow.service.legislation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.mapper.LegislationMapper;
import com.iagomoreira.urbanflow.model.Legislation;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@ExtendWith(MockitoExtension.class)
class LegislationQueryServiceTest {

	@Mock
	private LegislationRepository legislationRepository;

	@Mock
	private LegislationValidationService legislationValidationService;

	@Mock
	private LegislationMapper legislationMapper;

	@InjectMocks
	private LegislationQueryService legislationQueryService;

	private Legislation legislation;
	private LegislationResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		legislation = new Legislation();
		legislation.setId("legislation-id");
		legislation.setTitle("Lei Municipal");
		legislation.setDescription("Descrição da lei");

		responseDTO = new LegislationResponseDTO();
		responseDTO.setId("legislation-id");
		responseDTO.setTitle("Lei Municipal");
		responseDTO.setDescription("Descrição da lei");
	}

	@Test
	void shouldFindAllLegislations() {

		when(legislationRepository.findAll()).thenReturn(List.of(legislation));
		when(legislationMapper.toResponse(legislation)).thenReturn(responseDTO);

		List<LegislationResponseDTO> result = legislationQueryService.findAll();

		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(legislationRepository).findAll();
		verify(legislationMapper).toResponse(legislation);
	}

	@Test
	void shouldFindLegislationById() {

		when(legislationValidationService.validateLegislationExists("legislation-id")).thenReturn(legislation);
		when(legislationMapper.toResponse(legislation)).thenReturn(responseDTO);

		LegislationResponseDTO result = legislationQueryService.findById("legislation-id");
		assertThat(result).isEqualTo(responseDTO);

		verify(legislationValidationService).validateLegislationExists("legislation-id");
		verify(legislationMapper).toResponse(legislation);
	}

	@Test
	void shouldFindLegislationByKeyword() {

		when(legislationRepository.searchByKeyword("mobilidade")).thenReturn(List.of(legislation));
		when(legislationMapper.toResponse(legislation)).thenReturn(responseDTO);

		List<LegislationResponseDTO> result = legislationQueryService.findByKeyword("mobilidade");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(legislationRepository).searchByKeyword("mobilidade");
		verify(legislationMapper).toResponse(legislation);
	}
}