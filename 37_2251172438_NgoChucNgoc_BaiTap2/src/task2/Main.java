
package task2;


public class Main {
    public static void main(String[] args) {
        Order order = new Order("TeedyBeer14", 1500000.0);
        
        // Xử lý đơn hàng
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order);
        
        // In thông tin đơn hàng
        OrderPrinter printer = new OrderPrinter();
        printer.printOrder(order);
    }
}
