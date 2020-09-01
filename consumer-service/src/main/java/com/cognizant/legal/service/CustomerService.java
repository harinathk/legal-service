package com.cognizant.legal.service;

import com.cognizant.legal.domain.Customer;
import com.cognizant.legal.domain.Lawyer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public String favoriteLawyer(Long lawyerId,Long customerId);

    List<Customer> getAllCustomers();
}
