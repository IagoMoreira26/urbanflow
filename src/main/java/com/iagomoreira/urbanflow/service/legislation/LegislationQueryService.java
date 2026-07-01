package com.iagomoreira.urbanflow.service.legislation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.mapper.LegislationMapper;
import com.iagomoreira.urbanflow.model.Legislation;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@Service
public class LegislationQueryService {

	private final LegislationRepository legislationRepository;
	private final LegislationValidationService legislationValidationService;
	private final LegislationMapper legislationMapper;

	public LegislationQueryService(LegislationRepository legislationRepository,
			LegislationValidationService legislationValidationService, LegislationMapper legislationMapper) {
		this.legislationRepository = legislationRepository;
		this.legislationValidationService = legislationValidationService;
		this.legislationMapper = legislationMapper;
	}

	public List<LegislationResponseDTO> findAll() {
		return legislationRepository.findAll().stream().map(legislationMapper::toResponse).toList();
	}

	public LegislationResponseDTO findById(String id) {
		Legislation legislation = legislationValidationService.validateLegislationExists(id);
		return legislationMapper.toResponse(legislation);
	}

	public List<LegislationResponseDTO> findByKeyword(String keyword) {
		return legislationRepository.searchByKeyword(keyword).stream().map(legislationMapper::toResponse).toList();
	}
}