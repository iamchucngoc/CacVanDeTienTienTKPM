
package Task1;

// Lớp Car kế thừa Vehicle
public class Car extends Vehicle {
    public Car(String brand, int maxSpeed) {
        super(brand, maxSpeed);
    }

    public void honk() {
        System.out.println(brand + " is honking: Beep Beep!");
    }
}
