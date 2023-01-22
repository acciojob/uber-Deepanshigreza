package com.driver.repository;

import com.driver.model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.driver.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
