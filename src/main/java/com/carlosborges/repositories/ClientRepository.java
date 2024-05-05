package com.carlosborges.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosborges.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
