package com.iagomoreira.urbanflow.dto.user;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.validation.ValidCpf;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CreateUserDTO {

	@NotBlank
	private String name;

	@Email
	@NotBlank
	private String email;

	@NotBlank
	@ValidCpf
	private String cpf;

	@NotBlank
	private String password;

	@Valid
	private AddressDTO address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}
