public class MainApp {
    public static void main(String[] args) {
        User user = new User("John", "john@example.com");
        OrderProcessing orderProcessesor = new OrderProcessing();
        orderProcessesor.orderDetails(user, "Laptop", 3, 700);
    }
}