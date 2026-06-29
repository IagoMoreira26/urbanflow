package com.iagomoreira.urbanflow.service.legislation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;

@Service
public class LegislationService {

	@Autowired
	private LegislationQueryService legislationQueryService;

	public List<LegislationResponseDTO> findAll() {
		return legislationQueryService.findAll();
	}

	public LegislationResponseDTO findById(String id) {
		return legislationQueryService.findById(id);
	}

	public List<LegislationResponseDTO> findByKeyword(String keyword) {
		return legislationQueryService.findByKeyword(keyword);
	}
}
