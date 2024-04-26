package org.example.controller;

import org.example.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @PostMapping("/create-product")
    void createProduct(Product product){
        System.out.println(product);
    }
}
