package com.creditcard.portal.creditcard.Services;

import javax.transaction.Transactional;

import com.creditcard.portal.creditcard.Model.Checkstatus;
import com.creditcard.portal.creditcard.Respository.CheckstatusRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Getstatus 
{
    @Autowired
    private CheckstatusRepo  statusrepo;
    public Iterable<Checkstatus> fetchAllData()
    {
       return statusrepo.findAll();
    }
    
}
