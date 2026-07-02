package com.iagomoreira.urbanflow.service.request;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.security.AuthorizationService;

@ExtendWith(MockitoExtension.class)
class RequestValidationServiceTest {

	@Mock
	private AuthorizationService authorizationService;

	@Mock
	private UserRepository userRepository;

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@InjectMocks
	private RequestValidationService requestValidationService;

	@Test
	void shouldAllowReceivedToUnderReview() {
		assertDoesNotThrow(() -> requestValidationService.validateStatusTransition(RequestStatus.RECEIVED,
				RequestStatus.UNDER_REVIEW));
	}

	@Test
	void shouldThrowWhenStatusTransitionIsInvalid() {
		assertThrows(BusinessException.class, () -> requestValidationService
				.validateStatusTransition(RequestStatus.RECEIVED, RequestStatus.RESOLVED));
	}

	@Test
	void shouldThrowWhenRequestAlreadyFinalized() {
		assertThrows(BusinessException.class, () -> requestValidationService
				.validateStatusTransition(RequestStatus.RESOLVED, RequestStatus.IN_PROGRESS));
	}

	@Test
	void shouldValidateRequestAccess() {

		Request request = new Request();
		requestValidationService.validateRequestAccess(request);
		verify(authorizationService).validateRequestAccess(request);
	}

	@Test
	void shouldValidateAuthenticatedUser() {

		when(userRepository.existsById("user-id")).thenReturn(true);
		assertDoesNotThrow(() -> requestValidationService.validateAuthenticatedUser("user-id"));
	}

	@Test
	void shouldThrowWhenAuthenticatedUserDoesNotExist() {

		when(userRepository.existsById("user-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class,
				() -> requestValidationService.validateAuthenticatedUser("user-id"));
	}

	@Test
	void shouldValidateSubCategory() {

		CreateRequestDTO dto = new CreateRequestDTO();
		dto.setCategoryId("category-id");
		dto.setSubCategoryId("subcategory-id");

		SubCategory subCategory = new SubCategory();
		subCategory.setCategoryId("category-id");

		when(subCategoryRepository.findById("subcategory-id")).thenReturn(Optional.of(subCategory));
		SubCategory result = requestValidationService.validateSubCategory(dto);

		assertEquals(subCategory, result);
	}

	@Test
	void shouldThrowWhenSubCategoryDoesNotExist() {

		CreateRequestDTO dto = new CreateRequestDTO();
		dto.setSubCategoryId("subcategory-id");

		when(subCategoryRepository.findById("subcategory-id")).thenReturn(Optional.empty());

		assertThrows(ResourceNotFoundException.class, () -> requestValidationService.validateSubCategory(dto));
	}

	@Test
	void shouldThrowWhenSubCategoryDoesNotBelongToCategory() {

		CreateRequestDTO dto = new CreateRequestDTO();
		dto.setCategoryId("category-1");
		dto.setSubCategoryId("subcategory-id");

		SubCategory subCategory = new SubCategory();
		subCategory.setCategoryId("category-2");

		when(subCategoryRepository.findById("subcategory-id")).thenReturn(Optional.of(subCategory));
		assertThrows(BusinessException.class, () -> requestValidationService.validateSubCategory(dto));
	}

	@Test
	void shouldThrowWhenEditingResolvedRequest() {

		Request request = new Request();
		request.setStatus(RequestStatus.RESOLVED);

		assertThrows(BusinessException.class, () -> requestValidationService.validateRequestEditable(request));
	}

	@Test
	void shouldThrowWhenDeletingResolvedRequest() {

		Request request = new Request();
		request.setStatus(RequestStatus.RESOLVED);

		assertThrows(BusinessException.class, () -> requestValidationService.validateRequestDeletion(request));
	}

	@Test
	void shouldThrowWhenEditingCancelledRequest() {

		Request request = new Request();
		request.setStatus(RequestStatus.CANCELLED);

		assertThrows(BusinessException.class, () -> requestValidationService.validateRequestEditable(request));
	}
}