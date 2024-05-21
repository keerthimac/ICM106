package edu.icet.demo.service.impl;

import edu.icet.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    public Map<String, String> getProducts(){
        return Collections.singletonMap("01","dhal");

    }
}
