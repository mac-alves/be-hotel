package com.macbleck.apirest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Apartamento implements Serializable  {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer numeroApartamento;
	private Integer andar;
	private Boolean disponibilidade;
	
	@ManyToOne
	@JoinColumn(name="tipo_apt_id")
	private TipoApartamento tipoApartamento;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="hospedagem_id")
	private Hospedagem hospedagem;
	
	public Apartamento () {
		
	}

	public Apartamento(Integer numeroApartamento, Integer andar, Boolean disponibilidade,
			TipoApartamento tipoApartamento) {
		super();
		this.numeroApartamento = numeroApartamento;
		this.andar = andar;
		this.disponibilidade = disponibilidade;
		this.tipoApartamento = tipoApartamento;
	}

	public Integer getNumeroApartamento() {
		return numeroApartamento;
	}

	public void setNumeroApartamento(Integer numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}

	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	public Boolean getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public TipoApartamento getTipoApartamento() {
		return tipoApartamento;
	}

	public void setTipoApartamento(TipoApartamento tipoApartamento) {
		this.tipoApartamento = tipoApartamento;
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
		Apartamento other = (Apartamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}