package com.looseCopling;

public class CouplingMain {
    public static void main(String[] args) {
        Car car1 = new Car();
//        PetrolEngine petrolEngine = new PetrolEngine();
//        DieselEngine dieselEngine = new DieselEngine();
        car1.EngineUsed(new DieselEngine());
    }
}
