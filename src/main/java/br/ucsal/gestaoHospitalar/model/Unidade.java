package br.ucsal.gestaoHospitalar.model;

public class Unidade {

	private String nome;
	private String cep;
	private String local;
	private String telefone;

	public Unidade(String nome, String cep, String local, String telefone) {
		super();
		this.nome = nome;
		this.cep = cep;
		this.local = local;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Unidade [nome=" + nome + ", cep=" + cep + ", local=" + local + ", telefone=" + telefone + "]";
	}

}
