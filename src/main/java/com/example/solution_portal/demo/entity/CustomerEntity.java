package com.example.solution_portal.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "sampleIndex", type = "customer")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEntity implements Serializable {

    private static final long serialVersionUID = 4984593089335870828L;

    @Id
    private String id;

    private String firstname;

    private String lastname;

    private int age;
}
