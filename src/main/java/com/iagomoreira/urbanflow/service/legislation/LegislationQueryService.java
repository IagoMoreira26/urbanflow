package com.iagomoreira.urbanflow.service.legislation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@Service
public class LegislationQueryService {

	private final LegislationRepository legislationRepository;
	private final LegislationValidationService legislationValidationService;

	public LegislationQueryService(LegislationRepository legislationRepository,
			LegislationValidationService legislationValidationService) {
		super();
		this.legislationRepository = legislationRepository;
		this.legislationValidationService = legislationValidationService;
	}

	public List<LegislationResponseDTO> findAll() {
		return legislationRepository.findAll().stream().map(LegislationResponseDTO::new).toList();
	}

	public LegislationResponseDTO findById(String id) {
		return new LegislationResponseDTO(legislationValidationService.validateLegislationExists(id));
	}

	public List<LegislationResponseDTO> findByKeyword(String keyword) {
		return legislationRepository.searchByKeyword(keyword).stream().map(LegislationResponseDTO::new).toList();
	}
}