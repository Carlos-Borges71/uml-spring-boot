package com.carlosborges.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosborges.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
