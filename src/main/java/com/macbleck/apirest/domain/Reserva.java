package com.macbleck.apirest.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String dataChegada;
	private String dataReserva;
	private String tempoEstadia;
	private Boolean statusReserva;
	
	@JsonManagedReference
	@ManyToMany(mappedBy = "reservas")
	private List<Hospede> hospedes = new ArrayList<Hospede>();
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="funcionario_id")
	private Funcionario funcionario;
	
	@ManyToOne
	@JoinColumn(name="tipo_apt_id")
	private TipoApartamento tipoApartamento;
	
	@JsonBackReference
	@ManyToMany
	@JoinTable(
			name = "reserva_hospedagem",
			joinColumns = @JoinColumn(name="reserva_id"),
			inverseJoinColumns = @JoinColumn(name="hospedagem_id")
	)
	private List<Hospedagem> hospedagens = new ArrayList<Hospedagem>();

	public Reserva() {
		
	}

	public Reserva(String dataChegada, String dataReserva, String tempoEstadia, TipoApartamento tipoApartamento, Boolean statusReserva) {
		super();
		this.dataChegada = dataChegada;
		this.dataReserva = dataReserva;
		this.tempoEstadia = tempoEstadia;
		this.tipoApartamento = tipoApartamento;
		this.statusReserva = statusReserva;
	}
	
	public List<Hospedagem> getHospedagens() {
		return hospedagens;
	}

	public void setHospedagens(List<Hospedagem> hospedagens) {
		this.hospedagens = hospedagens;
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

	public List<Hospede> getHospedes() {
		return hospedes;
	}

	public void setHospedes(List<Hospede> hospedes) {
		this.hospedes = hospedes;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public TipoApartamento getTipoApartamento() {
		return tipoApartamento;
	}

	public void setTipoApartamento(TipoApartamento tipoApartamento) {
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