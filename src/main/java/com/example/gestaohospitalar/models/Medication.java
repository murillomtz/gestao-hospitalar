package com.example.gestaohospitalar.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "tb_medivation")
public class Medication implements Serializable {
	private static final long serialVersionUID = -3333079652156927083L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	private Long id;
	
	private String name;
	private String dosage;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "POSITIVEEFECTS") // CRIA UMA TABELA COM O ID E TELEFONE
	private Set<String> positiveEffects;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "NEGATIVEEFECTS") // CRIA UMA TABELA COM O ID E TELEFONE
	private Set<String> negativeEffects;

	public Medication(String nome, String dosagem, Set<String> efeitosPositivos, Set<String> efeitosNegativo) {
		super();
		this.name = nome;
		this.dosage = dosagem;
		this.positiveEffects = efeitosPositivos;
		this.negativeEffects = efeitosNegativo;
	}

	public Medication() {

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

	public Set<String> getEfeitosPositivos() {
		return positiveEffects;
	}

	public void setEfeitosPositivos(Set<String> efeitosPositivos) {
		this.positiveEffects = efeitosPositivos;
	}

	public Set<String> getEfeitosNegativo() {
		return negativeEffects;
	}

	public void setEfeitosNegativo(Set<String> efeitosNegativo) {
		this.negativeEffects = efeitosNegativo;
	}

	@Override
	public String toString() {
		return "Medicação [Nome=" + name + ", dosagem=" + dosage + ", Efeitos \n Positivos=" + positiveEffects
				+ "\n Negativos=" + negativeEffects + "]";
	}

}
