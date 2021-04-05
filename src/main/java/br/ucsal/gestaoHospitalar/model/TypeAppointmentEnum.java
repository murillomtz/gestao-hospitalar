package br.ucsal.gestaoHospitalar.model;

import javax.persistence.Entity;

@Entity
public enum TypeAppointmentEnum {
	
	TRIAGEM, CIRURGIA, EXAME, OBSERVACAO

}
