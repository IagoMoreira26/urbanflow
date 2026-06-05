package com.iagomoreira.urbanflow.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Legislation;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@Service
public class LegislationService {

	@Autowired
	private LegislationRepository legislationRepository;

	public List<LegislationResponseDTO> findAll() {

		return legislationRepository.findAll().stream().map(LegislationResponseDTO::new).collect(Collectors.toList());
	}

	public LegislationResponseDTO findById(String id) {

		Legislation legislation = legislationRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Legislation not found"));

		return new LegislationResponseDTO(legislation);
	}

	public List<LegislationResponseDTO> findByKeyword(String keyword) {

		return legislationRepository.searchByKeyword(keyword).stream().map(LegislationResponseDTO::new)
				.collect(Collectors.toList());
	}
}