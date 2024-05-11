package com.carlosborges.entities;

import java.util.Date;

import com.carlosborges.entities.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;

@Entity
public class PaymentSlip extends Payment{
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataVencimento;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	//@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	
	public PaymentSlip() {		
	}

	public PaymentSlip(Integer id, PaymentStatus status, Order order, Date dataVencimento, Date dataPagamento) {
		super(id, status, order);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;		
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
}
