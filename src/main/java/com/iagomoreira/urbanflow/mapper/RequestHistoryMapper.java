package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.model.RequestHistory;

@Component
public class RequestHistoryMapper {

	public RequestHistoryResponseDTO toResponse(RequestHistory history) {
		RequestHistoryResponseDTO dto = new RequestHistoryResponseDTO();
		dto.setId(history.getId());
		dto.setOldStatus(history.getOldStatus());
		dto.setNewStatus(history.getNewStatus());
		dto.setChangedBy(history.getChangedBy());
		dto.setNote(history.getNote());
		dto.setChangedAt(history.getChangedAt());
		return dto;
	}
}
