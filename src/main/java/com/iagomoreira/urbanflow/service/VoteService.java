package com.iagomoreira.urbanflow.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.Vote;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@Service
public class VoteService {

	@Autowired
	private VoteRepository voteRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RequestRepository requestRepository;

	private Vote fromDTO(CreateVoteDTO dto) {

		Vote vote = new Vote();

		vote.setUserId(dto.getUserId());
		vote.setRequestId(dto.getRequestId());
		vote.setPriorityLevel(dto.getPriorityLevel());

		return vote;
	}

	public VoteResponseDTO create(CreateVoteDTO dto) {

		validateUser(dto.getUserId());

		validateRequest(dto.getRequestId());

		validateOwnVote(dto.getUserId(), dto.getRequestId());

		validateDuplicateVote(dto.getUserId(), dto.getRequestId());

		Vote vote = fromDTO(dto);

		vote.setCreatedAt(LocalDateTime.now());

		vote = voteRepository.save(vote);

		return new VoteResponseDTO(vote);
	}

	public List<VoteResponseDTO> findAll() {

		return voteRepository.findAll().stream().map(VoteResponseDTO::new).collect(Collectors.toList());
	}

	public List<VoteResponseDTO> findByRequest(String requestId) {

		validateRequest(requestId);

		return voteRepository.findByRequestId(requestId).stream().map(VoteResponseDTO::new)
				.collect(Collectors.toList());
	}

	public RequestPriorityDTO getRequestPriority(String requestId) {

		validateRequest(requestId);

		List<Vote> votes = voteRepository.findByRequestId(requestId);

		int totalVotes = votes.size();

		if (totalVotes == 0) {

			return new RequestPriorityDTO(0, 0, 0, 0, 0.0, 0.0, 0.0);
		}

		long lowVotes = votes.stream().filter(v -> v.getPriorityLevel() == PriorityLevel.LOW).count();

		long mediumVotes = votes.stream().filter(v -> v.getPriorityLevel() == PriorityLevel.MEDIUM).count();

		long highVotes = votes.stream().filter(v -> v.getPriorityLevel() == PriorityLevel.HIGH).count();

		double lowPercentage = (lowVotes * 100.0) / totalVotes;

		double mediumPercentage = (mediumVotes * 100.0) / totalVotes;

		double highPercentage = (highVotes * 100.0) / totalVotes;

		return new RequestPriorityDTO((int) lowVotes, (int) mediumVotes, (int) highVotes, totalVotes, lowPercentage,
				mediumPercentage, highPercentage);
	}

	private void validateUser(String userId) {

		if (!userRepository.existsById(userId)) {

			throw new ResourceNotFoundException("User not found");
		}
	}

	private void validateRequest(String requestId) {

		if (!requestRepository.existsById(requestId)) {

			throw new ResourceNotFoundException("Request not found");
		}
	}

	private void validateDuplicateVote(String userId, String requestId) {

		if (voteRepository.existsByUserIdAndRequestId(userId, requestId)) {

			throw new BusinessException("User has already voted on this request");
		}
	}

	private void validateOwnVote(String userId, String requestId) {

		Request request = requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		if (request.getUserId().equals(userId)) {

			throw new BusinessException("Users cannot vote on their own requests");
		}
	}
}
