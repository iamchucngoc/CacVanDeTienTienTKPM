package task.pkg9;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean pay(float amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
        return true;
    }
}
