package com.iagomoreira.urbanflow.service.vote;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.mapper.VoteMapper;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@Service
public class VoteQueryService {

	private final VoteRepository voteRepository;
	private final VoteValidationService voteValidationService;
	private final VoteMapper voteMapper;

	public VoteQueryService(VoteRepository voteRepository, VoteValidationService voteValidationService,
			VoteMapper voteMapper) {
		this.voteRepository = voteRepository;
		this.voteValidationService = voteValidationService;
		this.voteMapper = voteMapper;
	}

	public List<VoteResponseDTO> findAll() {
		return voteRepository.findAll().stream().map(voteMapper::toResponse).toList();
	}

	public List<VoteResponseDTO> findByRequest(String requestId) {
		voteValidationService.validateRequest(requestId);
		return voteRepository.findByRequestId(requestId).stream().map(voteMapper::toResponse).toList();
	}

	public RequestPriorityDTO getRequestPriority(String requestId) {
		voteValidationService.validateRequest(requestId);
		List<Vote> votes = voteRepository.findByRequestId(requestId);

		int totalVotes = votes.size();

		if (totalVotes == 0) {
			return voteMapper.toPriorityResponse(0, 0, 0, 0, 0.0, 0.0, 0.0);
		}

		long lowVotes = votes.stream().filter(v -> v.getPriorityLevel() == PriorityLevel.LOW).count();
		long mediumVotes = votes.stream().filter(v -> v.getPriorityLevel() == PriorityLevel.MEDIUM).count();
		long highVotes = votes.stream().filter(v -> v.getPriorityLevel() == PriorityLevel.HIGH).count();

		double lowPercentage = lowVotes * 100.0 / totalVotes;
		double mediumPercentage = mediumVotes * 100.0 / totalVotes;
		double highPercentage = highVotes * 100.0 / totalVotes;

		return voteMapper.toPriorityResponse((int) lowVotes, (int) mediumVotes, (int) highVotes, totalVotes,
				lowPercentage, mediumPercentage, highPercentage);
	}
}