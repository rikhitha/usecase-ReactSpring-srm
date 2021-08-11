package com.creditcard.portal.creditcard.Respository;

import java.util.Optional;

import com.creditcard.portal.creditcard.Model.Application;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepo extends JpaRepository<Application,Integer>
{

    

    
    
}
