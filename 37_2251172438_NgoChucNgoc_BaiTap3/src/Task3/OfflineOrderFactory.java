
package Task3;


public class OfflineOrderFactory extends OrderFactory {
    @Override
    public Order createOrder(String orderId, double totalAmount) {
        return new OfflineOrder(orderId, totalAmount);
    }

    @Override
    public String getOrderType() {
        return "Offline";
    }
}
