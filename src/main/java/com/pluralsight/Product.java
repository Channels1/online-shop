package com.pluralsight;

public class Product {
    private String productId;
    private String productName;
    private double productPrice;
    private String productDepo;

    public Product(String productId, String productName, double productPrice, String productDepo) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDepo = productDepo;
    }


    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductDepo() {
        return productDepo;
    }
}
