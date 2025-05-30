
package bridgepattern;

public class CashPayment extends PaymentMethod {

    public CashPayment(Order order) {
        super(order);
    }

    @Override
    public void pay() {
        System.out.println("Thanh toán đơn hàng [" + order.getOrderId() + "] bằng Tiền mặt với số tiền: " + order.getTotalAmount());
    }
}

