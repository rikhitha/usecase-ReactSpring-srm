package com.creditcard.portal.creditcard.Respository;

import com.creditcard.portal.creditcard.Model.Register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  RegisterRepo extends JpaRepository<Register,Integer> 
{
    
}
