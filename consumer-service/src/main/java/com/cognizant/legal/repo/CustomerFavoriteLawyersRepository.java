package com.cognizant.legal.repo;

import com.cognizant.legal.domain.CustomerFavoriteLawyers;
import com.cognizant.legal.domain.LawyerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerFavoriteLawyersRepository extends JpaRepository<CustomerFavoriteLawyers,Long> {

    CustomerFavoriteLawyers findByCustomerIdAndLawyerId(Long customerId,Long LawyerId);
    
    @Query(value = "SELECT L.Lawyer_Id as lawyerId, L.Name as name, L.User_name as userName, L.Email_Address as emailAddress FROM LAWYER L, CUSTOMER_FAVORITE_LAWYERS CFL " +
            "WHERE L.LAWYER_ID = CFL.LAWYER_ID AND CFL.CUSTOMER_ID=:customerId ", nativeQuery = true)
    List<LawyerDTO> findCustomerFavoriteLawyersByCustomerIdBy(@Param("customerId") Long customerId);
}
