
package task4;

public class FashionADressOrder extends DressOrder {
    public FashionADressOrder() {
        this.totalAmount = 80.0;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }
}

