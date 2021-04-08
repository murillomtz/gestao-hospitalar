package com.example.gestaohospitalar.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.example.gestaohospitalar.enums.RoleEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table
public class Employee extends PersonModel implements Serializable {
	private static final long serialVersionUID = 6321738996577997893L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	private Long id;
	
	private RoleEnum role;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "unit_id", referencedColumnName = "id")
	@JsonIgnore
	private Unit unit;

	private Double valueHour;

	public Employee(String name, String cpf, LocalDate birthDate, Long id, RoleEnum role, Unit unit, Double valueHour) {
		super(name, cpf, birthDate, id);
		this.id = id;
		this.role = role;
		this.unit = unit;
		this.valueHour = valueHour;
	}

	public Employee(Long id, RoleEnum role, Unit unit, Double valueHour) {
		this.id = id;
		this.role = role;
		this.unit = unit;
		this.valueHour = valueHour;
	}

	public Employee() {

	}

	public RoleEnum getRole() {
		return role;
	}

	public void setRole(RoleEnum role) {
		this.role = role;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Double getValueHour() {
		return valueHour;
	}

	public void setValueHour(Double valueHour) {
		this.valueHour = valueHour;
	}

	@Override
	public String toString() {
		return super.toString() + "Funcionario [Função=" + role + ", Unit=" + unit + ", Valor por Hora=" + valueHour
				+ "]";
	}

}
