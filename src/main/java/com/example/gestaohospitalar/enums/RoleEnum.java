package com.example.gestaohospitalar.enums;


import javax.persistence.Entity;


public enum RoleEnum {
	
	MEDICO("medico"), ENFERMEIRO("enfermeiro"), OUTRO("outro");

	private final String valor;
	RoleEnum(String valor) {
		this.valor = valor;
	}
}
