package com.cognizant.legal.service;

import com.cognizant.legal.domain.Lawyer;

import java.util.List;


public interface LawyerService {
    Lawyer saveCustomer(Lawyer lawyer);
    List<Lawyer> getAlLawyers();
    
    //Todo Static Method
    static void staticMethod(){
        System.out.println("Static method in the interface");
    }
    //Todo Default Method
    default void defaultMethod(){
        System.out.println("Default Method");
    }
}
