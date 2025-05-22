
package orderbuilder;

// Offline Order Product
public class OfflineOrder {
    public void setProduct(String product) {
        System.out.println("Offline Order - Product: " + product);
    }

    public void setCount(int count) {
        System.out.println("Offline Order - Count: " + count);
    }

    public void setTotal(double total) {
        System.out.println("Offline Order - Total: " + total);
    }
}