package com.example.gestaohospitalar.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "tb_patient")
public class Patient extends PersonModel implements Serializable {
	private static final long serialVersionUID = 9147080824535747800L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	private Long id;

	// @JsonBackReference // Nao permite que cliente serem serializados os pedidos
	@JsonIgnore
	@OneToMany(mappedBy = "user")
	private List<Appointmet> appointments;

	private String cep;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="medication_id")
	private List<Medication> medications;

	public Patient(String name, String cpf, LocalDate birthDate, List<Appointmet> appointments, String cep, List<Medication> medications, Long id) {
		super(name, cpf, birthDate, id);
		this.appointments = appointments;
		this.cep = cep;
		this.medications = medications;
		this.id = id;
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
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString() + "Paciente [ cep=" + cep + ", consultas=" + appointments + ", medicações=" + medications + "]";
	}
	
	
}
