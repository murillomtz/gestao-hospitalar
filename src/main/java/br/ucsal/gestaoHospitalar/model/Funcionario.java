package br.ucsal.gestaoHospitalar.model;

import java.sql.Date;

public class Funcionario extends Pessoa{
	
	private FuncaoEnum funcao;
	private Unidade unidade;
	private Double valorHora;
	
	public Funcionario(String nome, String cpf, Date nascimento, FuncaoEnum funcao, Unidade unidade,
			Double valorHora) {
		super(nome, cpf, nascimento);
		this.funcao = funcao;
		this.unidade = unidade;
		this.valorHora = valorHora;
	}

	public FuncaoEnum getFuncao() {
		return funcao;
	}

	public void setFuncao(FuncaoEnum funcao) {
		this.funcao = funcao;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public String toString() {
		return super.toString() + "Funcionario [funcao=" + funcao + ", unidade=" + unidade + ", valorHora=" + valorHora + "]";
	}
	
}
