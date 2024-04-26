package edu.icet.post.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;


public class cityController {
    Map<String,String> getCityByName(String postalCode){
        System.out.println(postalCode);
    }
}
