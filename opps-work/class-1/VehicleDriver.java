public class VehicleDriver {
    public static void main(String[] args) {
        // Create objects
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();

        // Assign values to v1
        v1.name = "Car";
        v1.price = 123456.7;
        v1.color = "White";

        // Assign values to v2
        v2.name = "Bike";
        v2.price = 23467;
        v2.color = "Red";

        // Print details
        v1.printDetails();
        v2.printDetails();
    }
}

