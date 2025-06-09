
package task.pkg9;

public class CashPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán tiền mặt: " + amount + " VND");
    }
}
