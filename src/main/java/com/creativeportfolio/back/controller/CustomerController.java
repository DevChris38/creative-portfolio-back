package com.creativeportfolio.back.controller;

import com.creativeportfolio.back.model.Customer;
import com.creativeportfolio.back.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    /**
     * Read - Get one customer by id
     * @return - An object of Customer full filled
     */
    @GetMapping("/customer/{id}")
    public Optional<Customer> getCustomer(@PathVariable long id) {
        return customerService.getCustomer(id);
    }

    /**
     * Update - Update one customer by id
     * @return - An object of Customer updated
     */
    @PutMapping("/customer/{id}")
    public Optional<Customer> putCustomer(@PathVariable long id,  @RequestBody Customer updatedCustomer) {
        return customerService.updateCustomer(id, updatedCustomer);
    }

    /**
     * Read - Get all employees
     * @return - An Iterable object of Customer full filled
     */
    @GetMapping("/customers")
    public Iterable<Customer> getCustomers() {
        return customerService.getCustomers();
    }
    /**
     * Create - create all employees
     */
    @PostMapping("/customer")
    public Customer postCustomer(String firstName, String lastName, String expone, String exptwo, String expthree) {
        Customer customerToSave = new Customer(firstName, lastName, expone, exptwo, expthree);
        return customerService.saveCustomer(customerToSave);
    }
}