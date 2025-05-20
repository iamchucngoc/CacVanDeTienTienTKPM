
package task4;

public class FashionAOrderFactory implements OrderFactory {
    @Override
    public JeanOrder createJeanOrder() {
        return new FashionAJeanOrder();
    }

    @Override
    public DressOrder createDressOrder() {
        return new FashionADressOrder();
    }
}

