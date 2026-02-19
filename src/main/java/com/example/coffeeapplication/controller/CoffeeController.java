package com.example.coffeeapplication.controller;

import com.example.coffeeapplication.model.CoffeeModel;
import com.example.coffeeapplication.service.CoffeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/coffee")
public class CoffeeController {

    private final CoffeeService service;

    public CoffeeController(CoffeeService coffeeService) {
        this.service = coffeeService;
    }

    @GetMapping("/menu")
    public String showMenu(Model model) {

        List<CoffeeModel> menu = service.getAllCoffeesFromMenu();
        model.addAttribute("showMenu", menu);
        return "menu";
    }

    @GetMapping("/order")
    public String makeOrder(Model model) {

        CoffeeModel coffee = new CoffeeModel();
        model.addAttribute("makeCoffee", coffee);
        return "menu";
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute CoffeeModel coffeeModel) {

        service.addNewCoffeeToMenu(coffeeModel);
        return "order-confirmation";
    }


}
