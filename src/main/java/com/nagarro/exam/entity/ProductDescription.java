package com.nagarro.exam.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productDescription")
class ProductDescription {
    private String length;
    private String sleevesLength;
    private String color;
    private String category;
    private String brand;
    private int quantity;

    // Constructors, Getters, and Setters
    
    
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getSleevesLength() {
        return sleevesLength;
    }

    public void setSleevesLength(String sleevesLength) {
        this.sleevesLength = sleevesLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}