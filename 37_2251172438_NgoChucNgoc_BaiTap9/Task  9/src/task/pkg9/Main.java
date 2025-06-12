
package task.pkg9;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Hello Kitty", 150.0f);
        order1.setPaymentStrategy(new CreditCardPaymentStrategy());
        order1.processOrderPayment();

        Order order2 = new Order("Teddy Bear", 200.0f);
        order2.setPaymentStrategy(new PayPalPaymentStrategy());
        order2.processOrderPayment();

        Order order3 = new Order("Whisky", 300.0f);
        order3.setPaymentStrategy(new BankTransferPaymentStrategy());
        order3.processOrderPayment();
    }
}

