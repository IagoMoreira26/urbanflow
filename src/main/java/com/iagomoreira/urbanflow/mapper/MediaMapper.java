package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
import com.iagomoreira.urbanflow.dto.media.MediaResponseDTO;
import com.iagomoreira.urbanflow.model.Media;

@Component
public class MediaMapper {

	public Media toEntity(CreateMediaDTO dto) {
		Media media = new Media();
		media.setType(dto.getType());
		media.setUrl(dto.getUrl());
		media.setRequestId(dto.getRequestId());
		return media;
	}

	public MediaResponseDTO toResponse(Media media) {

		if (media == null) {
			return null;
		}

		MediaResponseDTO dto = new MediaResponseDTO();
		dto.setId(media.getId());
		dto.setType(media.getType());
		dto.setUrl(media.getUrl());
		dto.setUploadedAt(media.getUploadedAt());
		dto.setRequestId(media.getRequestId());
		return dto;
	}
}