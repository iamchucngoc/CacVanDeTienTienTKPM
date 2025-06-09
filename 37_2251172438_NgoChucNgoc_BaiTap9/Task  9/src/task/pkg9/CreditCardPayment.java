
package task.pkg9;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng: " + amount + " VND");
    }
}

