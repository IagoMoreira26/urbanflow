package com.iagomoreira.urbanflow.dto.address;

import java.io.Serializable;

import com.iagomoreira.urbanflow.model.Address;

public class AddressResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cep;
	private String street;
	private String number;
	private String neighborhood;
	private String city;
	private String state;
	private String complement;

	public AddressResponseDTO() {
	}

	public AddressResponseDTO(Address address) {
		this.cep = address.getCep();
		this.street = address.getStreet();
		this.number = address.getNumber();
		this.neighborhood = address.getNeighborhood();
		this.city = address.getCity();
		this.state = address.getState();
		this.complement = address.getComplement();
	}

	public String getCep() {
		return cep;
	}

	public String getStreet() {
		return street;
	}

	public String getNumber() {
		return number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getComplement() {
		return complement;
	}
}
