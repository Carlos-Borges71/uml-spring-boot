package com.carlosborges.entities.enums;

public enum TypeClient {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TypeClient(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TypeClient toEmum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		 
		for (TypeClient x : TypeClient.values()) {
			if (cod.equals(x.getCod())){
				return x;
			}
		}
		
		throw new IllegalAccessError("Id invalido: " + cod);
	}
	
	

}
