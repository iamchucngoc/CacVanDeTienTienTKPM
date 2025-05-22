
package orderbuilder;

public class Director {
    private OrderBuilder builder;

    public Director(OrderBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(OrderBuilder builder) {
        this.builder = builder;
    }

    public void makeOnlineOrder() {
        builder.reset();
        builder.buildChooseProduct();
        builder.buildCount();
        builder.buildTotal();
    }
}
