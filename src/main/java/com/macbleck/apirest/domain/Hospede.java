package com.macbleck.apirest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Hospede extends Pessoa {
	private static final long serialVersionUID = 1L;

	private String preferencia;

	@JsonBackReference
	@OneToMany(mappedBy = "hospede")
	private List<Reserva> reservas = new ArrayList<Reserva>();
	
	@JsonBackReference
	@ManyToMany
	@JoinTable(
			name = "hospede_hospedagem",
			joinColumns = @JoinColumn(name="hospede_id"),
			inverseJoinColumns = @JoinColumn(name="hospedagem_id")
	)
	private List<Hospedagem> hospedagens = new ArrayList<Hospedagem>();
	
	public Hospede () {
		
	}
	
	public Hospede(
			String nome, 
			String cpf,
			String dataNascimento,
			String preferencia) {
		
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		
		this.preferencia = preferencia;
	}

	public List<Hospedagem> getHospedagens() {
		return hospedagens;
	}

	public void setHospedagens(List<Hospedagem> hospedagens) {
		this.hospedagens = hospedagens;
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