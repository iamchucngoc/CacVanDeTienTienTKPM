
package Task3;


public abstract class OrderFactory {
    public abstract Order createOrder(String orderId, double totalAmount);
    
    public abstract String getOrderType();
}
