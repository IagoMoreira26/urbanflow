package com.iagomoreira.urbanflow.service.vote;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.repository.VoteRepository;
import com.iagomoreira.urbanflow.service.SecurityService;

@Service
public class VoteCommandService {

	@Autowired
	private VoteRepository voteRepository;

	@Autowired
	private VoteValidationService validationService;

	@Autowired
	private SecurityService securityService;

	private Vote fromDTO(CreateVoteDTO dto, String userId) {

		Vote vote = new Vote();

		vote.setUserId(userId);
		vote.setRequestId(dto.getRequestId());
		vote.setPriorityLevel(dto.getPriorityLevel());

		return vote;
	}

	public VoteResponseDTO create(CreateVoteDTO dto) {

		String userId = securityService.getAuthenticatedUserId();

		validationService.validateUser(userId);

		validationService.validateRequest(dto.getRequestId());

		validationService.validateOwnVote(userId, dto.getRequestId());

		validationService.validateDuplicateVote(userId, dto.getRequestId());

		Vote vote = fromDTO(dto, userId);

		vote.setCreatedAt(LocalDateTime.now());

		vote = voteRepository.save(vote);

		return new VoteResponseDTO(vote);
	}
}