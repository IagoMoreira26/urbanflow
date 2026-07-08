package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.model.Media;
import com.iagomoreira.urbanflow.model.enums.MediaType;

class MediaMapperTest {

	private MediaMapper mediaMapper;

	@BeforeEach
	void setUp() {
		mediaMapper = new MediaMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateMediaDTO dto = new CreateMediaDTO();
		dto.setType(MediaType.IMAGE);
		dto.setUrl("http://example.com/image.jpg");
		dto.setRequestId("req-123");

		Media entity = mediaMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getType(), entity.getType());
		assertEquals(dto.getUrl(), entity.getUrl());
		assertEquals(dto.getRequestId(), entity.getRequestId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Media media = new Media();
		media.setId("med-1");
		media.setType(MediaType.IMAGE);
		media.setUrl("http://example.com/image.jpg");
		media.setUploadedAt(LocalDateTime.now());
		media.setRequestId("req-123");

		MediaResponseDTO dto = mediaMapper.toResponse(media);

		assertNotNull(dto);
		assertEquals(media.getId(), dto.getId());
		assertEquals(media.getType(), dto.getType());
		assertEquals(media.getUrl(), dto.getUrl());
		assertEquals(media.getUploadedAt(), dto.getUploadedAt());
		assertEquals(media.getRequestId(), dto.getRequestId());
	}

	@Test
	void toResponse_shouldReturnNullWhenMediaIsNull() {
		MediaResponseDTO dto = mediaMapper.toResponse(null);
		assertNull(dto);
	}
}