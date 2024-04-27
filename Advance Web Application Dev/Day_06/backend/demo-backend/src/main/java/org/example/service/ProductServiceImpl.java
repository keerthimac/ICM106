package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ProductRepository;
import org.example.entity.ProductEntity;
import org.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ObjectMapper mapper;

    @Autowired
    ProductRepository repository;

    @Override
    public Product createProduct(Product product) {
        ProductEntity productEntity = mapper.convertValue(product, ProductEntity.class);
        ProductEntity save = repository.save(productEntity);
        return mapper.convertValue(save,Product.class);
    }
}
