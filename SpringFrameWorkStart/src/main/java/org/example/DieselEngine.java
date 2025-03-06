package org.example;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {

    @Override
    public void runningOn() {
        System.out.println("running on diesel");
    }
}
