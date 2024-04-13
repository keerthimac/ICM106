package edu.icet.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
@Primary
public class CityServiceImpl2024 implements CityService {

    public Map<String,String> getCityByName(String postalCode){
        HashMap<String,String> cities= new HashMap<>();
        cities.put("10400","Moratuwa");
        cities.put("10500","Mount Lavinia");
        cities.put("10600","Dehiwala");

        String cityName = cities.get(postalCode);

        if(StringUtils.hasText(cityName)){
            return Collections.singletonMap("data",cityName);
        }
        return Collections.singletonMap("data","No City Avalable");

    }
}
