package edu.icet.demo.service;

import java.util.Map;

public interface CityService {
    public Map<String,String> getCityByName(String postalCode);
}
