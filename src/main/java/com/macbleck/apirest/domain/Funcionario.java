package com.macbleck.apirest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.macbleck.apirest.domain.enums.CargoFuncionario;
import com.macbleck.apirest.domain.enums.NivelAcesso;

@Entity
public class Funcionario extends Pessoa {
	private static final long serialVersionUID = 1L;

	private String matricula;
	private String dataAdmissao;
	private Double 	salario;
	private Integer nivelAcesso;
	private Integer cargo;
	
	@JsonBackReference
	@OneToMany(mappedBy = "funcionario")
	private List<Hospedagem> hospedagem = new ArrayList<Hospedagem>();

	public Funcionario() {
		
	}

	public Funcionario(
			String nome, 
			String cpf,
			String dataNascimento,
			String matricula, 
			String dataAdmissao,
			Double salario,
			CargoFuncionario cargo,
			NivelAcesso nivelAcesso) {
		
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);		
		this.matricula = matricula;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
		this.cargo = cargo.getCod();
		this.nivelAcesso = nivelAcesso.getCod();
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

	public CargoFuncionario getCargo() {
		return CargoFuncionario.toEnum(cargo);
	}

	public void setCargo(CargoFuncionario cargo) {
		this.cargo = cargo.getCod();
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public NivelAcesso getNivelAcesso() {
		return NivelAcesso.toEnum(nivelAcesso);
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso.getCod();
	}
	
	public List<Hospedagem> getReservas() {
		return hospedagem;
	}

	public void setReservas(List<Hospedagem> hospedagem) {
		this.hospedagem = hospedagem;
	}
}