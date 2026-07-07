package com.iagomoreira.urbanflow.service.vote;

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

import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.mapper.VoteMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@ExtendWith(MockitoExtension.class)
class VoteQueryServiceTest {

	@Mock
	private VoteRepository voteRepository;

	@Mock
	private VoteValidationService voteValidationService;

	@Mock
	private VoteMapper voteMapper;

	@InjectMocks
	private VoteQueryService voteQueryService;

	private Vote vote;
	private VoteResponseDTO responseDTO;
	private RequestPriorityDTO priorityDTO;

	@BeforeEach
	void setUp() {
		vote = new Vote();
		vote.setId("vote-id");
		vote.setUserId("user-id");
		vote.setRequestId("request-id");
		vote.setPriorityLevel(PriorityLevel.HIGH);
		vote.setCreatedAt(LocalDateTime.now());

		responseDTO = new VoteResponseDTO();
		responseDTO.setId("vote-id");
		responseDTO.setUserId("user-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setPriorityLevel(PriorityLevel.HIGH);

		priorityDTO = new RequestPriorityDTO();
	}

	@Test
	void shouldFindAllVotes() {
		when(voteRepository.findAll()).thenReturn(List.of(vote));
		when(voteMapper.toResponse(vote)).thenReturn(responseDTO);

		List<VoteResponseDTO> result = voteQueryService.findAll();

		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(voteRepository).findAll();
		verify(voteMapper).toResponse(vote);
	}

	@Test
	void shouldFindVotesByRequest() {

		Request requestMock = mock(Request.class);

		when(voteValidationService.validateRequest("request-id")).thenReturn(requestMock);
		when(voteRepository.findByRequestId("request-id")).thenReturn(List.of(vote));
		when(voteMapper.toResponse(vote)).thenReturn(responseDTO);

		List<VoteResponseDTO> result = voteQueryService.findByRequest("request-id");
		assertThat(result).hasSize(1);
		assertThat(result.get(0)).isEqualTo(responseDTO);

		verify(voteValidationService).validateRequest("request-id");
		verify(voteRepository).findByRequestId("request-id");
		verify(voteMapper).toResponse(vote);
	}

	@Test
	void shouldReturnPriorityStatistics() {

		Request requestMock = mock(Request.class);
		when(voteValidationService.validateRequest("request-id")).thenReturn(requestMock);

		Vote low = new Vote();
		low.setPriorityLevel(PriorityLevel.LOW);

		Vote medium = new Vote();
		medium.setPriorityLevel(PriorityLevel.MEDIUM);

		Vote high = new Vote();
		high.setPriorityLevel(PriorityLevel.HIGH);

		when(voteRepository.findByRequestId("request-id")).thenReturn(List.of(low, medium, high));
		when(voteMapper.toPriorityResponse(1, 1, 1, 3, 33.333333333333336, 33.333333333333336, 33.333333333333336))
				.thenReturn(priorityDTO);

		RequestPriorityDTO result = voteQueryService.getRequestPriority("request-id");
		assertThat(result).isEqualTo(priorityDTO);

		verify(voteValidationService).validateRequest("request-id");
		verify(voteRepository).findByRequestId("request-id");
		verify(voteMapper).toPriorityResponse(1, 1, 1, 3, 33.333333333333336, 33.333333333333336, 33.333333333333336);
	}

	@Test
	void shouldReturnEmptyPriorityStatisticsWhenNoVotesExist() {

		Request requestMock = mock(Request.class);

		when(voteValidationService.validateRequest("request-id")).thenReturn(requestMock);
		when(voteRepository.findByRequestId("request-id")).thenReturn(List.of());
		when(voteMapper.toPriorityResponse(0, 0, 0, 0, 0.0, 0.0, 0.0)).thenReturn(priorityDTO);

		RequestPriorityDTO result = voteQueryService.getRequestPriority("request-id");
		assertThat(result).isEqualTo(priorityDTO);

		verify(voteValidationService).validateRequest("request-id");
		verify(voteRepository).findByRequestId("request-id");
		verify(voteMapper).toPriorityResponse(0, 0, 0, 0, 0.0, 0.0, 0.0);
	}
}