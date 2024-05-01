package com.carlosborges.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosborges.entities.Product;
import com.carlosborges.repositories.ProductRepository;
import com.carlosborges.services.exception.ObjectNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();		
	}
	
	public Product findById(Integer id) {
		Optional<Product> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not faund! Id: " + id
				+ ", type: " + Product.class.getName()));
	}

}
