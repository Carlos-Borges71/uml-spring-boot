package com.carlosborges.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carlosborges.entities.Product;
import com.carlosborges.services.ProductService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Product>> findAll(){
		List<Product> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}
	 
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product> findById(@PathVariable Integer id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
