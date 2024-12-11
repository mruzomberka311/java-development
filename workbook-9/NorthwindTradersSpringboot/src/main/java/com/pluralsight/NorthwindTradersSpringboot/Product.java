package com.pluralsight.NorthwindTradersSpringboot;

public class Product {
    private int productId;
    private String name;
    private String category;
    private double price;


    public Product(int productId, String name, double price, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
