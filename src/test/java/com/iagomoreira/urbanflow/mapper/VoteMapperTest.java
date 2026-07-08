package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

class VoteMapperTest {

	private VoteMapper voteMapper;

	@BeforeEach
	void setUp() {
		voteMapper = new VoteMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoAndUserIdToEntity() {
		CreateVoteDTO dto = new CreateVoteDTO();
		dto.setRequestId("req-123");
		dto.setPriorityLevel(PriorityLevel.HIGH);

		String userId = "user-456";

		Vote entity = voteMapper.toEntity(dto, userId);

		assertNotNull(entity);
		assertEquals(userId, entity.getUserId());
		assertEquals(dto.getRequestId(), entity.getRequestId());
		assertEquals(dto.getPriorityLevel(), entity.getPriorityLevel());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Vote vote = new Vote();
		vote.setId("vote-1");
		vote.setUserId("user-456");
		vote.setRequestId("req-123");
		vote.setPriorityLevel(PriorityLevel.HIGH);
		vote.setCreatedAt(LocalDateTime.now());

		VoteResponseDTO dto = voteMapper.toResponse(vote);

		assertNotNull(dto);
		assertEquals(vote.getId(), dto.getId());
		assertEquals(vote.getUserId(), dto.getUserId());
		assertEquals(vote.getRequestId(), dto.getRequestId());
		assertEquals(vote.getPriorityLevel(), dto.getPriorityLevel());
		assertEquals(vote.getCreatedAt(), dto.getCreatedAt());
	}

	@Test
	void toResponse_shouldReturnNullWhenVoteIsNull() {
		VoteResponseDTO dto = voteMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toPriorityResponse_shouldMapAllFields() {
		Integer lowVotes = 1;
		Integer mediumVotes = 2;
		Integer highVotes = 3;
		Integer totalVotes = 6;
		Double lowPercentage = 16.67;
		Double mediumPercentage = 33.33;
		Double highPercentage = 50.0;

		RequestPriorityDTO dto = voteMapper.toPriorityResponse(lowVotes, mediumVotes, highVotes, totalVotes,
				lowPercentage, mediumPercentage, highPercentage);

		assertNotNull(dto);
		assertEquals(lowVotes, dto.getLowVotes());
		assertEquals(mediumVotes, dto.getMediumVotes());
		assertEquals(highVotes, dto.getHighVotes());
		assertEquals(totalVotes, dto.getTotalVotes());
		assertEquals(lowPercentage, dto.getLowPercentage());
		assertEquals(mediumPercentage, dto.getMediumPercentage());
		assertEquals(highPercentage, dto.getHighPercentage());
	}
}