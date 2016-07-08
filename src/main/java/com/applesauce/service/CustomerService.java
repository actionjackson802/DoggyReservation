package com.applesauce.service;

import com.applesauce.model.Customer;
import com.applesauce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by JacksonChang408 on 5/19/2016.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer){
        customerRepository.save(customer);
        return customer;
    }

    public List<Customer> findByFirstName(String firstName){
        return customerRepository.findByFirstName(firstName);
    }

    public List<Customer> findByLastName(String lastName){
        return customerRepository.findByLastName(lastName);
    }

    public Customer findByEmail(String email){
        return customerRepository.findByEmail(email);
    }

}
