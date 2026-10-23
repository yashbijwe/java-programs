package com.nit.Amezon10_12_2025;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private final ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public boolean removeById(String id) {
        return products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> searchByName(String keyword) {
        ArrayList<Product> res = new ArrayList<Product>();
        String k = keyword.toLowerCase();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(k)) res.add(p);
        }
        return res;
    }

    public List<Product> searchByCategory(String category) {
        ArrayList<Product> res = new ArrayList<Product>();
        String c = category.toLowerCase();
        for (Product p : products) {
            if (p.getCategory().toLowerCase().equals(c)) res.add(p);
        }
        return res;
    }

    public List<Product> listAll() {
        return new ArrayList<Product>(products); // return copy
    }

    public Product findById(String id) {
        for (Product p : products) if (p.getId().equals(id)) return p;
        return null;
    }
}
