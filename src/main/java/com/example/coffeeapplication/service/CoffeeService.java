package com.example.coffeeapplication.service;

import com.example.coffeeapplication.model.CoffeeModel;
import com.example.coffeeapplication.repository.CoffeeRepository;

import java.util.List;

public class CoffeeService {

    private CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<CoffeeModel> getAllCoffeesFromMenu() {

        return coffeeRepository.getAllCoffees();
    }

    public CoffeeModel getCoffeeByName(String coffeeName) throws Exception {

        CoffeeModel coffeeByName = coffeeRepository.getCoffeeByType(coffeeName);

        if (coffeeRepository.getAllCoffees() != null && coffeeByName.getCoffeeName().equals(coffeeName)) {
            return coffeeByName;
        }
        throw new Exception("No such coffee exist");
    }

    public CoffeeModel addNewCoffeeToMenu(CoffeeModel newCoffee) {

        return coffeeRepository.addNewCoffeeToMenu(newCoffee);
    }

    public void deleteCoffeeFromMenu(CoffeeModel oldCoffee) {

        coffeeRepository.deleteCoffeeFromMenu(oldCoffee);
    }

}
