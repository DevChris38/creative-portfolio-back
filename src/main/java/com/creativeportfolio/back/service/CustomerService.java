package com.creativeportfolio.back.service;

import java.util.Optional;

import com.creativeportfolio.back.model.Customer;
import com.creativeportfolio.back.repository.CustomerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Customer> getCustomer(final Long id) {
        return customerRepository.findById(id);
    }

    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(final Long id) {
        customerRepository.deleteById(id);
    }

    public Customer saveCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer;
    }

    public Optional<Customer> updateCustomer(Long id, Customer updatedCustomer) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer existingCustomer = optionalCustomer.get();
            existingCustomer.setFirstName(updatedCustomer.getFirstName());
            existingCustomer.setLastName(updatedCustomer.getLastName());
            existingCustomer.setExpone(updatedCustomer.getExpone());
            existingCustomer.setExptwo(updatedCustomer.getExptwo());
            existingCustomer.setExpthree(updatedCustomer.getExpthree());
            return Optional.of(customerRepository.save(existingCustomer));
        } else {
            throw new IllegalArgumentException("Client not found with id: " + id);
        }
    }

}