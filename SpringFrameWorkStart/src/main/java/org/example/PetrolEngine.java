package org.example;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine{
    @Override
    public void runningOn() {
        System.out.println("Petrol Engine");
    }
}
