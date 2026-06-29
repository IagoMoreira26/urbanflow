package com.iagomoreira.urbanflow.service.legislation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@Service
public class LegislationQueryService {

	@Autowired
	private LegislationRepository legislationRepository;

	@Autowired
	private LegislationValidationService validationService;

	public List<LegislationResponseDTO> findAll() {

		return legislationRepository.findAll().stream().map(LegislationResponseDTO::new).toList();
	}

	public LegislationResponseDTO findById(String id) {

		return new LegislationResponseDTO(validationService.validateLegislationExists(id));
	}

	public List<LegislationResponseDTO> findByKeyword(String keyword) {

		return legislationRepository.searchByKeyword(keyword).stream().map(LegislationResponseDTO::new).toList();
	}
}