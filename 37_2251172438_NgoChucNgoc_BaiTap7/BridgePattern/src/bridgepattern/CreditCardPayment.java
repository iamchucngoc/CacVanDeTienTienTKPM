
package bridgepattern;

public class CreditCardPayment extends PaymentMethod {

    public CreditCardPayment(Order order) {
        super(order);
    }

    @Override
    public void pay() {
        System.out.println("Thanh toán đơn hàng [" + order.getOrderId() + "] bằng Thẻ tín dụng với số tiền: " + order.getTotalAmount());
    }
}
