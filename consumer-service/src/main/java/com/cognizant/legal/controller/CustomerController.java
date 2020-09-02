package com.cognizant.legal.controller;

import com.cognizant.legal.domain.Customer;
import com.cognizant.legal.domain.FavoriteLawyerRequest;
import com.cognizant.legal.domain.Lawyer;
import com.cognizant.legal.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/consumer")
public class CustomerController {

    final
    CustomerService customerService;

    /**
     * Depedency Injection of CustomerService
     * @param customerService
     */
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Get All Consumers
     * @return
     */
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    /**
     * Add consumer
     * @param customer
     * @return
     */
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }


//    @GetMapping("/favlawyer/{id}")
//    public List<Customer> getFavoriteLawyers() {
//        return customerService.get;
//    }
    
    /**
     * Tag favorite lawyers to the consumer
     * @param favoriteLawyerRequest
     * @return
     */
    @PostMapping("/favlawyer")
    public String favoriteLawyer(@RequestBody FavoriteLawyerRequest favoriteLawyerRequest) {
        return customerService.favoriteLawyer(Long.parseLong(favoriteLawyerRequest.getLawyerId()), 
                Long.parseLong(favoriteLawyerRequest.getCustomerId()));
    }
    
 

}
