package com.carlosborges.entities;

import com.carlosborges.entities.enums.PaymentStatus;

import jakarta.persistence.Entity;

@Entity
public class PaymentCard extends Payment{
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PaymentCard() {		
	}

	public PaymentCard(Integer id, PaymentStatus status, Order order, Integer numeroDeParcelas) {
		super(id, status, order);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	

}
