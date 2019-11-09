package com.macbleck.apirest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoApartamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	private Double precoDiaria;
	private Integer qtQuartos;
	private Integer qtQuartosDisponiveis;
	
	public TipoApartamento() {
		
	}

	public TipoApartamento(String tipo, Double precoDiaria, Integer qtQuartos, Integer qtQuartosDisponiveis) {
		super();
		this.tipo = tipo;
		this.precoDiaria = precoDiaria;
		this.qtQuartos = qtQuartos;
		this.qtQuartosDisponiveis = qtQuartosDisponiveis;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(Double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public Integer getQtQuartos() {
		return qtQuartos;
	}

	public void setQtQuartos(Integer qtQuartos) {
		this.qtQuartos = qtQuartos;
	}

	public Integer getQtQuartosDisponiveis() {
		return qtQuartosDisponiveis;
	}

	public void setQtQuartosDisponiveis(Integer qtQuartosDisponiveis) {
		this.qtQuartosDisponiveis = qtQuartosDisponiveis;
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
		TipoApartamento other = (TipoApartamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}