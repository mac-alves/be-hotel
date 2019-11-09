package com.macbleck.apirest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String dataChegada;
	private String dataReserva;
	private String tempoEstadia;
	private Hospede hospede;
	private Funcionario funcionario;
	private String tipoApartamento;
	private Boolean statusReserva;
	
	public Reserva() {
		
	}

	public Reserva(String dataChegada, String dataReserva, String tempoEstadia, Hospede hospede,
			Funcionario funcionario, String tipoApartamento, Boolean statusReserva) {
		super();
		this.dataChegada = dataChegada;
		this.dataReserva = dataReserva;
		this.tempoEstadia = tempoEstadia;
		this.hospede = hospede;
		this.funcionario = funcionario;
		this.tipoApartamento = tipoApartamento;
		this.statusReserva = statusReserva;
	}

	public String getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}

	public String getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}

	public String getTempoEstadia() {
		return tempoEstadia;
	}

	public void setTempoEstadia(String tempoEstadia) {
		this.tempoEstadia = tempoEstadia;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getTipoApartamento() {
		return tipoApartamento;
	}

	public void setTipoApartamento(String tipoApartamento) {
		this.tipoApartamento = tipoApartamento;
	}

	public Boolean getStatusReserva() {
		return statusReserva;
	}

	public void setStatusReserva(Boolean statusReserva) {
		this.statusReserva = statusReserva;
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
		Reserva other = (Reserva) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}