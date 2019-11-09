package com.macbleck.apirest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospedagem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Hospede hospede;
	private Apartamento apartamento;
	private String dataEntrada;
	private String dataSaida;
	private Double valorHospedagem;
	private String obsHospedagem;
	private Integer numPessoas;
	
	public Hospedagem() {
		
	}

	public Hospedagem(Hospede hospede, Apartamento apartamento, String dataEntrada, String dataSaida,
			Double valorHospedagem, String obsHospedagem, Integer numPessoas) {
		super();
		this.hospede = hospede;
		this.apartamento = apartamento;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.valorHospedagem = valorHospedagem;
		this.obsHospedagem = obsHospedagem;
		this.numPessoas = numPessoas;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Double getValorHospedagem() {
		return valorHospedagem;
	}

	public void setValorHospedagem(Double valorHospedagem) {
		this.valorHospedagem = valorHospedagem;
	}

	public String getObsHospedagem() {
		return obsHospedagem;
	}

	public void setObsHospedagem(String obsHospedagem) {
		this.obsHospedagem = obsHospedagem;
	}

	public Integer getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(Integer numPessoas) {
		this.numPessoas = numPessoas;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospedagem other = (Hospedagem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}