package com.example.solution_portal.demo.service.impl;

import com.example.solution_portal.demo.entity.CustomerEntity;
import com.example.solution_portal.demo.repository.CustomerRepository;
import com.example.solution_portal.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Integer saveAll(List<CustomerEntity> customers) {
        repository.saveAll(customers);
        return customers.size();
    }

    @Override
    public Iterable<CustomerEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<CustomerEntity> findByFirstname(String firstName) {
        return repository.findByFirstname(firstName);
    }
}
