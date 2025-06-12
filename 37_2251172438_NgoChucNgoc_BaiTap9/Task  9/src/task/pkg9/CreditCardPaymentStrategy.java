package task.pkg9;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean pay(float amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
        return true;
    }
}
