package com.example.SpringBootExample.controller;

import com.example.SpringBootExample.model.Product;
import com.example.SpringBootExample.service.ProductServiceFromJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControllerJpa {

    @Autowired
    private ProductServiceFromJPA productServiceFromJPA;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProducts(){
        return productServiceFromJPA.getAllProducts();
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.PUT)
    public void addProduct(@RequestBody Product product){
        productServiceFromJPA.updateProduct(product);
    }

    @RequestMapping(value = "/getproduct/{pid}")
    public Product getProduct(@PathVariable int pid){
        return productServiceFromJPA.getProductById(pid);
    }

    @RequestMapping(value = "/deleteproduct")
    public void deleteProduct(@RequestParam int pid){
        productServiceFromJPA.deleteProduct(pid);
    }

}
