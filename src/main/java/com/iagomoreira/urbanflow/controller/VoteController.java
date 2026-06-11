package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.vote.CreateVoteDTO;
import com.iagomoreira.urbanflow.dto.vote.RequestPriorityDTO;
import com.iagomoreira.urbanflow.dto.vote.VoteResponseDTO;
import com.iagomoreira.urbanflow.service.VoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/votes")
public class VoteController {

	@Autowired
	private VoteService voteService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public VoteResponseDTO create(@Valid @RequestBody CreateVoteDTO dto) {
		return voteService.create(dto);
	}

	@GetMapping
	public List<VoteResponseDTO> findAll() {
		return voteService.findAll();
	}

	@GetMapping("/request/{requestId}")
	public List<VoteResponseDTO> findByRequest(@PathVariable String requestId) {
		return voteService.findByRequest(requestId);
	}

	@GetMapping("/request/{requestId}/priority")
	public RequestPriorityDTO getRequestPriority(@PathVariable String requestId) {
		return voteService.getRequestPriority(requestId);
	}
}
