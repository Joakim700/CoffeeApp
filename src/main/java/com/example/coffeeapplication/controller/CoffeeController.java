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
@RequestMapping("/Lorista")
public class CoffeeController {

    private final CoffeeService service;

    public CoffeeController(CoffeeService coffeeService) {
        this.service = coffeeService;
    }

    @GetMapping("/homepage")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/menu")
    public String showMenu(Model model) {
        List<CoffeeModel> menu = service.getAllCoffeesFromMenu();
        model.addAttribute("showMenu", menu);
        return "menu";
    }

    @GetMapping("/add")
    public String addCoffeeToMenu(Model model) {
        CoffeeModel coffeeModel = new CoffeeModel();
        service.addNewCoffeeToMenu(coffeeModel);
        model.addAttribute("newCoffee", coffeeModel);
        return "add-new-coffee";
    }

    @PostMapping("/add-new-coffee")
    public String addNewCoffeeToMenu(@ModelAttribute CoffeeModel coffeeModel) {
        service.addNewCoffeeToMenu(coffeeModel);
        return "redirect:/Lorista/menu";
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


    @PostMapping("/delete")
    public String deleteOrder(@ModelAttribute CoffeeModel coffeeModel) {

        service.deleteCoffeeFromMenu(coffeeModel);
        return "delete-coffee";
    }

}
