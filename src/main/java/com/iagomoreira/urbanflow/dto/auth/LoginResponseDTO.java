package com.iagomoreira.urbanflow.dto.auth;

import java.io.Serializable;

public class LoginResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String token;

	public LoginResponseDTO() {
	}

	public LoginResponseDTO(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}