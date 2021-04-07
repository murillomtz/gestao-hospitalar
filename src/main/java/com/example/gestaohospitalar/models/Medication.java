package com.example.gestaohospitalar.models;

import java.util.List;

public class Medication {

	private Long id;
	
	private String name;
	private String dosage;
	private List<String> positiveEffects;
	private List<String> negativeEffects;

	public Medication(String nome, String dosagem, List<String> efeitosPositivos, List<String> efeitosNegativo) {
		super();
		this.name = nome;
		this.dosage = dosagem;
		this.positiveEffects = efeitosPositivos;
		this.negativeEffects = efeitosNegativo;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public String getDosagem() {
		return dosage;
	}

	public void setDosagem(String dosagem) {
		this.dosage = dosagem;
	}

	public List<String> getEfeitosPositivos() {
		return positiveEffects;
	}

	public void setEfeitosPositivos(List<String> efeitosPositivos) {
		this.positiveEffects = efeitosPositivos;
	}

	public List<String> getEfeitosNegativo() {
		return negativeEffects;
	}

	public void setEfeitosNegativo(List<String> efeitosNegativo) {
		this.negativeEffects = efeitosNegativo;
	}

	@Override
	public String toString() {
		return "Medicação [Nome=" + name + ", dosagem=" + dosage + ", Efeitos \n Positivos=" + positiveEffects
				+ "\n Negativos=" + negativeEffects + "]";
	}

}