package com.leehaowei.customer;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("jpa")
public class CustomerJPADataAccessServer implements CustomerDao {

    private final CustomerRepository customerRepository;

    public CustomerJPADataAccessServer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {

        return customerRepository.findById(id);
    }
}
