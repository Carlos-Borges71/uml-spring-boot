package com.carlosborges.entities.enums;

public enum PaymentStatus {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private PaymentStatus(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static PaymentStatus toEmum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		 
		for (PaymentStatus x : PaymentStatus.values()) {
			if (cod.equals(x.getCod())){
				return x;
			}
		}
		
		throw new IllegalAccessError("Id invalido: " + cod);
	}

}
