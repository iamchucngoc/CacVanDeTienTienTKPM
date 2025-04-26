
package Task1;


public class Vehicle {
       protected String brand;
    protected int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void getInfo() {
        System.out.println("Brand: " + brand + ", Max Speed: " + maxSpeed + " km/h");
    } 
}
