package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
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
}