
package Task3;


public class OnlineOrderFactory extends OrderFactory {
    @Override
    public Order createOrder(String orderId, double totalAmount) {
        return new OnlineOrder(orderId, totalAmount);
    }

    @Override
    public String getOrderType() {
        return "Online";
    }
}
