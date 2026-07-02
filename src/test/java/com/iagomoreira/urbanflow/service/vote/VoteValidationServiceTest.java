package com.iagomoreira.urbanflow.service.vote;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@ExtendWith(MockitoExtension.class)
class VoteValidationServiceTest {

	@Mock
	private VoteRepository voteRepository;

	@Mock
	private UserRepository userRepository;

	@Mock
	private RequestRepository requestRepository;

	@InjectMocks
	private VoteValidationService voteValidationService;

	private Request request;

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setId("request-id");
		request.setUserId("owner-id");
	}

	@Test
	void shouldValidateUser() {

		when(userRepository.existsById("user-id")).thenReturn(true);
		assertDoesNotThrow(() -> voteValidationService.validateUser("user-id"));
	}

	@Test
	void shouldThrowWhenUserDoesNotExist() {

		when(userRepository.existsById("user-id")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> voteValidationService.validateUser("user-id"));
	}

	@Test
	void shouldValidateRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		Request result = voteValidationService.validateRequest("request-id");
		assertEquals(request, result);
	}

	@Test
	void shouldThrowWhenRequestDoesNotExist() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> voteValidationService.validateRequest("request-id"));
	}

	@Test
	void shouldValidateDuplicateVote() {

		when(voteRepository.existsByUserIdAndRequestId("user-id", "request-id")).thenReturn(false);
		assertDoesNotThrow(() -> voteValidationService.validateDuplicateVote("user-id", "request-id"));
	}

	@Test
	void shouldThrowWhenVoteAlreadyExists() {

		when(voteRepository.existsByUserIdAndRequestId("user-id", "request-id")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> voteValidationService.validateDuplicateVote("user-id", "request-id"));
	}

	@Test
	void shouldValidateOwnVote() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		assertDoesNotThrow(() -> voteValidationService.validateOwnVote("user-id", "request-id"));
	}

	@Test
	void shouldThrowWhenVotingOwnRequest() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.of(request));
		assertThrows(BusinessException.class, () -> voteValidationService.validateOwnVote("owner-id", "request-id"));
	}

	@Test
	void shouldThrowWhenOwnVoteRequestDoesNotExist() {

		when(requestRepository.findById("request-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class,
				() -> voteValidationService.validateOwnVote("user-id", "request-id"));
	}
}