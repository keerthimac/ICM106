package edu.icet.demo.controller;

import edu.icet.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping("/city-by-name/{postalCode}")
    Map<String, String> getCityByPostalCode(@PathVariable String postalCode){
        //CityService cityService = new CityService();
        System.out.println(postalCode);
        int total = 0;
        int num1 = 10;
        int num2 = 20;
        total = num2*num1;
        total = num2+num1;
        total = num2/num1;

        return cityService.getCityByName(postalCode);
    }
}
