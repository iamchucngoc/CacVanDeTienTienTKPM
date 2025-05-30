
package bridgepattern;


public class Main {
    public static void main(String[] args) {
        Order onlineOrder = new OnlineOrder("HelloKitty", 150.0);
        Order offlineOrder = new OfflineOrder("TeddyBear", 200.0);

        PaymentMethod payment1 = new CreditCardPayment(onlineOrder);
        PaymentMethod payment2 = new CashPayment(offlineOrder);

        payment1.pay();
        payment2.pay(); 
    }
}
 