package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestDetailsDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.RequestStatisticsDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.model.Address;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@ExtendWith(MockitoExtension.class)
class RequestMapperTest {

	@Mock
	private AddressMapper addressMapper;

	@InjectMocks
	private RequestMapper requestMapper;

	private CreateRequestDTO createDTO;
	private UpdateRequestDTO updateDTO;
	private Request request;
	private Address address;
	private AddressDTO addressDTO;
	private AddressResponseDTO addressResponseDTO;

	@BeforeEach
	void setUp() {
		addressDTO = new AddressDTO();
		addressDTO.setCep("01000-000");
		addressDTO.setStreet("Rua Exemplo");
		addressDTO.setNumber("123");
		addressDTO.setNeighborhood("Centro");
		addressDTO.setCity("São Paulo");
		addressDTO.setState("SP");

		addressResponseDTO = new AddressResponseDTO();
		addressResponseDTO.setCep("01000-000");
		addressResponseDTO.setStreet("Rua Exemplo");
		addressResponseDTO.setNumber("123");
		addressResponseDTO.setNeighborhood("Centro");
		addressResponseDTO.setCity("São Paulo");
		addressResponseDTO.setState("SP");

		address = new Address();
		address.setCep("01000-000");
		address.setStreet("Rua Exemplo");
		address.setNumber("123");
		address.setNeighborhood("Centro");
		address.setCity("São Paulo");
		address.setState("SP");

		createDTO = new CreateRequestDTO();
		createDTO.setTitle("Problema na iluminação");
		createDTO.setDescription("Poste queimado na rua");
		createDTO.setCategoryId("cat-1");
		createDTO.setSubCategoryId("sub-1");
		createDTO.setCitizenPriority(PriorityLevel.HIGH);
		createDTO.setLatitude(-23.5505);
		createDTO.setLongitude(-46.6333);
		createDTO.setAddress(addressDTO);

		updateDTO = new UpdateRequestDTO();
		updateDTO.setTitle("Problema na iluminação atualizado");
		updateDTO.setDescription("Poste queimado e fios soltos");

		request = new Request();
		request.setId("req-123");
		request.setTitle("Problema na iluminação");
		request.setDescription("Poste queimado na rua");
		request.setUserId("user-456");
		request.setCategoryId("cat-1");
		request.setSubCategoryId("sub-1");
		request.setCitizenPriority(PriorityLevel.HIGH);
		request.setStatus(RequestStatus.RECEIVED);
		request.setLatitude(-23.5505);
		request.setLongitude(-46.6333);
		request.setAddress(address);
		request.setDepartmentId("dep-789");
		request.setCreatedAt(LocalDateTime.now());
		request.setLegislationIds(List.of("leg-1", "leg-2"));
	}

	@Test
	void toEntity_shouldMapAllFields() {
		when(addressMapper.toEntity(addressDTO)).thenReturn(address);

		Request result = requestMapper.toEntity(createDTO);

		assertEquals(createDTO.getTitle(), result.getTitle());
		assertEquals(createDTO.getDescription(), result.getDescription());
		assertEquals(createDTO.getCategoryId(), result.getCategoryId());
		assertEquals(createDTO.getSubCategoryId(), result.getSubCategoryId());
		assertEquals(createDTO.getCitizenPriority(), result.getCitizenPriority());
		assertEquals(createDTO.getLatitude(), result.getLatitude());
		assertEquals(createDTO.getLongitude(), result.getLongitude());
		assertEquals(address, result.getAddress());
	}

	@Test
	void updateEntity_shouldUpdateOnlyTitleAndDescription() {
		requestMapper.updateEntity(request, updateDTO);

		assertEquals(updateDTO.getTitle(), request.getTitle());
		assertEquals(updateDTO.getDescription(), request.getDescription());
		assertEquals("cat-1", request.getCategoryId());
		assertEquals(PriorityLevel.HIGH, request.getCitizenPriority());
	}

	@Test
	void toResponse_shouldMapAllFieldsIncludingAddress() {
		when(addressMapper.toResponse(address)).thenReturn(addressResponseDTO);

		RequestResponseDTO result = requestMapper.toResponse(request);

		assertEquals(request.getId(), result.getId());
		assertEquals(request.getTitle(), result.getTitle());
		assertEquals(request.getDescription(), result.getDescription());
		assertEquals(request.getUserId(), result.getUserId());
		assertEquals(request.getCategoryId(), result.getCategoryId());
		assertEquals(request.getSubCategoryId(), result.getSubCategoryId());
		assertEquals(request.getCitizenPriority(), result.getCitizenPriority());
		assertEquals(request.getStatus(), result.getStatus());
		assertEquals(request.getLatitude(), result.getLatitude());
		assertEquals(request.getLongitude(), result.getLongitude());
		assertEquals(request.getDepartmentId(), result.getDepartmentId());
		assertEquals(request.getCreatedAt(), result.getCreatedAt());
		assertEquals(addressResponseDTO, result.getAddress());
	}

	@Test
	void toResponse_shouldHandleNullAddress() {
		request.setAddress(null);

		RequestResponseDTO result = requestMapper.toResponse(request);

		assertNull(result.getAddress());
	}

	@Test
	void toDetailsResponse_shouldMapAllFields() {
		when(addressMapper.toResponse(address)).thenReturn(addressResponseDTO);

		RequestDetailsDTO result = requestMapper.toDetailsResponse(request);

		assertEquals(request.getId(), result.getId());
		assertEquals(request.getTitle(), result.getTitle());
		assertEquals(request.getDescription(), result.getDescription());
		assertEquals(request.getStatus(), result.getStatus());
		assertEquals(request.getCitizenPriority(), result.getCitizenPriority());
		assertEquals(request.getLatitude(), result.getLatitude());
		assertEquals(request.getLongitude(), result.getLongitude());
		assertEquals(request.getCreatedAt(), result.getCreatedAt());
		assertEquals(request.getCategoryId(), result.getCategoryId());
		assertEquals(request.getSubCategoryId(), result.getSubCategoryId());
		assertEquals(request.getLegislationIds(), result.getLegislationIds());
		assertEquals(addressResponseDTO, result.getAddress());
	}

	@Test
	void toDetailsResponse_shouldHandleNullAddress() {
		request.setAddress(null);

		RequestDetailsDTO result = requestMapper.toDetailsResponse(request);

		assertNull(result.getAddress());
	}

	@Test
	void toStatisticsResponse_shouldMapAllValues() {
		RequestStatisticsDTO result = requestMapper.toStatisticsResponse(100, 20, 30, 40, 10, 40.0);

		assertEquals(100, result.getTotalRequests());
		assertEquals(20, result.getReceivedRequests());
		assertEquals(30, result.getInProgressRequests());
		assertEquals(40, result.getResolvedRequests());
		assertEquals(10, result.getCancelledRequests());
		assertEquals(40.0, result.getResolutionRate());
	}
}