package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.model.Vote;

@Component
public class VoteMapper {

	public Vote toEntity(CreateVoteDTO dto, String userId) {

		Vote vote = new Vote();

		vote.setUserId(userId);
		vote.setRequestId(dto.getRequestId());
		vote.setPriorityLevel(dto.getPriorityLevel());

		return vote;
	}

	public VoteResponseDTO toResponse(Vote vote) {
		VoteResponseDTO dto = new VoteResponseDTO();
		dto.setId(vote.getId());
		dto.setUserId(vote.getUserId());
		dto.setRequestId(vote.getRequestId());
		dto.setPriorityLevel(vote.getPriorityLevel());
		dto.setCreatedAt(vote.getCreatedAt());
		return dto;
	}

	public RequestPriorityDTO toPriorityResponse(Integer lowVotes, Integer mediumVotes, Integer highVotes,
			Integer totalVotes, Double lowPercentage, Double mediumPercentage, Double highPercentage) {
		RequestPriorityDTO dto = new RequestPriorityDTO();
		dto.setLowVotes(lowVotes);
		dto.setMediumVotes(mediumVotes);
		dto.setHighVotes(highVotes);
		dto.setTotalVotes(totalVotes);
		dto.setLowPercentage(lowPercentage);
		dto.setMediumPercentage(mediumPercentage);
		dto.setHighPercentage(highPercentage);
		return dto;
	}
}