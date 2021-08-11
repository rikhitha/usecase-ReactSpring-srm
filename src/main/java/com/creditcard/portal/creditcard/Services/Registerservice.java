package com.creditcard.portal.creditcard.Services;

import javax.transaction.Transactional;
import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditcard.portal.creditcard.Model.Register;
import com.creditcard.portal.creditcard.Respository.RegisterRepo;

@Service
@Transactional
public class Registerservice 
{
 @Autowired
 private RegisterRepo registerRepo;
    
    public void save(Register registertable)
    {
        registerRepo.save(registertable);
    }
    
}
