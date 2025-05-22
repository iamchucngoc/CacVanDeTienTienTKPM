
package orderbuilder;

public class OnlineOrderBuilder implements OrderBuilder {
    private OnlineOrder result;

    public OnlineOrderBuilder() {
        reset();
    }

    @Override
    public void reset() {
        result = new OnlineOrder();
    }

    @Override
    public void buildChooseProduct() {
        result.setProduct("Hello Kitty");
    }

    @Override
    public void buildCount() {
        result.setCount(2);
    }

    @Override
    public void buildTotal() {
        result.setTotal(2000.0);
    }

    public OnlineOrder getResult() {
        return result;
    }
}

