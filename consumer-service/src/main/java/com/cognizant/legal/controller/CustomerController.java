package com.cognizant.legal.controller;

import com.cognizant.legal.domain.Customer;
import com.cognizant.legal.domain.FavoriteLawyerRequest;
import com.cognizant.legal.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/legal")
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

    @PostMapping("/consumer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PostMapping("/favlawyer")
    public String favoriteLawyer(@RequestBody FavoriteLawyerRequest favoriteLawyerRequest) {
        return customerService.favoriteLawyer(Long.parseLong(favoriteLawyerRequest.getLawyerId()), 
                Long.parseLong(favoriteLawyerRequest.getCustomerId()));
    }


}
