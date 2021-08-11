package com.creditcard.portal.creditcard.Respository;

import com.creditcard.portal.creditcard.Model.Ccdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CcdetailsRepo extends JpaRepository<Ccdetails,Integer>{
    
}
