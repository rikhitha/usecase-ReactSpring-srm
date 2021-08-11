package com.creditcard.portal.creditcard.Services;

import javax.transaction.Transactional;

import com.creditcard.portal.creditcard.Model.Checkstatus;
import com.creditcard.portal.creditcard.Respository.CheckstatusRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class checkstatusservice 
{
    @Autowired
    private CheckstatusRepo statusrepo;

    public void save(Checkstatus statustable)
    {
        statusrepo.save(statustable);
    }
    
    
}
