package com.macbleck.apirest.domain;

import javax.persistence.Entity;

@Entity
public class Hospede extends Pessoa {
	private static final long serialVersionUID = 1L;

	private String preferencia;

	public Hospede(
			String nome, 
			String cpf, 
			String endereco, 
			String telefone,
			String dataNascimento,
			String preferencia) {
		
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setDataNascimento(dataNascimento);
		
		this.preferencia = preferencia;
	}

	public String getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}
	
}