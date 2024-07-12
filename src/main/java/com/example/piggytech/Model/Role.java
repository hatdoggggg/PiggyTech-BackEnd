package com.example.piggytech.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    Role(){}

    public  Role(String name){
        this.name = name;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    //getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}