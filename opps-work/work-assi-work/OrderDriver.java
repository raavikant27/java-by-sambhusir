public class OrderDriver {
    public static void main(String[] args) {
        Order o1 = new Order();
        o1.orderId = "ORD123";
        o1.productName = "Laptop";
        o1.quantity = 2;

        o1.printDetails();
    }
}
