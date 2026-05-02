package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String name;
	private String email;
	private String password;
	private String cpf;

	private Address address;
	private LocalDateTime createdAt;
	private LocalDateTime updateAt;

}
