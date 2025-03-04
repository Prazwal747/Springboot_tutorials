package com.example.SpringBootExample.service;

import com.example.SpringBootExample.Repository.ProductRepo;
import com.example.SpringBootExample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceFromJPA {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Product getProductById(int id){
        return productRepo.findById(id).orElse(new Product());
    }

    public void updateProduct(Product product){
        productRepo.save(product);
    }

    public void deleteProduct(int id){
        productRepo.deleteById(id);
    }

}
