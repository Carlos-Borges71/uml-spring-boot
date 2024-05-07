package com.carlosborges.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "TB_ORDER")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date Instante;
	
	@OneToOne( cascade = CascadeType.ALL, mappedBy = "order")
	private Payment payment;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "address_entred_id")
	private Address enderecoDeEntrega;
	
	
	public Order() {		
	}


	public Order(Integer id, Date instante, Client client, Address enderecoDeEntrega) {
		super();
		this.id = id;
		Instante = instante;
		this.client = client;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getInstante() {
		return Instante;
	}


	public void setInstante(Date instante) {
		Instante = instante;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Address getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}


	public void setEnderecoDeEntrega(Address enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}
	
}
