// Example of Multilevel Inheritance + super keyword in Java

// 🔹 Top-most parent class
class Object {
    Object() {
        System.out.println("Object constructor called");
    }
}

/*
 * Theory:
 * -> This is the root class.
 * -> Every class in Java implicitly extends Object class.
 * -> Here we wrote it explicitly just for learning purposes.
 */




// 🔹 Parent class extending Object
class Vehicle extends Object {
    String name;

    // Default constructor
    Vehicle() {
        super(); // calls Object() constructor
        System.out.println("Vehicle default constructor called");
    }

    // Parameterized constructor
    Vehicle(String name) {
        super(); // calls Object() constructor
        this.name = name; // assign value to instance variable
        System.out.println("Vehicle parameterized constructor called: " + name);
    }
}

/*
 * Theory:
 * -> Vehicle extends Object (multilevel inheritance starts here).
 * -> Inside both constructors, `super()` ensures Object constructor is called first.
 * -> If we don't write `super()`, compiler automatically inserts it as the 1st line.
 * -> Default constructor: only prints messages.
 * -> Parameterized constructor: assigns name and prints it.
 */




// 🔹 Child class extending Vehicle
class Car extends Vehicle {
    int hp; // horsepower of the car

    // Default constructor
    Car() {
        super(); // calls Vehicle()
        System.out.println("Car default constructor called");
    }

    // Parameterized constructor
    Car(String name, int hp) {
        super(name); // calls Vehicle(String name)
        this.hp = hp; // assign value to hp
        System.out.println("Car parameterized constructor called: " + hp + " HP");
    }
}

/*
 * Theory:
 * -> Car extends Vehicle (multilevel inheritance chain: Object → Vehicle → Car).
 * -> In both constructors, we call parent constructors using `super`.
 * -> Default constructor: calls Vehicle(), which calls Object().
 * -> Parameterized constructor: calls Vehicle(String), which calls Object().
 * -> Finally, Car constructor executes.
 */




// 🔹 Driver class (main program)
class Demo {
    public static void main(String[] args) {

        // Case 1: Calling default constructor chain
        Car c1 = new Car();

        // Case 2: Calling parameterized constructor chain
        Car c2 = new Car("Tata", 120);
    }
}

/*
 * Execution Flow:
 *
 * 👉 Case 1: Car c1 = new Car();
 *  1. Car() called
 *  2. super() -> Vehicle()
 *  3. super() -> Object()
 *
 *  Output:
 *  Object constructor called
 *  Vehicle default constructor called
 *  Car default constructor called
 *
 *
 * 👉 Case 2: Car c2 = new Car("Tata", 120);
 *  1. Car(String,int) called
 *  2. super(name) -> Vehicle(String)
 *  3. super() -> Object()
 *
 *  Output:
 *  Object constructor called
 *  Vehicle parameterized constructor called: Tata
 *  Car parameterized constructor called: 120 HP
 *
 *
 * ✨ Important Notes:
 * - Constructor chaining always goes upward (child → parent → grandparent).
 * - `super()` must be the FIRST statement in a constructor.
 * - If you don’t write it, compiler automatically inserts `super()`.
 * - `super` keyword can also be used to access parent methods/variables.
 */
