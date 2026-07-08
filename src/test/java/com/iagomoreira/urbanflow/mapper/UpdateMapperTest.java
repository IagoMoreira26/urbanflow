package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.model.Update;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

class UpdateMapperTest {

	private UpdateMapper updateMapper;

	@BeforeEach
	void setUp() {
		updateMapper = new UpdateMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateUpdateDTO dto = new CreateUpdateDTO();
		dto.setStatus(RequestStatus.IN_PROGRESS);
		dto.setDescription("Atualizando status");
		dto.setRequestId("req-123");

		Update entity = updateMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getStatus(), entity.getStatus());
		assertEquals(dto.getDescription(), entity.getDescription());
		assertEquals(dto.getRequestId(), entity.getRequestId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Update update = new Update();
		update.setId("upd-1");
		update.setStatus(RequestStatus.IN_PROGRESS);
		update.setDescription("Atualizando status");
		update.setUpdatedAt(LocalDateTime.now());
		update.setRequestId("req-123");

		UpdateResponseDTO dto = updateMapper.toResponse(update);

		assertNotNull(dto);
		assertEquals(update.getId(), dto.getId());
		assertEquals(update.getStatus(), dto.getStatus());
		assertEquals(update.getDescription(), dto.getDescription());
		assertEquals(update.getUpdatedAt(), dto.getUpdatedAt());
		assertEquals(update.getRequestId(), dto.getRequestId());
	}

	@Test
	void toResponse_shouldReturnNullWhenUpdateIsNull() {
		UpdateResponseDTO dto = updateMapper.toResponse(null);
		assertNull(dto);
	}
}