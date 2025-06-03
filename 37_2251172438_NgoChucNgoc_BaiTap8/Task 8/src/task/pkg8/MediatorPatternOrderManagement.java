
package task.pkg8;

public class MediatorPatternOrderManagement {
    public static void main(String[] args) {
        OrderDialog dialog = new OrderDialog();

        // Simulate user actions
        dialog.getProductSelector().selectProduct("Teddy Bear");
        dialog.getCountInput().setCount(3);
        dialog.getConfirmButton().click();
    }
}