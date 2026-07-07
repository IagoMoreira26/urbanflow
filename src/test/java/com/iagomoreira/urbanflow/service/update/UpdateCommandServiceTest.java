package com.iagomoreira.urbanflow.service.update;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.mapper.UpdateMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UpdateRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@ExtendWith(MockitoExtension.class)
class UpdateCommandServiceTest {

	@Mock
	private UpdateRepository updateRepository;

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private UpdateValidationService updateValidationService;

	@Mock
	private UpdateMapper updateMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private UpdateCommandService updateCommandService;

	private CreateUpdateDTO createDTO;
	private Update update;
	private Request request;
	private UpdateResponseDTO responseDTO;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateUpdateDTO();
		createDTO.setRequestId("request-id");
		createDTO.setDescription("Equipe enviada ao local.");
		createDTO.setStatus(RequestStatus.IN_PROGRESS);

		request = new Request();
		request.setId("request-id");
		request.setStatus(RequestStatus.APPROVED);

		update = new Update();
		update.setId("update-id");
		update.setRequestId("request-id");
		update.setDescription("Equipe enviada ao local.");
		update.setStatus(RequestStatus.IN_PROGRESS);

		responseDTO = new UpdateResponseDTO();
		responseDTO.setId("update-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setDescription("Equipe enviada ao local.");
		responseDTO.setStatus(RequestStatus.IN_PROGRESS);
		responseDTO.setUpdatedAt(now);
	}

	@Test
	void shouldCreateUpdate() {

		when(updateValidationService.validateRequest(createDTO.getRequestId())).thenReturn(request);
		when(updateMapper.toEntity(createDTO)).thenReturn(update);
		when(dateTimeProvider.now()).thenReturn(now);
		when(updateRepository.save(update)).thenReturn(update);
		when(updateMapper.toResponse(update)).thenReturn(responseDTO);

		UpdateResponseDTO result = updateCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, update.getUpdatedAt());
		assertEquals(RequestStatus.IN_PROGRESS, request.getStatus());
		assertEquals(now, request.getUpdatedAt());

		verify(updateValidationService).validateRequest(createDTO.getRequestId());
		verify(updateMapper).toEntity(createDTO);
		verify(updateRepository).save(update);
		verify(requestRepository).save(request);
		verify(updateMapper).toResponse(update);
	}
}