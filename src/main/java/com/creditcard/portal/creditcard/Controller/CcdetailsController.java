package com.creditcard.portal.creditcard.Controller;

import com.creditcard.portal.creditcard.Model.Ccdetails;
import com.creditcard.portal.creditcard.Services.Ccdetailsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value="/api")
public class CcdetailsController 
{
    @Autowired
    private Ccdetailsservice ccdetailsservice;

    @PostMapping(value="/ccdetails")
    public void add(@RequestBody Ccdetails ccdetails) {
        ccdetailsservice.save(ccdetails);
    }

    // @Autowired
    //  private fetchapplication fetchserv;
     
    // @GetMapping(value="/application")
    // public Iterable<Application> list() 
    // {
    //     if(fetchserv.fetchAllData()==null)
    //     {
    //         throw new UserNotFoundException("id: error");
    //     }
    //     else
    //     {
    //     return fetchserv.fetchAllData();
    //     }
    // }


    public static void main(String[] args) {
        SpringApplication.run(Applicationcontroller.class, args);
    }

    
}
