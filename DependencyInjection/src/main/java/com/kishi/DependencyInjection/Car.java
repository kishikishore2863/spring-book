package com.kishi.DependencyInjection;

public class Car {
    private Engine engine;
    public Car(Engine engine){
        this.engine=engine;
    }
    public void startCar() {
        System.out.println(engine.start());  // Call engine's start method
        System.out.println("Car is running.");
    }
}
