package Assignment;

public class Wallet {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public void depositAmount(double deposit) {
        balance += deposit;
    }

    public void debitAmount(double debit) {
        balance -= debit;
    }
}
