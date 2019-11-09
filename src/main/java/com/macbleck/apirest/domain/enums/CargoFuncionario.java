package com.macbleck.apirest.domain.enums;

public enum CargoFuncionario {

	ATENDENTE(1, "Atendente"),
	RECEPCIONISTA(2, "Recepcionista"),
	MALEIRO(3, "Maleiro"),
	PORTEIRO(4, "Porteiro"),
	ZELADOR(5, "Zelador"),
	GERENTE(6, "Gerente");
	
	private Integer cod;
	private String descricao;
	
	private CargoFuncionario(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static CargoFuncionario toEnum (Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (CargoFuncionario x : CargoFuncionario.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido: "+cod);
	}
}
