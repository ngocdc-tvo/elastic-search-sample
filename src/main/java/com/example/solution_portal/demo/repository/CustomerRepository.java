package com.example.solution_portal.demo.repository;

import com.example.solution_portal.demo.entity.CustomerEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<CustomerEntity, String> {
    List<CustomerEntity> findByFirstname(String firstName);
}
