package com.creditcard.portal.creditcard.Services;

import javax.transaction.Transactional;

import com.creditcard.portal.creditcard.Model.Application;
import com.creditcard.portal.creditcard.Respository.ApplicationRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class fetchapplication 
{
    @Autowired
    private ApplicationRepo apprepo;
    public Iterable<Application> fetchAllData()
    {
       return apprepo.findAll();
    }
    
}
