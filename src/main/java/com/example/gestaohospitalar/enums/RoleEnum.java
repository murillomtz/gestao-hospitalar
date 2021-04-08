package com.example.gestaohospitalar.enums;

public enum RoleEnum {
	
	MEDICO("medico"), ENFERMEIRO("enfermeiro"), OUTRO("outro");

	private final String valor;
	RoleEnum(String valor) {
		this.valor = valor;
	}
}
