
package Task3;


public class OnlineOrder implements Order {
    private String orderId;
    private double totalAmount;

    public OnlineOrder(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }
}
