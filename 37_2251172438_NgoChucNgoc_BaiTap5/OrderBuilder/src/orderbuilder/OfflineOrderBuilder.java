
package orderbuilder;

public class OfflineOrderBuilder implements OrderBuilder {
    private OfflineOrder result;

    public OfflineOrderBuilder() {
        reset();
    }

    @Override
    public void reset() {
        result = new OfflineOrder();
    }

    @Override
    public void buildChooseProduct() {
        result.setProduct("Teddy Bear");
    }

    @Override
    public void buildCount() {
        result.setCount(1);
    }

    @Override
    public void buildTotal() {
        result.setTotal(500.0);
    }

    public OfflineOrder getResult() {
        return result;
    }
}

