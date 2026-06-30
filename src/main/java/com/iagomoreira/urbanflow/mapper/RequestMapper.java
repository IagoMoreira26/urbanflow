package com.iagomoreira.urbanflow.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.model.Request;

@Component
public class RequestMapper {

	private final AddressMapper addressMapper;

	public RequestMapper(AddressMapper addressMapper) {
		this.addressMapper = addressMapper;
	}

	public Request toEntity(CreateRequestDTO dto) {

		Request request = new Request();

		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());
		request.setCategoryId(dto.getCategoryId());
		request.setSubCategoryId(dto.getSubCategoryId());
		request.setCitizenPriority(dto.getCitizenPriority());
		request.setLatitude(dto.getLatitude());
		request.setLongitude(dto.getLongitude());
		request.setAddress(addressMapper.toEntity(dto.getAddress()));
		request.setCreatedAt(LocalDateTime.now());
		request.setUpdatedAt(LocalDateTime.now());

		return request;
	}

	public void updateEntity(Request request, UpdateRequestDTO dto) {
		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());
		request.setUpdatedAt(LocalDateTime.now());
	}

}