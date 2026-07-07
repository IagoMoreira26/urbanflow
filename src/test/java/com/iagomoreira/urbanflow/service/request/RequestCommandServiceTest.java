package com.iagomoreira.urbanflow.service.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@ExtendWith(MockitoExtension.class)
class RequestCommandServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private UserRepository userRepository;

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private RequestValidationService requestValidationService;

	@Mock
	private SecurityService securityService;

	@Mock
	private RequestMapper requestMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private RequestCommandService requestCommandService;

	private CreateRequestDTO createDTO;
	private UpdateRequestDTO updateDTO;
	private Request request;
	private RequestResponseDTO responseDTO;
	private SubCategory subCategory;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateRequestDTO();
		createDTO.setCategoryId("category");
		createDTO.setSubCategoryId("subcategory");

		updateDTO = new UpdateRequestDTO();
		updateDTO.setTitle("Novo título");
		updateDTO.setDescription("Nova descrição");

		request = new Request();
		request.setId("request-id");

		subCategory = new SubCategory();
		subCategory.setDepartmentId("department-id");

		responseDTO = new RequestResponseDTO();
		responseDTO.setId("request-id");
	}

	@Test
	void shouldCreateRequest() {

		when(securityService.getAuthenticatedUserId()).thenReturn("user-id");
		doNothing().when(requestValidationService).validateAuthenticatedUser("user-id");

		when(requestValidationService.validateSubCategory(createDTO)).thenReturn(subCategory);
		when(requestMapper.toEntity(createDTO)).thenReturn(request);
		when(dateTimeProvider.now()).thenReturn(now);
		when(requestRepository.save(request)).thenReturn(request);
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		RequestResponseDTO result = requestCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals("user-id", request.getUserId());
		assertEquals("department-id", request.getDepartmentId());
		assertEquals(RequestStatus.RECEIVED, request.getStatus());
		assertEquals(now, request.getCreatedAt());
		assertEquals(now, request.getUpdatedAt());

		verify(requestRepository).save(request);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void shouldUpdateRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));

		doNothing().when(requestValidationService).validateRequestAccess(request);
		doNothing().when(requestValidationService).validateRequestEditable(request);

		when(dateTimeProvider.now()).thenReturn(now);
		when(requestRepository.save(request)).thenReturn(request);
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		RequestResponseDTO result = requestCommandService.update("request-id", updateDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, request.getUpdatedAt());

		verify(requestMapper).updateEntity(request, updateDTO);
		verify(requestRepository).save(request);
	}

	@Test
	void shouldThrowExceptionWhenUpdatingNonExistingRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> requestCommandService.update("request-id", updateDTO));

		verify(requestRepository, never()).save(any());
	}

	@Test
	void shouldDeleteRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));

		doNothing().when(requestValidationService).validateRequestAccess(request);
		doNothing().when(requestValidationService).validateRequestDeletion(request);

		requestCommandService.delete("request-id");
		verify(requestRepository).deleteById("request-id");
	}

	@Test
	void shouldThrowExceptionWhenDeletingNonExistingRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> requestCommandService.delete("request-id"));

		verify(requestRepository, never()).deleteById(any());
	}
}