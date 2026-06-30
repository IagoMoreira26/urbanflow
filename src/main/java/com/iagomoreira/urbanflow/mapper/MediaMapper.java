package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.media.CreateMediaDTO;
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
}