package com.cognizant.legal.repo;

import com.cognizant.legal.domain.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LawyerRepository extends JpaRepository<Lawyer, Long> {

    List<Lawyer> findByName(String name);


}
