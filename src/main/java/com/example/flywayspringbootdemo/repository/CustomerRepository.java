package com.example.flywayspringbootdemo.repository;

import com.example.flywayspringbootdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
