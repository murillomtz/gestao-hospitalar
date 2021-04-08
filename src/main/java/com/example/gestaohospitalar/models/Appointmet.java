package com.example.gestaohospitalar.models;


import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.example.gestaohospitalar.enums.TypeAppointmentEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.time.LocalDate;

import java.util.Set;


@Entity
@Table(name = "tb_appointmet")
public class Appointmet implements Serializable {
	private static final long serialVersionUID = -4212996042496642502L;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Long id;

    private TypeAppointmentEnum typeAppointment;
    private Double duration;
    private String occasion;
    private Double cost;
    private String diagnosis;

    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private DoctorModel doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;


    @ElementCollection // Mapear pelo JPA como uma entidade fraca
    @CollectionTable(name = "INPUTS") // CRIA UMA TABELA COM O ID E TELEFONE
    private Set<String> inputs;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "medication_id")
    private List<Medication> medications;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate date;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="unit_id")
    private Unit unit;

    public Appointmet(TypeAppointmentEnum typeAppointment, Double duration, String occasion, Double cost,
                      String diagnosis, DoctorModel doctor, Patient patient, Set<String> inputs, List<Medication> medications,
                      LocalDate date, Unit unit) {
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

	public Appointmet() {

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

    public void setDoctor(DoctorModel doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Set<String> getInputs() {
        return inputs;
    }

    public void setInputs(Set<String> inputs) {
        this.inputs = inputs;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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
