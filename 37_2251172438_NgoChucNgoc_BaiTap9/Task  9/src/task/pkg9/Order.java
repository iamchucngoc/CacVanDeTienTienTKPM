
package task.pkg9;

public class Order {
    private PaymentStrategy paymentStrategy;
    private float totalAmount;
    private String orderId;
    private String status;

    public Order(String orderId, float totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.status = "PENDING";
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processOrderPayment() {
        if (paymentStrategy != null) {
            boolean success = paymentStrategy.pay(totalAmount);
            status = success ? "PAID" : "FAILED";
            System.out.println("Order ID: " + orderId + " | Status: " + status);
        } else {
            throw new IllegalStateException("No payment strategy set.");
        }
    }

    public String getStatus() {
        return status;
    }
}
