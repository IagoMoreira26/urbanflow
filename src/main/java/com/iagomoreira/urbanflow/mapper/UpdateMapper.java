package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.update.CreateUpdateDTO;
import com.iagomoreira.urbanflow.dto.update.UpdateResponseDTO;
import com.iagomoreira.urbanflow.model.Update;

@Component
public class UpdateMapper {

	public Update toEntity(CreateUpdateDTO dto) {
		Update update = new Update();
		update.setStatus(dto.getStatus());
		update.setDescription(dto.getDescription());
		update.setRequestId(dto.getRequestId());

		return update;
	}

	public UpdateResponseDTO toResponse(Update update) {

		if (update == null) {
			return null;
		}

		UpdateResponseDTO dto = new UpdateResponseDTO();
		dto.setId(update.getId());
		dto.setStatus(update.getStatus());
		dto.setDescription(update.getDescription());
		dto.setUpdatedAt(update.getUpdatedAt());
		dto.setRequestId(update.getRequestId());
		return dto;
	}
}