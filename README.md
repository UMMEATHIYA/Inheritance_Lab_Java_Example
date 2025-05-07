# SOEN 350 – OOP Development Lab 8 (Spring 2025)

## 📚 Overview

This lab explores **object-oriented programming principles**, focusing on **inheritance**, **constructor chaining**, **interface segregation**, and theoretical concepts such as the **diamond problem** and constructor behavior in abstract classes. All implementations are done in Java using Maven structure.

---

## 🧪 Contents

### ✅ Question 1 – Basic Inheritance and Polymorphism
- A base `Vehicle` class with `make` and `year`.
- Subclasses:
  - `Car` (adds `numDoors`)
  - `Motorcycle` (adds `hasSidecar`)
- Demonstrates **constructor overloading** and **runtime polymorphism**.

### ✅ Question 2 – Fragile Base Class & Interface Segregation
- Problem with adding `honk()` to `Vehicle` (not all vehicles can honk).
- Solved by:
  - Creating `IVehicle` interface for basic vehicle operations.
  - Creating `IHonkable` interface for honkable vehicles.
  - `Bicycle` uses `ringBell()` instead of `honk()`.

### ✅ Question 3 – Theory
- **Diamond Problem**: Occurs in multiple inheritance; Java avoids it via interfaces.
- **No parameterless constructor**: Java requires a call to a superclass constructor if it has no default.
- **Abstract class constructors**: Used to initialize shared fields for subclasses, even though abstract classes can’t be instantiated directly.

---

## 🛠️ How to Run

1. Ensure Java 1.8+ and Maven are installed.
2. Clone/download the project.
3. Navigate to the project folder.
4. Compile and run the test file:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="org.example.TestInheritance"
