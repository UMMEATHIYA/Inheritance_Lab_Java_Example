import org.example.*;

public class TestInheritance {
    public static void main(String[] args) {
        System.out.println("Welcome to the Vehicle Test Program (Q2)");

        Vehicle v1 = new Car("Toyota", 2020, 4);
        Vehicle v2 = new Motorcycle("Harley", 2021, false);
        Vehicle v3 = new Bicycle("Giant", 2015);

        v1.startEngine();
        v2.startEngine();
        v3.startEngine();

        // Only call honk if object implements Honkable
        if (v1 instanceof Honkable) ((Honkable) v1).honk();
        if (v2 instanceof Honkable) ((Honkable) v2).honk();
        if (v3 instanceof Bicycle) ((Bicycle) v3).ringBell();

        System.out.println("Program has ended. Goodbye!");
    }
}
