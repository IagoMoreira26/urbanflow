package com.iagomoreira.urbanflow.service.requesthistory;

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

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.RequestHistoryMapper;
import com.iagomoreira.urbanflow.model.RequestHistory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestHistoryRepository;

@ExtendWith(MockitoExtension.class)
class RequestHistoryQueryServiceTest {

	@Mock
	private RequestHistoryRepository requestHistoryRepository;

	@Mock
	private RequestHistoryValidationService requestHistoryValidationService;

	@Mock
	private RequestHistoryMapper requestHistoryMapper;

	@InjectMocks
	private RequestHistoryQueryService requestHistoryQueryService;

	private RequestHistory history;
	private RequestHistoryResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		history = new RequestHistory();
		history.setId("history-id");
		history.setRequestId("request-id");
		history.setOldStatus(RequestStatus.RECEIVED);
		history.setNewStatus(RequestStatus.UNDER_REVIEW);
		history.setChangedAt(LocalDateTime.now());

		responseDTO = new RequestHistoryResponseDTO();
		responseDTO.setId("history-id");
		responseDTO.setOldStatus(RequestStatus.RECEIVED);
		responseDTO.setNewStatus(RequestStatus.UNDER_REVIEW);
		responseDTO.setChangedAt(history.getChangedAt());
	}

	@Test
	void shouldFindRequestHistoryByRequest() {

		doNothing().when(requestHistoryValidationService).validateRequest("request-id");
		when(requestHistoryRepository.findByRequestIdOrderByChangedAtAsc("request-id")).thenReturn(List.of(history));
		when(requestHistoryMapper.toResponse(history)).thenReturn(responseDTO);

		List<RequestHistoryResponseDTO> result = requestHistoryQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(requestHistoryValidationService).validateRequest("request-id");
		verify(requestHistoryRepository).findByRequestIdOrderByChangedAtAsc("request-id");
		verify(requestHistoryMapper).toResponse(history);
	}
}