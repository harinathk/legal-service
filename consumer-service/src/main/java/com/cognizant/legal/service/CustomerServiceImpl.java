package com.cognizant.legal.service;

import com.cognizant.legal.domain.Customer;
import com.cognizant.legal.domain.CustomerFavoriteLawyers;
import com.cognizant.legal.domain.Lawyer;
import com.cognizant.legal.repo.CustomerFavoriteLawyersRepository;
import com.cognizant.legal.repo.CustomerRepository;
import com.cognizant.legal.repo.LawyerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    final
    CustomerRepository customerRepository;

    final
    LawyerRepository lawyerRepository;

    final
    CustomerFavoriteLawyersRepository customerFavoriteLawyersRepository;
    
    public CustomerServiceImpl( CustomerRepository customerRepository, 
                               LawyerRepository lawyerRepository, 
                               CustomerFavoriteLawyersRepository customerFavoriteLawyersRepository) {
        this.customerRepository = customerRepository;
        this.lawyerRepository = lawyerRepository;
        this.customerFavoriteLawyersRepository = customerFavoriteLawyersRepository;
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public String favoriteLawyer(Long lawyerId, Long customerId) {
        Optional<Lawyer> lawyer = lawyerRepository.findById(lawyerId);
        
        Optional<Customer> customer = customerRepository.findById(customerId);
        if (lawyer.isPresent() && customer.isPresent()) {
            CustomerFavoriteLawyers existingFavoriteLawyers=customerFavoriteLawyersRepository.findByCustomerIdAndLawyerId(customerId,lawyerId);
           if(existingFavoriteLawyers==null) {
               CustomerFavoriteLawyers customerFavoriteLawyers = new CustomerFavoriteLawyers();
               customerFavoriteLawyers.setCustomerId(customerId);
               customerFavoriteLawyers.setLawyerId(lawyerId);
               customerFavoriteLawyersRepository.save(customerFavoriteLawyers);
               return "Customer favorite Lawyer Added";
           }
           else
               return "Customer favorite Lawyer Already Added";


        }
        else
            return "Customer or Lawyer Not Found";
    }


    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers= customerRepository.findAll();

        return  customers;
    }


    @Override
    public List<Lawyer> getFavoriteLawyers(Long customerId) {
        customerRepository.
    }
}
