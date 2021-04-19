package com.chlee.webapp.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String parentName;
    private String star;

    public Customer(String firstName, String lastName, String parentName, String star) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.parentName = parentName;
        this.star = star;
    }
}