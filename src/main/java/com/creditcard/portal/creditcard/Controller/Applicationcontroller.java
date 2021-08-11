package com.creditcard.portal.creditcard.Controller;

import java.util.NoSuchElementException;

import com.creditcard.portal.creditcard.UserNotFoundException;
import com.creditcard.portal.creditcard.Model.Application;
import com.creditcard.portal.creditcard.Services.Applicationservice;
import com.creditcard.portal.creditcard.Services.fetchapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value="/api")
public class Applicationcontroller 
{
    @Autowired
    private Applicationservice applicationservice;

    @PostMapping(value="/application")
    public void add(@RequestBody Application applicationtable) {
        applicationservice.save(applicationtable);
    }

    @Autowired
     private fetchapplication fetchserv;
     
    @GetMapping(value="/application")
    public Iterable<Application> list() 
    {
        if(fetchserv.fetchAllData()==null)
        {
            throw new UserNotFoundException("id: error");
        }
        else
        {
        return fetchserv.fetchAllData();
        }
    }


    public static void main(String[] args) {
        SpringApplication.run(Applicationcontroller.class, args);
    }

    
}
