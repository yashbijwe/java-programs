package com.nit.Amezon10_12_2025;

import java.util.LinkedList;

public class Customer {
    private final String id;
    private final String name;
    private final LinkedList<Product> cart = new LinkedList<Product>();
    private final LinkedList<Product> recentlyViewed = new LinkedList<Product>();

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public LinkedList<Product> getCart() { return cart; }
    public LinkedList<Product> getRecentlyViewed() { return recentlyViewed; }
}
