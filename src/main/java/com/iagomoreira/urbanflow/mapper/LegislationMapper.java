package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.model.Legislation;

@Component
public class LegislationMapper {

	public LegislationResponseDTO toResponse(Legislation legislation) {

		if (legislation == null) {
			return null;
		}

		LegislationResponseDTO dto = new LegislationResponseDTO();
		dto.setId(legislation.getId());
		dto.setTitle(legislation.getTitle());
		dto.setDescription(legislation.getDescription());
		dto.setDocumentUrl(legislation.getDocumentUrl());
		dto.setKeywords(legislation.getKeywords());
		return dto;
	}
}
