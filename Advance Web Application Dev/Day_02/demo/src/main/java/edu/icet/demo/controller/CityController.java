package edu.icet.demo.controller;

import edu.icet.demo.service.CityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CityController {

    @GetMapping("/get-city/{postalCode}")
    public HashMap<String,String> getCity(@PathVariable String postalCode){
        CityService service = new CityService();
        HashMap<String,String> response = new HashMap<>();
        response.put("city",service.getCityByPostalCode(postalCode));
        return response;

    }
}
