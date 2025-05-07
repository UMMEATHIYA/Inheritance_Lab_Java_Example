package org.example;

public class Car extends Vehicle implements Honkable {
    private int numDoors;

    public Car(String make, int year, int numDoors) {
        super(make, year);
        this.numDoors = numDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void honk() {
        System.out.println("Car honks: Beep beep!");
    }
}
