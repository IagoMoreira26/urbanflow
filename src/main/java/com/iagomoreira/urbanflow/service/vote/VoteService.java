package com.iagomoreira.urbanflow.service.vote;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;

@Service
public class VoteService {

	@Autowired
	private VoteCommandService voteCommandService;

	@Autowired
	private VoteQueryService voteQueryService;

	public VoteResponseDTO create(CreateVoteDTO dto) {
		return voteCommandService.create(dto);
	}

	public List<VoteResponseDTO> findAll() {
		return voteQueryService.findAll();
	}

	public List<VoteResponseDTO> findByRequest(String requestId) {
		return voteQueryService.findByRequest(requestId);
	}

	public RequestPriorityDTO getRequestPriority(String requestId) {
		return voteQueryService.getRequestPriority(requestId);
	}
}