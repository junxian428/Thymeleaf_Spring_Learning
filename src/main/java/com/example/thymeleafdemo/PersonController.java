package com.example.thymeleafdemo;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model) {
        model.addAttribute("title", "E-Commerce Website");
        model.addAttribute("products", Arrays.asList(
            //    public Product(String name, String description, double price, String imageUrl) {
            new Product("Soap","Fragnance",10.0,""),
            new Product("Shampoo","Neutral PH Value",20.0,""),
            new Product("Toothpaste","Natural and Healthy",30.0,"")
        ));
        return "people";
    }
    
}
