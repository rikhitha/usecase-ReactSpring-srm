package com.creditcard.portal.creditcard.Services;

import javax.transaction.Transactional;

import com.creditcard.portal.creditcard.Model.Application;
import com.creditcard.portal.creditcard.Respository.ApplicationRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Applicationservice 
{
    @Autowired
 private ApplicationRepo applicationRepo;
    
    public void save(Application applicationtable)
    {
        applicationRepo.save(applicationtable);
    }
    public Application get(int id)
    {
        
        return (Application) applicationRepo.findById(id).get();
    }
    
    
}
