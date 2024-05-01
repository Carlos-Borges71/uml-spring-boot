package com.carlosborges.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosborges.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
