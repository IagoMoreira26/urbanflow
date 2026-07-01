package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestDetailsDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
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
		return request;
	}

	public void updateEntity(Request request, UpdateRequestDTO dto) {
		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());
	}

	public RequestResponseDTO toResponse(Request request) {
		RequestResponseDTO dto = new RequestResponseDTO();
		dto.setId(request.getId());
		dto.setTitle(request.getTitle());
		dto.setDescription(request.getDescription());
		dto.setUserId(request.getUserId());
		dto.setCategoryId(request.getCategoryId());
		dto.setSubCategoryId(request.getSubCategoryId());
		dto.setCitizenPriority(request.getCitizenPriority());
		dto.setStatus(request.getStatus());
		dto.setLatitude(request.getLatitude());
		dto.setLongitude(request.getLongitude());

		if (request.getAddress() != null) {
			dto.setAddress(addressMapper.toResponse(request.getAddress()));
		}

		dto.setDepartmentId(request.getDepartmentId());
		dto.setCreatedAt(request.getCreatedAt());
		return dto;
	}

	public RequestDetailsDTO toDetailsResponse(Request request) {
		RequestDetailsDTO dto = new RequestDetailsDTO();
		dto.setId(request.getId());
		dto.setTitle(request.getTitle());
		dto.setDescription(request.getDescription());
		dto.setStatus(request.getStatus());
		dto.setCitizenPriority(request.getCitizenPriority());
		dto.setLatitude(request.getLatitude());
		dto.setLongitude(request.getLongitude());
		dto.setCreatedAt(request.getCreatedAt());
		dto.setCategoryId(request.getCategoryId());
		dto.setSubCategoryId(request.getSubCategoryId());

		if (request.getAddress() != null) {
			dto.setAddress(addressMapper.toResponse(request.getAddress()));
		}

		dto.setLegislationIds(request.getLegislationIds());
		return dto;
	}

	public RequestStatisticsDTO toStatisticsResponse(Integer totalRequests, Integer receivedRequests,
			Integer inProgressRequests, Integer resolvedRequests, Integer cancelledRequests, Double resolutionRate) {
		RequestStatisticsDTO dto = new RequestStatisticsDTO();
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setResolutionRate(resolutionRate);
		return dto;
	}
}