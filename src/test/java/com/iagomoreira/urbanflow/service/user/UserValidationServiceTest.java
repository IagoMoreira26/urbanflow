package com.iagomoreira.urbanflow.service.user;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserValidationServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private DepartmentRepository departmentRepository;

	@InjectMocks
	private UserValidationService userValidationService;

	private User user;

	@BeforeEach
	void setup() {
		user = new User();
		user.setId("1");
		user.setEmail("teste@email.com");
	}

	@Test
	void shouldNotThrowExceptionWhenEmailDoesNotExist() {

		when(userRepository.existsByEmail("teste@email.com")).thenReturn(false);
		assertDoesNotThrow(() -> userValidationService.validateEmailAlreadyExists("teste@email.com"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenEmailAlreadyExists() {

		when(userRepository.existsByEmail("teste@email.com")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> userValidationService.validateEmailAlreadyExists("teste@email.com"));
	}

	@Test
	void shouldNotThrowExceptionWhenCpfDoesNotExist() {

		when(userRepository.existsByCpf("123")).thenReturn(false);
		assertDoesNotThrow(() -> userValidationService.validateCpfAlreadyExists("123"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenCpfAlreadyExists() {

		when(userRepository.existsByCpf("123")).thenReturn(true);
		assertThrows(BusinessException.class, () -> userValidationService.validateCpfAlreadyExists("123"));
	}

	@Test
	void shouldReturnUserWhenUserExists() {

		when(userRepository.findById("1")).thenReturn(Optional.of(user));
		User result = userValidationService.validateUserExists("1");
		org.junit.jupiter.api.Assertions.assertEquals(user, result);
	}

	@Test
	void shouldThrowResourceNotFoundWhenUserDoesNotExist() {

		when(userRepository.findById("1")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> userValidationService.validateUserExists("1"));
	}

	@Test
	void shouldNotThrowExceptionWhenUpdatingWithSameEmail() {
		assertDoesNotThrow(() -> userValidationService.validateEmailForUpdate(user, "teste@email.com"));
	}

	@Test
	void shouldNotThrowExceptionWhenNewEmailIsAvailable() {

		when(userRepository.existsByEmail("novo@email.com")).thenReturn(false);
		assertDoesNotThrow(() -> userValidationService.validateEmailForUpdate(user, "novo@email.com"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenUpdatingToExistingEmail() {

		when(userRepository.existsByEmail("novo@email.com")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> userValidationService.validateEmailForUpdate(user, "novo@email.com"));
	}

	@Test
	void shouldIgnoreDepartmentValidationForCitizen() {
		assertDoesNotThrow(() -> userValidationService.validateDepartment(Role.CITIZEN, null));
	}

	@Test
	void shouldIgnoreDepartmentValidationForAdmin() {
		assertDoesNotThrow(() -> userValidationService.validateDepartment(Role.ADMIN, null));
	}

	@Test
	void shouldThrowExceptionWhenOperatorHasNoDepartment() {
		assertThrows(BusinessException.class, () -> userValidationService.validateDepartment(Role.OPERATOR, null));
	}

	@Test
	void shouldThrowExceptionWhenDepartmentDoesNotExist() {

		when(departmentRepository.existsById("10")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class,
				() -> userValidationService.validateDepartment(Role.OPERATOR, "10"));
	}

	@Test
	void shouldAcceptOperatorWithValidDepartment() {

		when(departmentRepository.existsById("10")).thenReturn(true);
		assertDoesNotThrow(() -> userValidationService.validateDepartment(Role.OPERATOR, "10"));
	}

	@Test
	void shouldNotThrowWhenDepartmentExists() {

		when(departmentRepository.existsById("1")).thenReturn(true);
		assertDoesNotThrow(() -> userValidationService.validateDepartmentExists("1"));
	}

	@Test
	void shouldThrowWhenDepartmentDoesNotExist() {

		when(departmentRepository.existsById("1")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> userValidationService.validateDepartmentExists("1"));
	}
}