package com.example.gestaohospitalar.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_patient")
public class Patient extends PersonModel implements Serializable {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	private  Long id;

	// @JsonBackReference // Nao permite que cliente serem serializados os pedidos
	@JsonIgnore
	@OneToMany(mappedBy = "patient")
	private List<Appointmet> appointments;

	private String cep;

	@ManyToMany()
	@JoinColumn(name="medication_id")
	private List<Medication> medications;

	public Patient(String name, String cpf, LocalDate birthDate, List<Appointmet> appointments, String cep, List<Medication> medications) {
		super(name, cpf, birthDate);
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
