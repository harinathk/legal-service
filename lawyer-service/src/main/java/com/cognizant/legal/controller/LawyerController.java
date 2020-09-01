package com.cognizant.legal.controller;

import com.cognizant.legal.domain.Lawyer;
import com.cognizant.legal.service.LawyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/legal")
public class LawyerController {

    @Autowired
    LawyerService lawyerService;

    @PostMapping("/lawyer")
    public Lawyer createLawyer(@RequestBody Lawyer lawyer) {
        return lawyerService.saveCustomer(lawyer);

    }
    @GetMapping("/lawyer")
    public List<Lawyer> getAllLawyers() {
        return lawyerService.getAlLawyers();
    }

}
