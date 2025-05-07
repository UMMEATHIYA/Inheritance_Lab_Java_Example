package org.example;

public class Motorcycle extends Vehicle implements Honkable {
    private boolean hasSidecar;

    public Motorcycle(String make, int year, boolean hasSidecar) {
        super(make, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void honk() {
        System.out.println("Motorcycle honks: Honk honk!");
    }
}

