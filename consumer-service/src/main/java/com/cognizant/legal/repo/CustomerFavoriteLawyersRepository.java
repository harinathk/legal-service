package com.cognizant.legal.repo;

import com.cognizant.legal.domain.Customer;
import com.cognizant.legal.domain.CustomerFavoriteLawyers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerFavoriteLawyersRepository extends JpaRepository<CustomerFavoriteLawyers,Long> {

    CustomerFavoriteLawyers findByCustomerIdAndLawyerId(Long customerId,Long LawyerId);
}
