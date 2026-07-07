package com.iagomoreira.urbanflow.service.update;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.mapper.UpdateMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.repository.UpdateRepository;

@ExtendWith(MockitoExtension.class)
class UpdateQueryServiceTest {

	@Mock
	private UpdateRepository updateRepository;

	@Mock
	private UpdateValidationService updateValidationService;

	@Mock
	private UpdateMapper updateMapper;

	@InjectMocks
	private UpdateQueryService updateQueryService;

	private Update update;
	private UpdateResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		update = new Update();
		update.setId("update-id");
		update.setRequestId("request-id");
		update.setDescription("Status atualizado");
		update.setUpdatedAt(LocalDateTime.now());

		responseDTO = new UpdateResponseDTO();
		responseDTO.setId("update-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setDescription("Status atualizado");
		responseDTO.setUpdatedAt(update.getUpdatedAt());
	}

	@Test
	void findAll_shouldReturnAllUpdates() {

		when(updateRepository.findAll()).thenReturn(List.of(update));
		when(updateMapper.toResponse(update)).thenReturn(responseDTO);

		List<UpdateResponseDTO> result = updateQueryService.findAll();
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(updateRepository).findAll();
		verify(updateMapper).toResponse(update);
	}

	@Test
	void findByRequest_shouldReturnUpdatesFromRequest() {

		Request requestMock = mock(Request.class);

		when(updateValidationService.validateRequest("request-id")).thenReturn(requestMock);
		when(updateRepository.findByRequestIdOrderByUpdatedAtAsc("request-id")).thenReturn(List.of(update));
		when(updateMapper.toResponse(update)).thenReturn(responseDTO);

		List<UpdateResponseDTO> result = updateQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(updateValidationService).validateRequest("request-id");
		verify(updateRepository).findByRequestIdOrderByUpdatedAtAsc("request-id");
		verify(updateMapper).toResponse(update);
	}
}