package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.Address;

class AddressMapperTest {

	private AddressMapper addressMapper;

	@BeforeEach
	void setUp() {
		addressMapper = new AddressMapper();
	}

	@Test
	void toEntity_shouldReturnNullWhenDtoIsNull() {
		Address result = addressMapper.toEntity(null);
		assertNull(result);
	}

	@Test
	void toEntity_shouldMapAllFieldsCorrectly() {
		AddressDTO dto = new AddressDTO();
		dto.setCep("58700-000");
		dto.setStreet("Rua da Liberdade");
		dto.setNumber("42");
		dto.setNeighborhood("Centro");
		dto.setCity("Patos");
		dto.setState("PB");
		dto.setComplement("Sobrado");

		Address result = addressMapper.toEntity(dto);

		assertEquals(dto.getCep(), result.getCep());
		assertEquals(dto.getStreet(), result.getStreet());
		assertEquals(dto.getNumber(), result.getNumber());
		assertEquals(dto.getNeighborhood(), result.getNeighborhood());
		assertEquals(dto.getCity(), result.getCity());
		assertEquals(dto.getState(), result.getState());
		assertEquals(dto.getComplement(), result.getComplement());
	}

	@Test
	void toResponse_shouldReturnNullWhenAddressIsNull() {
		AddressResponseDTO result = addressMapper.toResponse(null);
		assertNull(result);
	}

	@Test
	void toResponse_shouldMapAllFieldsCorrectly() {
		Address address = new Address();
		address.setCep("58700-000");
		address.setStreet("Rua da Liberdade");
		address.setNumber("42");
		address.setNeighborhood("Centro");
		address.setCity("Patos");
		address.setState("PB");
		address.setComplement("Sobrado");

		AddressResponseDTO result = addressMapper.toResponse(address);

		assertEquals(address.getCep(), result.getCep());
		assertEquals(address.getStreet(), result.getStreet());
		assertEquals(address.getNumber(), result.getNumber());
		assertEquals(address.getNeighborhood(), result.getNeighborhood());
		assertEquals(address.getCity(), result.getCity());
		assertEquals(address.getState(), result.getState());
		assertEquals(address.getComplement(), result.getComplement());
	}
}