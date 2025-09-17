// Assignment 1: Vehicle Hierarchy using super keyword

/*
 * 📌 Theory:
 * - Parent class: Vehicle
 * - Child class: Car
 * - We use constructors + super() to show constructor chaining.
 * - Execution flow: Child → Parent → Grandparent
 */

class Vehicle {
    String brand;

    // Default constructor
    Vehicle() {
        System.out.println("Vehicle: default constructor");
    }

    // Parameterized constructor
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle: parameterized constructor (brand=" + brand + ")");
    }

    void showVehicle() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    int speed;

    // Default constructor
    Car() {
        super(); // calls Vehicle()
        System.out.println("Car: default constructor");
    }

    // Parameterized constructor
    Car(String brand, int speed) {
        super(brand); // calls Vehicle(String)
        this.speed = speed;
        System.out.println("Car: parameterized constructor (speed=" + speed + " km/h)");
    }

    void showCar() {
        System.out.println("---- Car Details ----");
        showVehicle(); // parent method
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("----------------------");
    }
}

public class VehicleExample {
    public static void main(String[] args) {

        System.out.println("Case 1: Default Constructor Flow");
        Car c1 = new Car();
        c1.showCar();

        System.out.println();

        System.out.println("Case 2: Parameterized Constructor Flow");
        Car c2 = new Car("Tata", 120);
        c2.showCar();
    }
}

/*
 * 📌 Execution Flow:
 *
 * 👉 Case 1: Car()
 *   - Car() → super() → Vehicle()
 *   Output:
 *     Vehicle: default constructor
 *     Car: default constructor
 *     Brand: null
 *     Speed: 0
 *
 * 👉 Case 2: Car("Tata", 120)
 *   - Car(String,int) → super("Tata") → Vehicle(String)
 *   Output:
 *     Vehicle: parameterized constructor (brand=Tata)
 *     Car: parameterized constructor (speed=120 km/h)
 *     Brand: Tata
 *     Speed: 120
 */
