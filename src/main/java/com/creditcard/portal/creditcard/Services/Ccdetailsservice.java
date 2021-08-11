package com.creditcard.portal.creditcard.Services;

import javax.transaction.Transactional;

import com.creditcard.portal.creditcard.Model.Ccdetails;
import com.creditcard.portal.creditcard.Respository.CcdetailsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Ccdetailsservice
{
   @Autowired
   private CcdetailsRepo ccrepo;

   public void save( Ccdetails ccdetailstable)
    {
        ccrepo.save(ccdetailstable);
    }
    public Ccdetails get(int id)
    {
        
        return (Ccdetails) ccrepo.findById(id).get();
    }
    
}
