
package task.pkg9;

public class Main {
    public static void main(String[] args) {
        // Thanh toán bằng tiền mặt
        Order order1 = new Order(new CashPayment());
        order1.processPayment(50000);

        // Chuyển sang thanh toán bằng thẻ tín dụng
        order1.setPaymentStrategy(new CreditCardPayment());
        order1.processPayment(150000);
    }
}

