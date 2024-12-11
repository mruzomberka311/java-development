package models;

public class CustomerOrderHistory {
    private String productName;
    private double totalQuantity;

    public CustomerOrderHistory(String productName, double totalQuantity) {
        this.productName = productName;
        this.totalQuantity = totalQuantity;
    }


    public String getProductName() {
        return productName;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }
}
