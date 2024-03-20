package org.example.Controller;

import org.example.Model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/customer")
    public Customer getCustomer(){
        return new Customer("Saman","Kandy");
    }
}
