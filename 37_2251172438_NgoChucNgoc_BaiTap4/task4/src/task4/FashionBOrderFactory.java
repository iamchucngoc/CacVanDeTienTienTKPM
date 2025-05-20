
package task4;

public class FashionBOrderFactory implements OrderFactory {
    @Override
    public JeanOrder createJeanOrder() {
        return new FashionBJeanOrder();
    }

    @Override
    public DressOrder createDressOrder() {
        return new FashionBDressOrder();
    }
}
