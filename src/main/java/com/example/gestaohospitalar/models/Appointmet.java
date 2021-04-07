package com.example.gestaohospitalar.models;

import java.sql.Date;
import java.util.List;

import com.example.gestaohospitalar.enums.TypeAppointmentEnum;



public class Appointmet {

	private Long id;

	private TypeAppointmentEnum typeAppointment;
	private Double duration;
	private String occasion;
	private Double cost;
	private String diagnosis;
	private Employee doctor;
	private Patient patient;
	private List<String> inputs;
	private List<Medication> medications;
	private Date date;
	private Unit unit;

	public Appointmet(TypeAppointmentEnum typeAppointment, Double duration, String occasion, Double cost,
			String diagnosis, Employee doctor, Patient patient, List<String> inputs, List<Medication> medications,
			Date date, Unit unit) {
		super();
		this.typeAppointment = typeAppointment;
		this.duration = duration;
		this.occasion = occasion;
		this.cost = cost;
		this.diagnosis = diagnosis;
		this.doctor = doctor;
		this.patient = patient;
		this.inputs = inputs;
		this.medications = medications;
		this.date = date;
		this.unit = unit;
	}

	public TypeAppointmentEnum getTypeAppointment() {
		return typeAppointment;
	}

	public void setTypeAppointment(TypeAppointmentEnum typeAppointment) {
		this.typeAppointment = typeAppointment;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Employee getDoctor() {
		return doctor;
	}

	public void setDoctor(Employee doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<String> getInputs() {
		return inputs;
	}

	public void setInputs(List<String> inputs) {
		this.inputs = inputs;
	}

	public List<Medication> getMedications() {
		return medications;
	}

	public void setMedications(List<Medication> medications) {
		this.medications = medications;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Consulta [tipoConsulta=" + typeAppointment + ", duracao=" + duration + ", ocorrencia=" + occasion
				+ ", custo=" + cost + ", diagnostico=" + diagnosis + ", medico=" + doctor.toString() + ", insumos="
				+ inputs + ", medicamentos=" + medications + ", data=" + date + ", unidade=" + unit + "]";
	}

}
