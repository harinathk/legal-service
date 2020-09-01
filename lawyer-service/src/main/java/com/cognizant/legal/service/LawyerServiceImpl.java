package com.cognizant.legal.service;

import com.cognizant.legal.domain.Lawyer;
import com.cognizant.legal.repo.LawyerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LawyerServiceImpl implements LawyerService {

    final
    LawyerRepository lawyerRepository;

    public LawyerServiceImpl(LawyerRepository lawyerRepository) {
        this.lawyerRepository = lawyerRepository;
    }

    public Lawyer saveCustomer(Lawyer lawyer){
        return lawyerRepository.save(lawyer);
    }

    @Override
    public List<Lawyer> getAlLawyers() {
        List<Lawyer> lawyers= lawyerRepository.findAll();
        
        //Todo Stream, foreach and Method Reference
        lawyers.stream().filter(s -> s.getName().startsWith("A")).forEach(System.out::println);
        
        return  lawyers;
    }
}
