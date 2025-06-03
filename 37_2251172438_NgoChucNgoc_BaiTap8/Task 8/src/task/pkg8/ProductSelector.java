
package task.pkg8;

class ProductSelector extends OrderComponent {
    private String selectedProduct;

    public void selectProduct(String product) {
        this.selectedProduct = product;
        changed("productSelected");
    }

    public String getProduct() {
        return selectedProduct;
    }
}