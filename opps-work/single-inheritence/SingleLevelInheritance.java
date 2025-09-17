// ===============================
// SINGLE LEVEL INHERITANCE
// ===============================
//
// 👉 Definition:
// When there is ONE parent class and ONE child class, 
// it is called Single Level Inheritance.
//
// 👉 Key Points:
// 1. Relationship between parent and child is created 
//    using constructor calls through `super()` statement.
// 2. `super()` can be implicit or explicit.
//    - Implicit super(): If not written, compiler automatically 
//      adds `super()` in the first line of child constructor.
//    - Explicit super(): If we write `super()` manually.
// 3. Implicit super() always calls the no-argument constructor 
//    of parent class.
// 4. Explicit super() can call any constructor of parent class.
// 5. Object class is the super-most parent of every class in Java.
//

class Vehicle {
    int p = 100;
    int a = 18;
    int b = 30;

    // Parent class constructor
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {
    int x = 20;
    int y = 40;

    // Child class constructor
    Car() {
        super(); // Explicit super() (calls Vehicle constructor)
        System.out.println("Car constructor");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Car c1 = new Car(); // Creating object of child class

        // Accessing parent class variable using child object
        System.out.println("Parent variable p = " + c1.p);
    }
}

/*
EXPECTED OUTPUT:
Vehicle constructor
Car constructor
Parent variable p = 100
*/
