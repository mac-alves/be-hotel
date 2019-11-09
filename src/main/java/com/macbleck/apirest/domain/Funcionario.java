package com.macbleck.apirest.domain;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {
	private static final long serialVersionUID = 1L;

	private String matricula;
	private String dataAdmissao;
	private String cargo;
	private Double 	salario;
	private String nivelAcesso;

	public Funcionario() {
		
	}
	
	public Funcionario(
			String nome, 
			String cpf, 
			String endereco, 
			String telefone,
			String dataNascimento,
			String matricula, 
			String dataAdmissao, 
			String cargo, 
			Double salario, 
			String nivelAcesso) {
		
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setDataNascimento(dataNascimento);
		
		this.matricula = matricula;
		this.dataAdmissao = dataAdmissao;
		this.cargo = cargo;
		this.salario = salario;
		this.nivelAcesso = nivelAcesso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}	
}