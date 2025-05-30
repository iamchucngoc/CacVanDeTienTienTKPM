
package bridgepattern;

public class OfflineOrder implements Order {
    private String orderId;
    private double amount;

    public OfflineOrder(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    @Override
    public double getTotalAmount() {
        return amount;
    }
}

