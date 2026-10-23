package com.nit.Amezon10_12_2025;

import java.io.Serializable;

public class Product implements Serializable {
    private final String id;
    private final String name;
    private final String category;
    private final double price;
    private final double rating;

    public Product(String id, String name, String category, double price, double rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + category + " | ₹" + String.format("%.2f", price) + " | ★ " + String.format("%.1f", rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        return id.equals(p.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
