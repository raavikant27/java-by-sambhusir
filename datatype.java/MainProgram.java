public class MainProgram {
    public static void main(String[] args) {

        // Object of Student
        Student s = new Student();
        System.out.println("Student Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);
        System.out.println("Course: " + s.course);

        // Object of Vehicle
        Vehicle v = new Vehicle();
        System.out.println("Vehicle Type: " + v.type);
        System.out.println("Brand: " + v.brand);

        // Object of Mobile
        Mobile m = new Mobile();
        System.out.println("Mobile Model: " + m.model);
        System.out.println("Price: " + m.price);

        // Object of Product
        Product p = new Product();
        System.out.println("Product Name: " + p.name);
        System.out.println("Category: " + p.category);

        // Object of Order
        Order o = new Order();
        System.out.println("Order ID: " + o.orderId);
        System.out.println("Product in Order: " + o.product);
    }
}

