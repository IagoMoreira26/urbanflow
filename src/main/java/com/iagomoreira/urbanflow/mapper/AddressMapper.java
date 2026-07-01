package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.Address;

@Component
public class AddressMapper {

	public Address toEntity(AddressDTO dto) {

		if (dto == null) {
			return null;
		}

		Address address = new Address();

		address.setCep(dto.getCep());
		address.setStreet(dto.getStreet());
		address.setNumber(dto.getNumber());
		address.setNeighborhood(dto.getNeighborhood());
		address.setCity(dto.getCity());
		address.setState(dto.getState());
		address.setComplement(dto.getComplement());

		return address;
	}

	public AddressResponseDTO toResponse(Address address) {

		if (address == null) {
			return null;
		}

		AddressResponseDTO dto = new AddressResponseDTO();

		dto.setCep(address.getCep());
		dto.setStreet(address.getStreet());
		dto.setNumber(address.getNumber());
		dto.setNeighborhood(address.getNeighborhood());
		dto.setCity(address.getCity());
		dto.setState(address.getState());
		dto.setComplement(address.getComplement());

		return dto;
	}
}