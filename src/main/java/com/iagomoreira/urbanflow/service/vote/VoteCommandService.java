package com.iagomoreira.urbanflow.service.vote;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.mapper.VoteMapper;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.repository.VoteRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class VoteCommandService {

	private final VoteRepository voteRepository;
	private final VoteValidationService voteValidationService;
	private final SecurityService securityService;
	private final VoteMapper voteMapper;
	private final DateTimeProvider dateTimeProvider;

	public VoteCommandService(VoteRepository voteRepository, VoteValidationService voteValidationService,
			SecurityService securityService, VoteMapper voteMapper, DateTimeProvider dateTimeProvider) {
		this.voteRepository = voteRepository;
		this.voteValidationService = voteValidationService;
		this.securityService = securityService;
		this.voteMapper = voteMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public VoteResponseDTO create(CreateVoteDTO dto) {
		String userId = securityService.getAuthenticatedUserId();

		voteValidationService.validateRequest(dto.getRequestId());
		voteValidationService.validateOwnVote(userId, dto.getRequestId());
		voteValidationService.validateDuplicateVote(userId, dto.getRequestId());

		Vote vote = voteMapper.toEntity(dto, userId);
		vote.setCreatedAt(dateTimeProvider.now());

		vote = voteRepository.save(vote);
		return voteMapper.toResponse(vote);
	}
}