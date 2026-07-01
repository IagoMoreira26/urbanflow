package com.iagomoreira.urbanflow.dto.user;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UpdateUserDTO {

	@NotBlank
	private String name;

	@Email
	@NotBlank
	private String email;

	private String password;

	@Valid
	private AddressDTO address;

	public UpdateUserDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}
