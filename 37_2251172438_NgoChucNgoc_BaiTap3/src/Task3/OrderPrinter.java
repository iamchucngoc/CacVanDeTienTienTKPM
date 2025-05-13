
package Task3;

public class OrderPrinter {
    public void printOrder(Order order) {
        System.out.println("Đơn hàng [" + order.getOrderId() + "] có tổng tiền: " + order.getTotalAmount());
    }
}
