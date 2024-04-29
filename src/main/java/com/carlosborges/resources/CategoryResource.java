package com.carlosborges.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carlosborges.entities.Category;
import com.carlosborges.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Category>> findAll(){
		List<Category> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}
	 
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Category> findById(@PathVariable Integer id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
