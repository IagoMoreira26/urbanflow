package com.iagomoreira.urbanflow.service.request;

import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.*;
import com.iagomoreira.urbanflow.service.security.SecurityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RequestQueryServiceBasicTest {

	@Mock
	private MongoTemplate mongoTemplate;
	@Mock
	private RequestRepository requestRepository;
	@Mock
	private UserRepository userRepository;
	@Mock
	private CategoryRepository categoryRepository;
	@Mock
	private DepartmentRepository departmentRepository;
	@Mock
	private SubCategoryRepository subCategoryRepository;
	@Mock
	private SecurityService securityService;
	@Mock
	private RequestValidationService requestValidationService;
	@Mock
	private RequestMapper requestMapper;

	@InjectMocks
	private RequestQueryService requestQueryService;

	private Request request;
	private RequestResponseDTO responseDTO;
	private final String requestId = "req123";
	private final String userId = "user456";
	private final String departmentId = "dept789";
	private final String categoryId = "cat123";
	private final String subCategoryId = "sub456";

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setId(requestId);
		request.setUserId(userId);
		request.setDepartmentId(departmentId);
		request.setCategoryId(categoryId);
		request.setSubCategoryId(subCategoryId);

		responseDTO = new RequestResponseDTO();
		responseDTO.setId(requestId);
	}

	@Test
	void findAll_whenAdmin_shouldReturnAllRequests() {

		when(securityService.isAdmin()).thenReturn(true);
		when(requestRepository.findAll()).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findAll();
		assertThat(result).hasSize(1);

		verify(requestRepository).findAll();
		verify(requestMapper).toResponse(request);
		verify(securityService, never()).isOperator();
		verify(securityService, never()).getAuthenticatedDepartmentId();
		verify(securityService, never()).getAuthenticatedUserId();
	}

	@Test
	void findAll_whenOperator_shouldReturnRequestsByDepartment() {

		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(true);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId);
		when(requestRepository.findByDepartmentId(departmentId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findAll();
		assertThat(result).hasSize(1);

		verify(requestRepository).findByDepartmentId(departmentId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findAll_whenCitizen_shouldReturnRequestsByUser() {

		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(false);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId);
		when(requestRepository.findByUserId(userId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findAll();
		assertThat(result).hasSize(1);

		verify(requestRepository).findByUserId(userId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findById_whenRequestExistsAndAccessGranted_shouldReturnDTO() {

		when(requestRepository.findById(requestId)).thenReturn(Optional.of(request));
		doNothing().when(requestValidationService).validateRequestAccess(request);
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		RequestResponseDTO result = requestQueryService.findById(requestId);
		assertThat(result).isEqualTo(responseDTO);

		verify(requestRepository).findById(requestId);
		verify(requestValidationService).validateRequestAccess(request);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findById_whenRequestNotFound_shouldThrowResourceNotFoundException() {

		when(requestRepository.findById(requestId)).thenReturn(Optional.empty());
		assertThatThrownBy(() -> requestQueryService.findById(requestId)).isInstanceOf(ResourceNotFoundException.class)
				.hasMessage("Request not found");

		verify(requestRepository).findById(requestId);
		verifyNoInteractions(requestValidationService);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByStatus_shouldReturnRequestsWithGivenStatus() {

		RequestStatus status = RequestStatus.RECEIVED;

		when(requestRepository.findByStatus(status)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findByStatus(status);
		assertThat(result).hasSize(1);

		verify(requestRepository).findByStatus(status);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findByCategory_whenCategoryExists_shouldReturnRequests() {

		when(categoryRepository.existsById(categoryId)).thenReturn(true);
		when(requestRepository.findByCategoryId(categoryId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findByCategory(categoryId);
		assertThat(result).hasSize(1);

		verify(categoryRepository).existsById(categoryId);
		verify(requestRepository).findByCategoryId(categoryId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findByCategory_whenCategoryNotFound_shouldThrowResourceNotFoundException() {

		when(categoryRepository.existsById(categoryId)).thenReturn(false);
		assertThatThrownBy(() -> requestQueryService.findByCategory(categoryId))
				.isInstanceOf(ResourceNotFoundException.class).hasMessage("Category not found");

		verify(categoryRepository).existsById(categoryId);
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findBySubCategory_whenSubCategoryExists_shouldReturnRequests() {

		when(subCategoryRepository.existsById(subCategoryId)).thenReturn(true);
		when(requestRepository.findBySubCategoryId(subCategoryId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findBySubCategory(subCategoryId);
		assertThat(result).hasSize(1);

		verify(subCategoryRepository).existsById(subCategoryId);
		verify(requestRepository).findBySubCategoryId(subCategoryId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findBySubCategory_whenSubCategoryNotFound_shouldThrowResourceNotFoundException() {

		when(subCategoryRepository.existsById(subCategoryId)).thenReturn(false);
		assertThatThrownBy(() -> requestQueryService.findBySubCategory(subCategoryId))
				.isInstanceOf(ResourceNotFoundException.class).hasMessage("SubCategory not found");

		verify(subCategoryRepository).existsById(subCategoryId);
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByUser_whenUserExistsAndAccessGranted_shouldReturnRequests() {

		when(userRepository.existsById(userId)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(requestRepository.findByUserId(userId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findByUser(userId);
		assertThat(result).hasSize(1);

		verify(userRepository).existsById(userId);
		verify(requestRepository).findByUserId(userId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findByUser_whenUserNotFound_shouldThrowResourceNotFoundException() {

		when(userRepository.existsById(userId)).thenReturn(false);
		assertThatThrownBy(() -> requestQueryService.findByUser(userId)).isInstanceOf(ResourceNotFoundException.class)
				.hasMessage("User not found");

		verify(userRepository).existsById(userId);
		verifyNoInteractions(securityService);
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByUser_whenCitizenAndDifferentUserId_shouldThrowBusinessException() {

		String anotherUserId = "anotherUser";

		when(userRepository.existsById(anotherUserId)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId); // logado é diferente de anotherUserId

		assertThatThrownBy(() -> requestQueryService.findByUser(anotherUserId)).isInstanceOf(BusinessException.class)
				.hasMessage("Access denied");

		verify(userRepository).existsById(anotherUserId);
		verify(securityService).isCitizen();
		verify(securityService).getAuthenticatedUserId();
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByDepartment_whenDepartmentExistsAndAccessGrantedForAdmin_shouldReturnRequests() {

		when(departmentRepository.existsById(departmentId)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(false); // admin
		when(requestRepository.findByDepartmentId(departmentId)).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.findByDepartment(departmentId);
		assertThat(result).hasSize(1);

		verify(departmentRepository).existsById(departmentId);
		verify(securityService).isCitizen();
		verify(securityService).isOperator();
		verify(requestRepository).findByDepartmentId(departmentId);
		verify(requestMapper).toResponse(request);
	}

	@Test
	void findByDepartment_whenDepartmentNotFound_shouldThrowResourceNotFoundException() {

		when(departmentRepository.existsById(departmentId)).thenReturn(false);
		assertThatThrownBy(() -> requestQueryService.findByDepartment(departmentId))
				.isInstanceOf(ResourceNotFoundException.class).hasMessage("Department not found");

		verify(departmentRepository).existsById(departmentId);
		verifyNoInteractions(securityService);
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByDepartment_whenCitizen_shouldThrowBusinessException() {

		when(departmentRepository.existsById(departmentId)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(true);

		assertThatThrownBy(() -> requestQueryService.findByDepartment(departmentId))
				.isInstanceOf(BusinessException.class).hasMessage("Access denied");

		verify(departmentRepository).existsById(departmentId);
		verify(securityService).isCitizen();
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}

	@Test
	void findByDepartment_whenOperatorAndDifferentDepartment_shouldThrowBusinessException() {

		String anotherDepartment = "anotherDept";

		when(departmentRepository.existsById(anotherDepartment)).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(true);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId); // logado diferente

		assertThatThrownBy(() -> requestQueryService.findByDepartment(anotherDepartment))
				.isInstanceOf(BusinessException.class).hasMessage("Access denied");

		verify(departmentRepository).existsById(anotherDepartment);
		verify(securityService).isCitizen();
		verify(securityService).isOperator();
		verify(securityService).getAuthenticatedDepartmentId();
		verifyNoInteractions(requestRepository);
		verifyNoInteractions(requestMapper);
	}
}