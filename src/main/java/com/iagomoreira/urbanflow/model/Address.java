package com.iagomoreira.urbanflow.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cep;
	private String street;
	private String number;
	private String neighborhood;
	private String city;
	private String state;
	private String complement;

}
