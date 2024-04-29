package com.carlosborges.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosborges.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
