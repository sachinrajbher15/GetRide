package com.acciojob.GetRide.controller;

import com.acciojob.GetRide.dto.request.response.CustomerRequest;
import com.acciojob.GetRide.model.Customer;
import com.acciojob.GetRide.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customerRequest){
        String response = customerService.addCustomer(customerRequest);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public Customer getCustomer(@RequestParam("emailID") String emailId){
        return customerService.getCustomer(emailId);
    }
    @GetMapping("/get-by-age-gender")
    public List<Customer> getAllByGenderAndAgeGreaterThan(@RequestParam("gender") String gender, @RequestParam("age") int age){
        return customerService.getAllByGenderAndAgeGreaterThan(gender,age);
    }
}