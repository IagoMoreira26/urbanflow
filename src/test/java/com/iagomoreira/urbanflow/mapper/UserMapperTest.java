package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.model.Address;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;

@ExtendWith(MockitoExtension.class)
class UserMapperTest {

	@Mock
	private AddressMapper addressMapper;

	@InjectMocks
	private UserMapper userMapper;

	private AddressDTO addressDTO;
	private Address address;
	private AddressResponseDTO addressResponseDTO;

	@BeforeEach
	void setUp() {
		addressDTO = new AddressDTO();
		addressDTO.setCep("01000-000");
		addressDTO.setStreet("Rua das Flores");
		addressDTO.setNumber("123");
		addressDTO.setNeighborhood("Centro");
		addressDTO.setCity("São Paulo");
		addressDTO.setState("SP");
		addressDTO.setComplement("Apto 45");

		address = new Address();
		address.setCep("01000-000");
		address.setStreet("Rua das Flores");
		address.setNumber("123");
		address.setNeighborhood("Centro");
		address.setCity("São Paulo");
		address.setState("SP");
		address.setComplement("Apto 45");

		addressResponseDTO = new AddressResponseDTO();
		addressResponseDTO.setCep("01000-000");
		addressResponseDTO.setStreet("Rua das Flores");
		addressResponseDTO.setNumber("123");
		addressResponseDTO.setNeighborhood("Centro");
		addressResponseDTO.setCity("São Paulo");
		addressResponseDTO.setState("SP");
		addressResponseDTO.setComplement("Apto 45");
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateUserDTO dto = new CreateUserDTO();
		dto.setName("João Silva");
		dto.setEmail("joao@email.com");
		dto.setCpf("12345678901");
		dto.setPassword("senha123");
		dto.setAddress(addressDTO);

		when(addressMapper.toEntity(addressDTO)).thenReturn(address);

		User entity = userMapper.toEntity(dto, "encodedPassword");

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getEmail(), entity.getEmail());
		assertEquals("encodedPassword", entity.getPassword());
		assertEquals(dto.getCpf(), entity.getCpf());
		assertNotNull(entity.getAddress());
		assertEquals(address, entity.getAddress());

		verify(addressMapper).toEntity(addressDTO);
	}

	@Test
	void toEntity_shouldHandleNullAddress() {
		CreateUserDTO dto = new CreateUserDTO();
		dto.setName("João Silva");
		dto.setEmail("joao@email.com");
		dto.setCpf("12345678901");
		dto.setPassword("senha123");
		dto.setAddress(null);

		User entity = userMapper.toEntity(dto, "encodedPassword");

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertNull(entity.getAddress());
	}

	@Test
	void updateEntity_shouldUpdateEntityFromDto() {
		User user = new User();
		user.setName("Antigo");
		user.setEmail("antigo@email.com");

		UpdateUserDTO dto = new UpdateUserDTO();
		dto.setName("João Silva");
		dto.setEmail("joao@email.com");
		dto.setAddress(addressDTO);

		when(addressMapper.toEntity(addressDTO)).thenReturn(address);

		userMapper.updateEntity(user, dto);

		assertEquals(dto.getName(), user.getName());
		assertEquals(dto.getEmail(), user.getEmail());
		assertNotNull(user.getAddress());
		assertEquals(address, user.getAddress());

		verify(addressMapper).toEntity(addressDTO);
	}

	@Test
	void updateEntity_shouldHandleNullAddress() {
		User user = new User();
		user.setName("Antigo");
		user.setEmail("antigo@email.com");

		UpdateUserDTO dto = new UpdateUserDTO();
		dto.setName("João Silva");
		dto.setEmail("joao@email.com");
		dto.setAddress(null);

		userMapper.updateEntity(user, dto);

		assertEquals(dto.getName(), user.getName());
		assertEquals(dto.getEmail(), user.getEmail());
		assertNull(user.getAddress());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		User user = new User();
		user.setId("user-1");
		user.setName("João Silva");
		user.setEmail("joao@email.com");
		user.setRole(Role.CITIZEN);
		user.setDepartmentId("dep-1");
		user.setAddress(address);

		when(addressMapper.toResponse(address)).thenReturn(addressResponseDTO);

		UserResponseDTO dto = userMapper.toResponse(user);

		assertNotNull(dto);
		assertEquals(user.getId(), dto.getId());
		assertEquals(user.getName(), dto.getName());
		assertEquals(user.getEmail(), dto.getEmail());
		assertEquals(user.getRole(), dto.getRole());
		assertEquals(user.getDepartmentId(), dto.getDepartmentId());
		assertNotNull(dto.getAddress());
		assertEquals(addressResponseDTO, dto.getAddress());

		verify(addressMapper).toResponse(address);
	}

	@Test
	void toResponse_shouldHandleNullAddress() {
		User user = new User();
		user.setId("user-1");
		user.setName("João Silva");
		user.setEmail("joao@email.com");
		user.setRole(Role.CITIZEN);
		user.setDepartmentId("dep-1");
		user.setAddress(null);

		UserResponseDTO dto = userMapper.toResponse(user);

		assertNotNull(dto);
		assertEquals(user.getId(), dto.getId());
		assertNull(dto.getAddress());
	}

	@Test
	void toResponse_shouldReturnNullWhenUserIsNull() {
		UserResponseDTO dto = userMapper.toResponse(null);
		assertNull(dto);
	}
}