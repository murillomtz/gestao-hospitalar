package br.ucsal.gestaoHospitalar.model;

import java.util.List;

public class Medicamento {

	private String nome;
	private String dosagem;
	private List<String> efeitosPositivos;
	private List<String> efeitosNegativo;

	public Medicamento(String nome, String dosagem, List<String> efeitosPositivos, List<String> efeitosNegativo) {
		super();
		this.nome = nome;
		this.dosagem = dosagem;
		this.efeitosPositivos = efeitosPositivos;
		this.efeitosNegativo = efeitosNegativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public List<String> getEfeitosPositivos() {
		return efeitosPositivos;
	}

	public void setEfeitosPositivos(List<String> efeitosPositivos) {
		this.efeitosPositivos = efeitosPositivos;
	}

	public List<String> getEfeitosNegativo() {
		return efeitosNegativo;
	}

	public void setEfeitosNegativo(List<String> efeitosNegativo) {
		this.efeitosNegativo = efeitosNegativo;
	}

	@Override
	public String toString() {
		return "Medicamento [nome=" + nome + ", dosagem=" + dosagem + ", efeitosPositivos=" + efeitosPositivos
				+ ", efeitosNegativo=" + efeitosNegativo + "]";
	}

}
