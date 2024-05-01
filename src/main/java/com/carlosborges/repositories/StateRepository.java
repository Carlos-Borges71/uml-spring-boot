package com.carlosborges.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosborges.entities.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{

}
