package com.macbleck.apirest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Hospede extends Pessoa {
	private static final long serialVersionUID = 1L;

	private String preferencia;

	@JsonBackReference
	@ManyToMany
	@JoinTable(
			name = "reserva_hospede",
			joinColumns = @JoinColumn(name="hospede_id"),
			inverseJoinColumns = @JoinColumn(name="reserva_id")
	)
	private List<Reserva> reservas = new ArrayList<Reserva>();
	
	public Hospede () {
		
	}
	
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

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
}