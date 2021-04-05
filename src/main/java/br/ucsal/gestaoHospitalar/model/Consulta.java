package br.ucsal.gestaoHospitalar.model;

import java.sql.Date;
import java.util.List;

public class Consulta {

	private TipoConsultaEnum tipoConsulta;
	private Double duracao;
	private String ocorrencia;
	private Double custo;
	private String diagnostico;
	private Funcionario medico;
	private Paciente paciente;
	private List<String> insumos;
	private List<Medicamento> medicamentos;
	private Date data;
	private Unidade unidade;

	public Consulta(TipoConsultaEnum tipoConsulta, Double duracao, String ocorrencia, Double custo, String diagnostico,
			Funcionario medico, Paciente paciente, List<String> insumos, List<Medicamento> medicamentos, Date data,
			Unidade unidade) {
		super();
		this.tipoConsulta = tipoConsulta;
		this.duracao = duracao;
		this.ocorrencia = ocorrencia;
		this.custo = custo;
		this.diagnostico = diagnostico;
		this.medico = medico;
		this.paciente = paciente;
		this.insumos = insumos;
		this.medicamentos = medicamentos;
		this.data = data;
		this.unidade = unidade;
	}

	public TipoConsultaEnum getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(TipoConsultaEnum tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Funcionario getMedico() {
		return medico;
	}

	public void setMedico(Funcionario medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<String> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<String> insumos) {
		this.insumos = insumos;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	@Override
	public String toString() {
		return "Consulta [tipoConsulta=" + tipoConsulta + ", duracao=" + duracao + ", ocorrencia=" + ocorrencia
				+ ", custo=" + custo + ", diagnostico=" + diagnostico + ", medico=" + medico.toString() + ", insumos="
				+ insumos + ", medicamentos=" + medicamentos + ", data=" + data + ", unidade=" + unidade + "]";
	}

}
