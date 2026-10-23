package com.nit.Amezon10_12_2025;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class RecommendationEngine {

    // Returns products sorted by rating descending (top first), duplicates removed by Product.equals()
    public List<Product> sortByRatingDesc(List<Product> products) {
        Comparator<Product> byRating = new Comparator<Product>() {
            public int compare(Product a, Product b) {
                int cmp = Double.compare(b.getRating(), a.getRating()); // desc
                if (cmp != 0) return cmp;
                return a.getId().compareTo(b.getId());
            }
        };
        TreeSet<Product> ts = new TreeSet<Product>(byRating);
        ts.addAll(products);
        return new ArrayList<Product>(ts);
    }

    // Returns products sorted by price ascending (low -> high)
    public List<Product> sortByPriceAsc(List<Product> products) {
        Comparator<Product> byPrice = new Comparator<Product>() {
            public int compare(Product a, Product b) {
                int cmp = Double.compare(a.getPrice(), b.getPrice()); // asc
                if (cmp != 0) return cmp;
                return a.getId().compareTo(b.getId());
            }
        };
        TreeSet<Product> ts = new TreeSet<Product>(byPrice);
        ts.addAll(products);
        return new ArrayList<Product>(ts);
    }
}
