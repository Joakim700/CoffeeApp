package com.example.coffeeapplication.service;

import com.example.coffeeapplication.model.CoffeeModel;
import com.example.coffeeapplication.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {

    private final CoffeeRepository repository;

    public CoffeeService(CoffeeRepository repository) {
        this.repository = repository;
    }

    public List<CoffeeModel> getAllCoffeesFromMenu() {
        return repository.getAllCoffees();
    }

    public CoffeeModel getCoffeeByName(String coffeeName) throws Exception {

        CoffeeModel coffeeByName = repository.getCoffeeByType(coffeeName);

        if (repository.getAllCoffees() != null && coffeeByName.getCoffeeName().equals(coffeeName)) {
            return coffeeByName;
        }
        throw new Exception("No such coffee exist");
    }

    public void addNewCoffeeToMenu(CoffeeModel coffeeModel) {

        repository.addNewCoffeeToMenu(coffeeModel);
    }

    public void deleteCoffeeFromMenu(CoffeeModel oldCoffee) {

        repository.deleteCoffeeFromMenu(oldCoffee);
    }

}


// CREATE; READ; UPDATE; DELETE;