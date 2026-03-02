package com.example.coffeeapplication.repository;

import com.example.coffeeapplication.model.CoffeeModel;
import com.example.coffeeapplication.service.CoffeeService;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CoffeeRepository {

    List<CoffeeModel> coffees = new ArrayList<>();

    public CoffeeRepository() {
        dataBase();
    }

    public void dataBase() {
        coffees.add(new CoffeeModel("Americano", "NONE", 10.99));
        coffees.add(new CoffeeModel("Cappuccino", "WHOLE MILK", 12.50));
        coffees.add(new CoffeeModel("Latte", "OAT MILK", 13.25));
        coffees.add(new CoffeeModel("Espresso", "NONE", 8.50));
        coffees.add(new CoffeeModel("Mocha", "WHIPPED CREAM", 14.00));
        coffees.add(new CoffeeModel("Flat White", "STEAMED MILK", 12.00));
        coffees.add(new CoffeeModel("Macchiato", "FOAM", 11.50));
        coffees.add(new CoffeeModel("Cold Brew", "ICE", 11.99));
        coffees.add(new CoffeeModel("Affogato", "VANILLA GELATO", 15.00));
        coffees.add(new CoffeeModel("Cortado", "WARM MILK", 10.50));
    }

    public List<CoffeeModel> getAllCoffees() {
        return new ArrayList<>(coffees);
    }

    public CoffeeModel getCoffeeByType(String name) throws Exception {

        for (CoffeeModel coffee : coffees) {

            if (name.equals(coffee.getCoffeeName())) {
                return coffee;
            }
        } throw new Exception("No coffee exist by that name");
    }

    public CoffeeModel addNewCoffeeToMenu(CoffeeModel newCoffee) {

        coffees.add(newCoffee);
        return newCoffee;
    }

    public void deleteCoffeeFromMenu(CoffeeModel coffee) {

        coffees.remove(coffee);
    }

//    public CoffeeModel updateCoffeePrice(CoffeeModel model, Double updatePrice, Double oldPrice) {
//
//        for (CoffeeModel coffee : coffees) {
//
//            if ()
//        }
//
//    }



}
