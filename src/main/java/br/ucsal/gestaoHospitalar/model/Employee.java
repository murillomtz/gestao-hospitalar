package br.ucsal.gestaoHospitalar.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Employee extends Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private RoleEnum role;
	private Unit unit;
	private Double valueHour;

	public Employee(String nome, String cpf, Date nascimento, RoleEnum role, Unit unit, Double valueHour) {
		super(nome, cpf, nascimento);
		this.role = role;
		this.unit = unit;
		this.valueHour = valueHour;
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
