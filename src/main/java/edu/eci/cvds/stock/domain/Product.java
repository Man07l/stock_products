package edu.eci.cvds.stock.domain;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;
    private String description;

    public Product(String name, int stockQuantity, double price, String description){
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
