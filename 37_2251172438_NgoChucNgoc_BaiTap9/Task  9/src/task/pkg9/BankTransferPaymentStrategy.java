package task.pkg9;

public class BankTransferPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean pay(float amount) {
        System.out.println("Paid $" + amount + " using Bank Transfer.");
        return true;
    }
}
