package com.looseCopling;

public class PetrolEngine implements Engine {
    @Override
    public void runsOn() {
        System.out.println("runs on Petrol");
    }
}
