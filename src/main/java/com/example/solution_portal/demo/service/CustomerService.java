package com.example.solution_portal.demo.service;

import com.example.solution_portal.demo.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    Integer saveAll(List<CustomerEntity> customers);

    Iterable<CustomerEntity> findAll();

    List<CustomerEntity> findByFirstname(String firstName);
}
