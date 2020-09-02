package com.cognizant.legal.service;

import com.cognizant.legal.domain.Customer;
import com.cognizant.legal.domain.Lawyer;
import com.cognizant.legal.domain.LawyerDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface CustomerService {
    Customer saveCustomer(Customer customer);
    String favoriteLawyer(Long lawyerId,Long customerId);

    List<Customer> getAllCustomers();
    
    List<LawyerDTO> getFavoriteLawyers(Long customerId);
}
