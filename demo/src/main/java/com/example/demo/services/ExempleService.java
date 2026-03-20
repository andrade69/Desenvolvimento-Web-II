package com.example.demo.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Scope("prototype")
public class ExempleService {
    private final long id= System.nanoTime();

    public long getId(){
        return id;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("NASCI");
    }

    @PreDestroy
    public void PreDestroy(){
        System.out.println("MORRI");
    }
    
}