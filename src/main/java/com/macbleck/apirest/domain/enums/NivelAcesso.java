package com.macbleck.apirest.domain.enums;

public enum NivelAcesso {

	ALPHA(1, "Apha"),
	BETA(2, "Beta"),
	GAMA(3, "Gama"),
	PRISMA(4, "Prisma");
	
	private Integer cod;
	private String descricao;
	
	private NivelAcesso(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static NivelAcesso toEnum (Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (NivelAcesso x : NivelAcesso.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido: "+cod);
	}
}
