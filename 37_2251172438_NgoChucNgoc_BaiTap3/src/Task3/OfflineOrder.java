
package Task3;


public class OfflineOrder implements Order {
    private String orderId;
    private double totalAmount;

    public OfflineOrder(String orderId, double totalAmount) {
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
