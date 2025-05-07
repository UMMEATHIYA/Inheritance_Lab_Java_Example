package org.example;

public class Bicycle extends Vehicle {
    public Bicycle(String make, int year) {
        super(make, year);
    }

    @Override
    public void startEngine() {
        // Old bike — no engine!
        System.out.println("Bicycle has no engine to start.");
    }

    // Forced to inherit honk() even though it should only ring a bell
    public void ringBell() {
        System.out.println("Bicycle rings: Ring ring!");
    }
}
