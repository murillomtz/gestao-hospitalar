package com.example.gestaohospitalar.models;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import com.example.gestaohospitalar.enums.RoleEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Employee extends PersonModel implements Serializable {


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
		super(name, cpf, birthDate);
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
