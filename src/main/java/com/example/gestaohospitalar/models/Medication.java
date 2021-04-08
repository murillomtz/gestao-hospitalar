package com.example.gestaohospitalar.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_medivation")
public class Medication implements Serializable {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	private Long id;
	
	private String name;
	private String dosage;

	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> positiveEffects;

	@ElementCollection(fetch = FetchType.EAGER)
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
