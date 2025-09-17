// Assignment 2: Product Hierarchy (Multilevel Inheritance)

/*
 * 📌 Theory:
 * - Parent class: Product
 * - Child class: ElectronicItem extends Product
 * - Grandchild class: Laptop extends ElectronicItem
 * - We use constructors + super() for chaining.
 */

class Product {
    String brand;
    double price;

    Product() {
        System.out.println("Product: default constructor");
    }

    Product(String brand, double price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Product: parameterized constructor (brand=" + brand + ", price=" + price + ")");
    }

    void showProduct() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class ElectronicItem extends Product {
    String type; // example: "Laptop", "Mobile"

    ElectronicItem() {
        super();
        System.out.println("ElectronicItem: default constructor");
    }

    ElectronicItem(String brand, double price, String type) {
        super(brand, price);
        this.type = type;
        System.out.println("ElectronicItem: parameterized constructor (type=" + type + ")");
    }

    void showElectronicItem() {
        showProduct();
        System.out.println("Type: " + type);
    }
}

class Laptop extends ElectronicItem {
    int ram;
    int storage;
    String processor;

    Laptop() {
        super();
        System.out.println("Laptop: default constructor");
    }

    Laptop(String brand, double price, String type, int ram, int storage, String processor) {
        super(brand, price, type);
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        System.out.println("Laptop: parameterized constructor (RAM=" + ram + "GB, Storage=" + storage + "GB, Processor=" + processor + ")");
    }

    void showLaptop() {
        System.out.println("---- Laptop Details ----");
        showElectronicItem();
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Processor: " + processor);
        System.out.println("------------------------");
    }
}

public class ProductExample {
    public static void main(String[] args) {

        System.out.println("Case 1: Default Constructor Flow");
        Laptop l1 = new Laptop();
        l1.showLaptop();

        System.out.println();

        System.out.println("Case 2: Parameterized Constructor Flow");
        Laptop l2 = new Laptop("Dell", 65000, "Laptop", 16, 512, "Intel i7");
        l2.showLaptop();
    }
}

/*
 * 📌 Execution Flow:
 *
 * 👉 Case 1: Laptop()
 *   - Laptop() → super() → ElectronicItem() → super() → Product()
 *   Output:
 *     Product: default constructor
 *     ElectronicItem: default constructor
 *     Laptop: default constructor
 *     Brand: null, Price: 0.0, Type: null, RAM: 0, Storage: 0, Processor: null
 *
 * 👉 Case 2: Laptop("Dell",65000,"Laptop",16,512,"Intel i7")
 *   - Laptop(...) → super(brand,price,type) → ElectronicItem(...) → super(brand,price) → Product(...)
 *   Output:
 *     Product: parameterized constructor (brand=Dell, price=65000.0)
 *     ElectronicItem: parameterized constructor (type=Laptop)
 *     Laptop: parameterized constructor (RAM=16GB, Storage=512GB, Processor=Intel i7)
 *     Brand: Dell
 *     Price: 65000.0
 *     Type: Laptop
 *     RAM: 16 GB
 *     Storage: 512 GB
 *     Processor: Intel i7
 */
