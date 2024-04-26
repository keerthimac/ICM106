package edu.icet.demo.controller;

import edu.icet.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping("/city-by-name/{postalCode}")
    Map<String, String> getCityByPostalCode(@PathVariable String postalCode){
        return cityService.getCityByName(postalCode);
    }
}
