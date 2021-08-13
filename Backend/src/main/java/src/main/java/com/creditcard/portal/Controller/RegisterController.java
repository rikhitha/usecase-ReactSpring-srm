package com.creditcard.portal.creditcard.Controller;

import java.util.List;

import com.creditcard.portal.creditcard.Model.Register;
import com.creditcard.portal.creditcard.Respository.RegisterRepo;
import com.creditcard.portal.creditcard.Services.Registerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class RegisterController 
{
    @Autowired
    private Registerservice registerservice;

    @PostMapping("/register")
    public void add(@RequestBody Register register) 
    {
        registerservice.save(register);
    }
    
    

    public static void main(String[] args) {
        SpringApplication.run(RegisterController.class, args);
    }
    
    
}
