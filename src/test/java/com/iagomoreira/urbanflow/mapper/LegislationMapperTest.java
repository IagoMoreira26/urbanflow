package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.legislation.LegislationResponseDTO;
import com.iagomoreira.urbanflow.model.Legislation;

class LegislationMapperTest {

	private LegislationMapper legislationMapper;

	@BeforeEach
	void setUp() {
		legislationMapper = new LegislationMapper();
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Legislation legislation = new Legislation();
		legislation.setId("leg-1");
		legislation.setTitle("Lei de Mobilidade Urbana");
		legislation.setDescription("Regulamenta a mobilidade urbana");
		legislation.setDocumentUrl("http://example.com/doc.pdf");
		List<String> keywords = Arrays.asList("mobilidade", "transporte", "urbano");
		legislation.setKeywords(keywords);

		LegislationResponseDTO dto = legislationMapper.toResponse(legislation);

		assertNotNull(dto);
		assertEquals(legislation.getId(), dto.getId());
		assertEquals(legislation.getTitle(), dto.getTitle());
		assertEquals(legislation.getDescription(), dto.getDescription());
		assertEquals(legislation.getDocumentUrl(), dto.getDocumentUrl());
		assertEquals(legislation.getKeywords(), dto.getKeywords());
	}

	@Test
	void toResponse_shouldReturnNullWhenLegislationIsNull() {
		LegislationResponseDTO dto = legislationMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toResponse_shouldHandleNullKeywords() {
		Legislation legislation = new Legislation();
		legislation.setId("leg-1");
		legislation.setTitle("Lei de Mobilidade Urbana");
		legislation.setDescription("Regulamenta a mobilidade urbana");
		legislation.setDocumentUrl("http://example.com/doc.pdf");
		legislation.setKeywords(null);

		LegislationResponseDTO dto = legislationMapper.toResponse(legislation);

		assertNotNull(dto);
		assertEquals(legislation.getId(), dto.getId());
		assertEquals(legislation.getTitle(), dto.getTitle());
		assertEquals(legislation.getDescription(), dto.getDescription());
		assertEquals(legislation.getDocumentUrl(), dto.getDocumentUrl());
		assertNull(dto.getKeywords());
	}
}