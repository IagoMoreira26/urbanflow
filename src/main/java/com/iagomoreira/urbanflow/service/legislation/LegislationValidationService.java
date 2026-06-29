package com.iagomoreira.urbanflow.service.legislation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Legislation;
import com.iagomoreira.urbanflow.repository.LegislationRepository;

@Service
public class LegislationValidationService {

	@Autowired
	private LegislationRepository legislationRepository;

	public Legislation validateLegislationExists(String id) {

		return legislationRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Legislation not found"));
	}
}