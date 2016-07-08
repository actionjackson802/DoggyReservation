package com.applesauce.controller;

import com.applesauce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.applesauce.model.Customer;

import java.util.List;

/**
 * Created by JacksonChang408 on 5/19/2016.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    //private CustomerService customerService = new CustomerService();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String customerHome(){
        return "Customer Home";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Testing mapping";
    }

    @RequestMapping(value = "/addcustomer", method = RequestMethod.PUT)
    public Customer addCustomer(@RequestParam("firstName") String firstName,
                             @RequestParam("lastName") String lastName,
                             @RequestParam("email") String email,
                             @RequestParam("phoneNumber") String phoneNumber,
                             @RequestParam("source") String source){
        return customerService.addCustomer(new Customer(firstName,lastName,email,phoneNumber,source));
    }

    @RequestMapping(value = "/getallcustomers", method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/findbyfirstname/{firstName}", method = RequestMethod.GET)
    public List<Customer> findByFirstName(@PathVariable("firstName") String firstName){
        return customerService.findByFirstName(firstName);
    }

    @RequestMapping(value = "/findbylastname/{lastName}", method = RequestMethod.GET)
    public List<Customer> findByLastName(@PathVariable("lastName") String lastName){
        return customerService.findByLastName(lastName);
    }

    @RequestMapping(value = "/findbyemail/{email}", method = RequestMethod.GET)
    public Customer findByEmail(@PathVariable("email") String email){
        return customerService.findByEmail(email);
    }

}
