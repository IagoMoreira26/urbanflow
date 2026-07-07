package com.iagomoreira.urbanflow.service.vote;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.mapper.VoteMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.repository.VoteRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@ExtendWith(MockitoExtension.class)
class VoteCommandServiceTest {

	@Mock
	private VoteRepository voteRepository;

	@Mock
	private VoteValidationService voteValidationService;

	@Mock
	private SecurityService securityService;

	@Mock
	private VoteMapper voteMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private VoteCommandService voteCommandService;

	private CreateVoteDTO createDTO;
	private Vote vote;
	private VoteResponseDTO responseDTO;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateVoteDTO();
		createDTO.setRequestId("request-id");
		createDTO.setPriorityLevel(PriorityLevel.HIGH);

		vote = new Vote();
		vote.setId("vote-id");
		vote.setUserId("user-id");
		vote.setRequestId("request-id");
		vote.setPriorityLevel(PriorityLevel.HIGH);

		responseDTO = new VoteResponseDTO();
		responseDTO.setId("vote-id");
		responseDTO.setUserId("user-id");
		responseDTO.setRequestId("request-id");
		responseDTO.setPriorityLevel(PriorityLevel.HIGH);
		responseDTO.setCreatedAt(now);
	}

	@Test
	void shouldCreateVote() {

		Request request = new Request();

		when(securityService.getAuthenticatedUserId()).thenReturn("user-id");
		when(voteValidationService.validateRequest(createDTO.getRequestId())).thenReturn(request);

		doNothing().when(voteValidationService).validateOwnVote("user-id", createDTO.getRequestId());
		doNothing().when(voteValidationService).validateDuplicateVote("user-id", createDTO.getRequestId());

		when(voteMapper.toEntity(createDTO, "user-id")).thenReturn(vote);
		when(dateTimeProvider.now()).thenReturn(now);
		when(voteRepository.save(vote)).thenReturn(vote);
		when(voteMapper.toResponse(vote)).thenReturn(responseDTO);

		VoteResponseDTO result = voteCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, vote.getCreatedAt());

		verify(securityService).getAuthenticatedUserId();
		verify(voteValidationService).validateRequest(createDTO.getRequestId());
		verify(voteValidationService).validateOwnVote("user-id", createDTO.getRequestId());
		verify(voteValidationService).validateDuplicateVote("user-id", createDTO.getRequestId());
		verify(voteMapper).toEntity(createDTO, "user-id");
		verify(voteRepository).save(vote);
		verify(voteMapper).toResponse(vote);
	}
}