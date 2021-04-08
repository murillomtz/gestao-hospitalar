package com.example.gestaohospitalar.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "tb_patient")
@JsonTypeName("personmodel")
public class Patient extends PersonModel implements Serializable {
	private static final long serialVersionUID = 9147080824535747800L;


	// @JsonBackReference // Nao permite que cliente serem serializados os pedidos
	@JsonIgnore
	@OneToMany(mappedBy = "patient")
	private List<Appointmet> appointments;

	private String cep;

	@ManyToMany()
	@JoinColumn(name="medication_id")
	private List<Medication> medications;

	public Patient(String name, String cpf, LocalDate birthDate, List<Appointmet> appointments, String cep, List<Medication> medications, Long id) {
		super(name, cpf, birthDate, id);
		this.appointments = appointments;
		this.cep = cep;
		this.medications = medications;

	}

	public Patient() {

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
