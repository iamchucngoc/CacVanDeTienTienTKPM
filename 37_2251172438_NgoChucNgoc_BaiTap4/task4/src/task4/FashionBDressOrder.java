
package task4;

public class FashionBDressOrder extends DressOrder {
    public FashionBDressOrder() {
        this.totalAmount = 95.0;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }
}

