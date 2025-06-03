
package task.pkg8;

class OrderDialog implements OrderMediator {
    private ProductSelector productSelector;
    private CountInput countInput;
    private TotalDisplay totalDisplay;
    private ConfirmButton confirmButton;

    public OrderDialog() {
        setupComponents();
    }

    public void setupComponents() {
        productSelector = new ProductSelector();
        countInput = new CountInput();
        totalDisplay = new TotalDisplay();
        confirmButton = new ConfirmButton();

        productSelector.setMediator(this);
        countInput.setMediator(this);
        totalDisplay.setMediator(this);
        confirmButton.setMediator(this);
    }

    @Override
    public void notify(OrderComponent sender, String event) {
        if (event.equals("productSelected") || event.equals("countChanged")) {
            String product = productSelector.getProduct();
            int count = countInput.getCount();
            if (product != null) {
                int total = calculateTotal(product, count);
                totalDisplay.showTotal(total);
            }
        } else if (event.equals("confirmClicked")) {
            System.out.println("Order confirmed: " + 
                productSelector.getProduct() + " x" + countInput.getCount());
        }
    }

    private int calculateTotal(String product, int count) {
        int price = product != null && product.equals("Teddy Bear") ? 10 : 20;
        return price * count;
    }

    // Getter methods for testing
    public ProductSelector getProductSelector() { return productSelector; }
    public CountInput getCountInput() { return countInput; }
    public TotalDisplay getTotalDisplay() { return totalDisplay; }
    public ConfirmButton getConfirmButton() { return confirmButton; }
}