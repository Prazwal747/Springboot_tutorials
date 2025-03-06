package beanProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    Tyre tyre;

    public  void display(){
        System.out.println("this car uses "+ tyre.getBrand());
    }

}
