
package task4;

public class FashionAJeanOrder extends JeanOrder {
    public FashionAJeanOrder() {
        this.totalAmount = 100.0;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }
}
