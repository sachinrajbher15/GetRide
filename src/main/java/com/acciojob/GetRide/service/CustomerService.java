package com.acciojob.GetRide.service;

import com.acciojob.GetRide.dto.request.response.CustomerRequest;
import com.acciojob.GetRide.model.Customer;
import com.acciojob.GetRide.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String addCustomer(CustomerRequest customerRequest) {
        //dto -> entity
        Customer customer = new Customer();
        customer.setAge(customerRequest.getAge());
        customer.setName(customerRequest.getName());
        customer.setGender(customerRequest.getGender());
        customer.setEmailId(customerRequest.getEmailId());
        Customer SavedCustomer = customerRepository.save(customer);
        return "Customer added successfully";
    }

    public Customer getCustomer(String emailId) {
//        List<Customer> customerList = customerRepository.findAll();
        return customerRepository.findByEmailId(emailId);
    }

    public List<Customer> getAllByGenderAndAgeGreaterThan(String gender, int age) {
        return customerRepository.getAllByGenderAndAgeGreaterThan(gender,age);
    }
}