
package Task3;


public class Main {
    public static void main(String[] args) {
        // Sử dụng OnlineOrderFactory
        OrderFactory onlineFactory = new OnlineOrderFactory();
        System.out.println("Factory Order Type: " + onlineFactory.getOrderType());
        Order onlineOrder = onlineFactory.createOrder("TeddyBear14", 1000.0);
        System.out.println("Order ID: " + onlineOrder.getOrderId());
        System.out.println("Total Amount: " + onlineOrder.getTotalAmount());

        // Sử dụng OfflineOrderFactory
        OrderFactory offlineFactory = new OfflineOrderFactory();
        System.out.println("Factory Order Type: " + offlineFactory.getOrderType());
        Order offlineOrder = offlineFactory.createOrder("HelloKitty12", 1500.0);
        System.out.println("Order ID: " + offlineOrder.getOrderId());
        System.out.println("Total Amount: " + offlineOrder.getTotalAmount());
    }
}
