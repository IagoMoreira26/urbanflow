package com.iagomoreira.urbanflow.service.vote;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.mapper.VoteMapper;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.repository.VoteRepository;
import com.iagomoreira.urbanflow.service.SecurityService;

@Service
public class VoteCommandService {

	private final VoteRepository voteRepository;
	private final VoteValidationService voteValidationService;
	private final SecurityService securityService;
	private final VoteMapper voteMapper;

	public VoteCommandService(VoteRepository voteRepository, VoteValidationService voteValidationService,
			SecurityService securityService, VoteMapper voteMapper) {

		this.voteRepository = voteRepository;
		this.voteValidationService = voteValidationService;
		this.securityService = securityService;
		this.voteMapper = voteMapper;
	}

	public VoteResponseDTO create(CreateVoteDTO dto) {

		String userId = securityService.getAuthenticatedUserId();

		voteValidationService.validateRequest(dto.getRequestId());
		voteValidationService.validateOwnVote(userId, dto.getRequestId());
		voteValidationService.validateDuplicateVote(userId, dto.getRequestId());

		Vote vote = voteMapper.toEntity(dto, userId);
		vote.setCreatedAt(LocalDateTime.now());

		vote = voteRepository.save(vote);
		return new VoteResponseDTO(vote);
	}
}