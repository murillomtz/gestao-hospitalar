package com.example.gestaohospitalar.enums;

public enum TypeAppointmentEnum {

    TRIAGEM("triagem"), CIRURGIA("cirurgia"), EXAME("exame"), OBSERVACAO("observacao");

    @SuppressWarnings("unused")
	private final String valor;

    TypeAppointmentEnum(String valor) {
        this.valor = valor;
    }

}
