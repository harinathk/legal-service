package com.cognizant.legal.service;

import com.cognizant.legal.domain.Customer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public String favoriteLawyer(Long lawyerId,Long customerId);
}
