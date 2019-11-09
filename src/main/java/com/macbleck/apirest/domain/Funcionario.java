package com.macbleck.apirest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Funcionario extends Pessoa {
	private static final long serialVersionUID = 1L;

	private String matricula;
	private String dataAdmissao;
	private String cargo;
	private Double 	salario;
	private String nivelAcesso;
	
	@OneToMany(mappedBy = "funcionario")
	private List<Reserva> reservas = new ArrayList<Reserva>();

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
	
	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
}