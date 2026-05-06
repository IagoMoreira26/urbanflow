package com.iagomoreira.urbanflow.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CpfValidator implements ConstraintValidator<ValidCpf, String> {

	@Override
	public boolean isValid(String cpf, ConstraintValidatorContext context) {

		if (cpf == null || cpf.isBlank()) {
			return false;
		}

		cpf = cpf.replaceAll("[^\\d]", "");

		if (cpf.length() != 11) {
			return false;
		}

		if (cpf.matches("(\\d)\\1{10}")) {
			return false;
		}

		try {
			return isValidCpfDigits(cpf);
		} catch (Exception e) {
			return false;
		}
	}

	private boolean isValidCpfDigits(String cpf) {

		int sum = 0;

		for (int i = 0; i < 9; i++) {
			sum += (cpf.charAt(i) - '0') * (10 - i);
		}

		int firstDigit = 11 - (sum % 11);
		firstDigit = (firstDigit >= 10) ? 0 : firstDigit;

		if (firstDigit != (cpf.charAt(9) - '0')) {
			return false;
		}

		sum = 0;

		for (int i = 0; i < 10; i++) {
			sum += (cpf.charAt(i) - '0') * (11 - i);
		}

		int secondDigit = 11 - (sum % 11);
		secondDigit = (secondDigit >= 10) ? 0 : secondDigit;

		return secondDigit == (cpf.charAt(10) - '0');
	}

}
