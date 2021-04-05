package br.ucsal.gestaoHospitalar.model;

import java.sql.Date;
import java.util.List;

public class Paciente extends Pessoa {

	private List<Consulta> consultas;
	private String cep;
	private List<Medicamento> medicamentos;

	public Paciente(String nome, String cpf, String cep, Date nascimento) {
		super(nome, cpf, nascimento);
		this.cep = cep;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	@Override
	public String toString() {
		return super.toString() + "Paciente [consultas=" + consultas + ", cep=" + cep + ", medicamentos=" + medicamentos + "]";
	}
	
	
}
