package com.iagomoreira.urbanflow.service.request;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@ExtendWith(MockitoExtension.class)
class RequestQueryServiceSearchTest {

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

	private final String userId = "user456";
	private final String departmentId = "dept789";
	private final String categoryId = "cat123";
	private final String subCategoryId = "sub456";
	private final RequestStatus status = RequestStatus.RECEIVED;

	@BeforeEach
	void setUp() {

		request = new Request();
		request.setId("req123");
		request.setUserId(userId);
		request.setDepartmentId(departmentId);
		request.setCategoryId(categoryId);
		request.setSubCategoryId(subCategoryId);
		request.setStatus(status);

		responseDTO = new RequestResponseDTO();
		responseDTO.setId("req123");
	}

	@Test
	void searchPaginated_whenAdmin_shouldApplyFiltersAndReturnPage() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(false);
		when(mongoTemplate.count(any(Query.class), eq(Request.class))).thenReturn(1L);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		Page<RequestResponseDTO> result = requestQueryService.search(status, categoryId, subCategoryId, departmentId,
				userId, 0, 10, "createdAt", "asc");
		assertThat(result.getContent()).hasSize(1);
		assertThat(result.getTotalElements()).isEqualTo(1);

		verify(mongoTemplate).count(any(Query.class), eq(Request.class));
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchPaginated_whenOperator_shouldOverrideDepartmentIdAndIgnoreUserId() {

		when(securityService.isOperator()).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId);
		when(mongoTemplate.count(any(Query.class), eq(Request.class))).thenReturn(1L);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		requestQueryService.search(status, categoryId, subCategoryId, "wrongDept", "wrongUser", 0, 10, "createdAt",
				"asc");

		verify(securityService).getAuthenticatedDepartmentId();
		verify(mongoTemplate).count(any(Query.class), eq(Request.class));
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchPaginated_whenCitizen_shouldOverrideUserIdAndIgnoreDepartment() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId);
		when(mongoTemplate.count(any(Query.class), eq(Request.class))).thenReturn(1L);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		requestQueryService.search(status, categoryId, subCategoryId, "wrongDept", "wrongUser", 0, 10, "createdAt",
				"asc");

		verify(securityService).getAuthenticatedUserId();
		verify(mongoTemplate).count(any(Query.class), eq(Request.class));
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchPaginated_withInvalidSortField_shouldFallbackToCreatedAt() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(false);
		when(mongoTemplate.count(any(Query.class), eq(Request.class))).thenReturn(1L);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		Page<RequestResponseDTO> result = requestQueryService.search(status, categoryId, subCategoryId, departmentId,
				userId, 0, 10, "invalidField", "desc");
		assertThat(result.getContent()).hasSize(1);

		verify(mongoTemplate).count(any(Query.class), eq(Request.class));
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchUnpaged_whenAdmin_shouldReturnListWithFilters() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(false);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.search(status, categoryId, subCategoryId, departmentId,
				userId);
		assertThat(result).hasSize(1);

		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchUnpaged_whenOperator_shouldOverrideDepartment() {

		when(securityService.isOperator()).thenReturn(true);
		when(securityService.isCitizen()).thenReturn(false);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		requestQueryService.search(status, categoryId, subCategoryId, "wrongDept", "wrongUser");

		verify(securityService).getAuthenticatedDepartmentId();
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchUnpaged_whenCitizen_shouldOverrideUser() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		requestQueryService.search(status, categoryId, subCategoryId, "wrongDept", "wrongUser");

		verify(securityService).getAuthenticatedUserId();
		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}

	@Test
	void searchUnpaged_withNoFilters_shouldReturnAll() {

		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(false);
		when(mongoTemplate.find(any(Query.class), eq(Request.class))).thenReturn(List.of(request));
		when(requestMapper.toResponse(request)).thenReturn(responseDTO);

		List<RequestResponseDTO> result = requestQueryService.search(null, null, null, null, null);
		assertThat(result).hasSize(1);

		verify(mongoTemplate).find(any(Query.class), eq(Request.class));
	}
}