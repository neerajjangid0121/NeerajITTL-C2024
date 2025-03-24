package Assignment;

public class Customer {
    private String firstName;
    private String lastName;
    private Wallet wallet;

    public Customer(String firstName, String lastName, Wallet wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.wallet = wallet;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWalletBalance() {
        return wallet.getCurrentBalance();
    }

    public Wallet getWallet() {
        return wallet;
    }
}