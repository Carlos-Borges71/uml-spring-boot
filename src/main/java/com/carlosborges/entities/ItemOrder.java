package com.carlosborges.entities;

import java.io.Serializable;
import java.util.Objects;

import com.carlosborges.entities.PK.ItemOrderPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class ItemOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@EmbeddedId
	private ItemOrderPK id = new ItemOrderPK();

	private Double desconto;
	private Integer quantidade;
	private Double preco;
	
	public ItemOrder() {		
	}

	public ItemOrder(Order order, Product product, Double desconto, Integer quantidade, Double preco) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public Product getProduct() {
		return id.getProduct();
	}

	public ItemOrderPK getId() {
		return id;
	}

	public void setId(ItemOrderPK id) {
		this.id = id;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
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
		ItemOrder other = (ItemOrder) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
