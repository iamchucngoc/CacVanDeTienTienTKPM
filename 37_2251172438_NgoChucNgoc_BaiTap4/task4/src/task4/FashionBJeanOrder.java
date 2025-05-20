
package task4;

public class FashionBJeanOrder extends JeanOrder {
    public FashionBJeanOrder() {
        this.totalAmount = 120.0;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }
}

