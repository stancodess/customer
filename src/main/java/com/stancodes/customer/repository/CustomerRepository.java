/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.stancodes.customer.repository;

import com.stancodes.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Stalin Caiche Morán
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
