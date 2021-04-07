package com.example.gestaohospitalar.models;

import java.sql.Date;
import java.util.List;

public class Patient extends PersonModel {

	
	private static Long id;
	private List<Appointmet> appointments;
	private String cep;
	private List<Medication> medications;

	public Patient(String nome, String cpf, String cep, Date nascimento) {
		super(nome, cpf, nascimento);
		this.cep = cep;
	}

	public List<Appointmet> getConsultas() {
		return appointments;
	}

	public void setConsultas(List<Appointmet> consultas) {
		this.appointments = consultas;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public List<Medication> getMedicamentos() {
		return medications;
	}

	public void setMedicamentos(List<Medication> medicamentos) {
		this.medications = medicamentos;
	}

	@Override
	public String toString() {
		return super.toString() + "Paciente [ cep=" + cep + ", consultas=" + appointments + ", medicações=" + medications + "]";
	}
	
	
}
