public class Order {
    String orderId;
    String productName;
    int quantity;

    public void printDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
    }
}

