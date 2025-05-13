
package Task3;

public class OnlineOrderFactory implements IOrderFactory {
    @Override
    public Order createOrder(String orderId, double totalAmount) {
        return new Order(orderId, totalAmount);
    }
}