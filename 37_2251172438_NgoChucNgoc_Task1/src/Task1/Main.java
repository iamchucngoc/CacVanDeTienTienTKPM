
package Task1;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180);
        Motorbike motorbike = new Motorbike("Honda", 150);

        car.getInfo();
        car.honk();

        motorbike.getInfo();
        motorbike.revEngine();
    }
}
