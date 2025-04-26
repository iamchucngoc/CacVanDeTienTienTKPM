
package Task1;


// Lớp Motorbike kế thừa Vehicle
public class Motorbike extends Vehicle {
    public Motorbike(String brand, int maxSpeed) {
        super(brand, maxSpeed);
    }

    public void revEngine() {
        System.out.println(brand + " is revving engine: Vroom Vroom!");
    }
}