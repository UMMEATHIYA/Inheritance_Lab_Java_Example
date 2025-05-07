package org.example;

public abstract class Vehicle {
    protected String make;
    protected int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public abstract void startEngine();

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

