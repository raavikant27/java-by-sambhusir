// Parent class
class Fruit {
    void fruitFeatures() {
        System.out.println("Fruits are healthy");
    }
}

// Child class
class Mango extends Fruit {
    void mangoFeatures() {
        System.out.println("Mango is sweet");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Mango m = new Mango();
        m.fruitFeatures();   // inherited method
        m.mangoFeatures();   // child class method
    }
}
