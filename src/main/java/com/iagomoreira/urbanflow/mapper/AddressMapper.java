package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
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
}