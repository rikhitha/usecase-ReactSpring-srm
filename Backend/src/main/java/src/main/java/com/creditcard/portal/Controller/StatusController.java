package com.creditcard.portal.creditcard.Controller;

import java.util.NoSuchElementException;

import com.creditcard.portal.creditcard.Model.Checkstatus;
import com.creditcard.portal.creditcard.Services.Getstatus;
import com.creditcard.portal.creditcard.Services.checkstatusservice;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api")
public class StatusController
 {
    @Autowired
    checkstatusservice csservice;

    @PostMapping("/status")
    public void add(@RequestBody Checkstatus checkstatustable) 
    {
        csservice.save(checkstatustable);
    }

    @Autowired
    private Getstatus getstausserv;
    @GetMapping("/getstatus")
    public Iterable<Checkstatus> list() 
    {
        return getstausserv.fetchAllData();
    }
  
    
}
