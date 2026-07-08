package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.requesthistory.RequestHistoryResponseDTO;
import com.iagomoreira.urbanflow.model.RequestHistory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

class RequestHistoryMapperTest {

    private RequestHistoryMapper requestHistoryMapper;

    @BeforeEach
    void setUp() {
        requestHistoryMapper = new RequestHistoryMapper();
    }

    @Test
    void toResponse_shouldMapEntityToResponseDto() {
        RequestHistory history = new RequestHistory();
        history.setId("hist-1");
        history.setOldStatus(RequestStatus.RECEIVED);
        history.setNewStatus(RequestStatus.IN_PROGRESS);
        history.setChangedBy("Operador Teste");
        history.setNote("Iniciando atendimento");
        history.setChangedAt(LocalDateTime.now());

        RequestHistoryResponseDTO dto = requestHistoryMapper.toResponse(history);

        assertNotNull(dto);
        assertEquals(history.getId(), dto.getId());
        assertEquals(history.getOldStatus(), dto.getOldStatus());
        assertEquals(history.getNewStatus(), dto.getNewStatus());
        assertEquals(history.getChangedBy(), dto.getChangedBy());
        assertEquals(history.getNote(), dto.getNote());
        assertEquals(history.getChangedAt(), dto.getChangedAt());
    }

    @Test
    void toResponse_shouldReturnNullWhenHistoryIsNull() {
        RequestHistoryResponseDTO dto = requestHistoryMapper.toResponse(null);
        assertNull(dto);
    }
}