package com.example.coffeeapplication.service;

import com.example.coffeeapplication.repository.jdbc.CoffeeRepository;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    private final CoffeeRepository repository;

    public CoffeeService(CoffeeRepository repository) {
        this.repository = repository;
    }


}


// CREATE; READ; UPDATE; DELETE;