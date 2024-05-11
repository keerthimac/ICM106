package org.example.controller;

import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FoodController {

    @Autowired
    ProductService service;

    @PostMapping("/create-product")
    Product createProduct(@RequestBody Product product){

       return service.createProduct(product);
    }
}
