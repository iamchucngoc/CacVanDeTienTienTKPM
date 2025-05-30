
package bridgepattern;

public abstract class PaymentMethod {
    protected Order order;

    public PaymentMethod(Order order) {
        this.order = order;
    }

    public abstract void pay();
}

