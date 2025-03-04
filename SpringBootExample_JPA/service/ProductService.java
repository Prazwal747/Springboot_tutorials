package com.example.SpringBootExample.service;

import com.example.SpringBootExample.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {

    List<Product> list = new ArrayList<>(Arrays.asList(
            new Product(1,"car",5400),
            new Product(2,"bike",1244),
            new Product(3,"truck",6565)));

    public List<Product> getAllProducts(){
        return list;
    }

    public Product getProductById(int pid){
        return list.stream().filter(x -> x.getPid()==pid).findFirst().
                orElse(new Product(0,"null",0));
    }

    public void addProduct(Product product){
        list.add(product);
    }

    public Product updateProduct(int pid,Product product){
        int index = 0;
        for (Product prod : list){
            if (prod.getPid() == pid){
                list.set(index,product);
            }
            index++;
        }
        return product;
    }

    public void deleteProduct(int pid){
        int index=0;
        Iterator<Product> itp = list.iterator();
            while (itp.hasNext()){
                Product product = itp.next();
                if (product.getPid()==pid){
                    itp.remove();
                }
                index++;

            }
    }

}
