package Assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first & last Name of customer");
        String firstName = sc.next();
        String lastName = sc.next();

        Wallet customerWallet = new Wallet(5000.0);
        Customer customer = new Customer(firstName, lastName, customerWallet);

        System.out.println("Welcome, " + customer.getFirstName() + " " + customer.getLastName() + ".");
        System.out.println("Your current wallet balance is: " + customer.getWalletBalance());

        PaymentService paymentService = new PaymentService(customer.getWallet());

        System.out.print("Enter payment amount: ");
        double payment = sc.nextDouble();

        if (paymentService.processPayment(payment)) {
            System.out.println("Payment of " + payment + " completed successfully.");
            System.out.println("Updated wallet balance is: " + customer.getWalletBalance());
        } else {
            System.out.println("Insufficient funds. Please try again later.");
        }
        
    }
}
