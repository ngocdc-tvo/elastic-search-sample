package com.example.solution_portal.demo.controller;

import com.example.solution_portal.demo.entity.CustomerEntity;
import com.example.solution_portal.demo.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save-customer")
    public int saveCustomer(@RequestBody List<CustomerEntity> customers) {
        customerService.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/find-all")
    public Iterable<CustomerEntity> findAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/find-by-first-name/{first-name}")
    public List<CustomerEntity> findByFirstName(@PathVariable String firstName) {
        return customerService.findByFirstname(firstName);
    }

}
