package com.example.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by liveangel on 2016-10-17.
 */
@Entity
@Table(name = "customer")
public class Customer {
    // ==============
    // PRIVATE FIELDS
    // ==============
    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    // The user email
    @NotNull
    private String email;
    // The user name
    @NotNull
    private String name;
    @Column(nullable = false)
    private String address;
    // ==============
    // PUBLIC METHODS
    // ==============
    public Customer() { }
    public Customer(long id) {
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
    // Getter and setter methods
    // ...
} // class User