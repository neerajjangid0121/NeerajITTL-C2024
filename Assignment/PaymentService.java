package Assignment;

public class PaymentService {
    private Wallet wallet;

    public PaymentService(Wallet wallet) {
        this.wallet = wallet;
    }

    private boolean canPay(double payment) {
        return wallet.getCurrentBalance() >= payment;
    }

    public boolean processPayment(double payment) {
        if (canPay(payment)) {
            wallet.debitAmount(payment);
            return true;
        }
        return false;
    }
}
