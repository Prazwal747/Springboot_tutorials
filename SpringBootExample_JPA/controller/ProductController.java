//package com.example.SpringBootExample.controller;
//
//import com.example.SpringBootExample.model.Product;
//import com.example.SpringBootExample.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
//
//    @RequestMapping(value = "/products", method = RequestMethod.GET)
//    public List<Product> getProducts(){
//        return productService.getAllProducts();
//    }
//
//    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
//    public void addProduct(@RequestBody Product product){
//        productService.addProduct(product);
//    }
//
//    @RequestMapping(value = "/getproduct/{pid}")
//    public Product getProduct(@PathVariable int pid){
//        return productService.getProductById(pid);
//    }
//
//    @RequestMapping(value = "/updateProduct/{pid}")
//    public Product upDateProduct(@PathVariable int pid, @RequestBody Product product){
//        productService.updateProduct(pid,product);
//        return product;
//    }
//
//    @RequestMapping(value = "/deleteproduct")
//    public void deleteProduct(@RequestParam int pid){
//        productService.deleteProduct(pid);
//    }
//
//
//}
