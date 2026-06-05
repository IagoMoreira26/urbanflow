package com.iagomoreira.urbanflow.dto.user;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.User;

public class UserResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String email;
	private AddressResponseDTO address;
	private LocalDateTime createdAt;

	public UserResponseDTO() {
	}

	public UserResponseDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.createdAt = user.getCreatedAt();

		if (user.getAddress() != null) {
			this.address = new AddressResponseDTO(user.getAddress());
		}
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public AddressResponseDTO getAddress() {
		return address;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
}
