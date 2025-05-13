
package Task3;

public class Main {
    public static void main(String[] args) {
        IOrderFactory factory = new OnlineOrderFactory(); 
        Order order = factory.createOrder("TeddyBear14", 455000.0);

        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order);

        OrderPrinter printer = new OrderPrinter();
        printer.printOrder(order);
    }
}
