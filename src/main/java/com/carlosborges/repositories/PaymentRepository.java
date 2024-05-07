package com.carlosborges.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosborges.entities.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
