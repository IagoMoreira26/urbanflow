package com.iagomoreira.urbanflow.controller;

import static org.hamcrest.Matchers.startsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.user.UserService;

@WebMvcTest(UserController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class UserControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@MockitoBean
	private UserService userService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private CreateUserDTO createDTO;
	private UpdateUserDTO updateDTO;
	private UserResponseDTO responseDTO;
	private final String userId = "user-123";
	private final String departmentId = "dep-456";

	@BeforeEach
	void setUp() {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setCep("58700-000");
		addressDTO.setStreet("Rua da Liberdade");
		addressDTO.setNumber("42");
		addressDTO.setNeighborhood("Centro");
		addressDTO.setCity("Patos");
		addressDTO.setState("PB");
		addressDTO.setComplement("Sobrado");

		AddressResponseDTO addressResponseDTO = new AddressResponseDTO();
		addressResponseDTO.setCep("58700-000");
		addressResponseDTO.setStreet("Rua da Liberdade");
		addressResponseDTO.setNumber("42");
		addressResponseDTO.setNeighborhood("Centro");
		addressResponseDTO.setCity("Patos");
		addressResponseDTO.setState("PB");
		addressResponseDTO.setComplement("Sobrado");

		createDTO = new CreateUserDTO();
		createDTO.setName("Maria Patos");
		createDTO.setEmail("maria.patos@example.com");
		createDTO.setCpf("98765432100");
		createDTO.setPassword("patos123");
		createDTO.setAddress(addressDTO);

		updateDTO = new UpdateUserDTO();
		updateDTO.setName("Maria Patos Updated");
		updateDTO.setEmail("maria.patos.updated@example.com");
		updateDTO.setPassword("novoPatos123");
		updateDTO.setAddress(addressDTO);

		responseDTO = new UserResponseDTO();
		responseDTO.setId(userId);
		responseDTO.setName("Maria Patos");
		responseDTO.setEmail("maria.patos@example.com");
		responseDTO.setRole(Role.CITIZEN);
		responseDTO.setDepartmentId(null);
		responseDTO.setAddress(addressResponseDTO);
		responseDTO.setCreatedAt(LocalDateTime.now().minusDays(1));
		responseDTO.setUpdatedAt(LocalDateTime.now());
	}

	@Test
	void shouldCreateUser() throws Exception {
		when(userService.create(any(CreateUserDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(
				post("/users").contentType(APPLICATION_JSON).content(objectMapper.writeValueAsString(createDTO)))
				.andExpect(status().isCreated()).andExpect(header().exists("Location"))
				.andExpect(header().string("Location", startsWith("http://localhost/users/")))
				.andExpect(jsonPath("$.id").value(userId)).andExpect(jsonPath("$.name").value("Maria Patos"))
				.andExpect(jsonPath("$.email").value("maria.patos@example.com"))
				.andExpect(jsonPath("$.role").value("CITIZEN")).andExpect(jsonPath("$.address.cep").value("58700-000"))
				.andExpect(jsonPath("$.address.street").value("Rua da Liberdade"))
				.andExpect(jsonPath("$.address.number").value("42"))
				.andExpect(jsonPath("$.address.neighborhood").value("Centro"))
				.andExpect(jsonPath("$.address.city").value("Patos")).andExpect(jsonPath("$.address.state").value("PB"))
				.andExpect(jsonPath("$.address.complement").value("Sobrado"));

		verify(userService).create(any(CreateUserDTO.class));
	}

	@Test
	void shouldFindAllUsers() throws Exception {
		when(userService.findAll()).thenReturn(List.of(responseDTO));

		mockMvc.perform(get("/users")).andExpect(status().isOk()).andExpect(jsonPath("$.size()").value(1))
				.andExpect(jsonPath("$[0].id").value(userId)).andExpect(jsonPath("$[0].name").value("Maria Patos"))
				.andExpect(jsonPath("$[0].email").value("maria.patos@example.com"))
				.andExpect(jsonPath("$[0].role").value("CITIZEN"))
				.andExpect(jsonPath("$[0].address.cep").value("58700-000"));

		verify(userService).findAll();
	}

	@Test
	void shouldFindUserById() throws Exception {
		when(userService.findById(userId)).thenReturn(responseDTO);

		mockMvc.perform(get("/users/{id}", userId)).andExpect(status().isOk()).andExpect(jsonPath("$.id").value(userId))
				.andExpect(jsonPath("$.name").value("Maria Patos"))
				.andExpect(jsonPath("$.email").value("maria.patos@example.com"))
				.andExpect(jsonPath("$.role").value("CITIZEN")).andExpect(jsonPath("$.address.city").value("Patos"));

		verify(userService).findById(userId);
	}

	@Test
	void shouldFindOperatorsByDepartment() throws Exception {
		UserResponseDTO operatorResponse = new UserResponseDTO();
		operatorResponse.setId("op-123");
		operatorResponse.setName("Operador Patos");
		operatorResponse.setEmail("operador.patos@example.com");
		operatorResponse.setRole(Role.OPERATOR);
		operatorResponse.setDepartmentId(departmentId);
		operatorResponse.setAddress(null);
		operatorResponse.setCreatedAt(LocalDateTime.now());
		operatorResponse.setUpdatedAt(LocalDateTime.now());

		when(userService.findOperatorsByDepartment(departmentId)).thenReturn(List.of(operatorResponse));

		mockMvc.perform(get("/users/operators/department/{departmentId}", departmentId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(1)).andExpect(jsonPath("$[0].id").value("op-123"))
				.andExpect(jsonPath("$[0].name").value("Operador Patos"))
				.andExpect(jsonPath("$[0].role").value("OPERATOR"))
				.andExpect(jsonPath("$[0].departmentId").value(departmentId));

		verify(userService).findOperatorsByDepartment(departmentId);
	}

	@Test
	void shouldUpdateUser() throws Exception {
		responseDTO.setName("Maria Patos Updated");
		responseDTO.setEmail("maria.patos.updated@example.com");

		when(userService.update(eq(userId), any(UpdateUserDTO.class))).thenReturn(responseDTO);

		mockMvc.perform(put("/users/{id}", userId).contentType(APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateDTO))).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(userId)).andExpect(jsonPath("$.name").value("Maria Patos Updated"))
				.andExpect(jsonPath("$.email").value("maria.patos.updated@example.com"))
				.andExpect(jsonPath("$.role").value("CITIZEN")).andExpect(jsonPath("$.address.cep").value("58700-000"));

		verify(userService).update(eq(userId), any(UpdateUserDTO.class));
	}

	@Test
	void shouldDeleteUser() throws Exception {
		doNothing().when(userService).delete(userId);

		mockMvc.perform(delete("/users/{id}", userId)).andExpect(status().isNoContent());

		verify(userService).delete(userId);
	}
}