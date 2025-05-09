
package task2;


public class Order {
    private String orderId;
    private double totalAmount;
    
    public Order(String orderId, double totalAmount){
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }
 
    public String getOrderId(){
        return orderId;
    }
    
    public double getTotalAmount(){
        return totalAmount;
    }
    
    
}
