package com.nit.Amezon10_12_2025;

import java.util.Vector;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.List;

public class OrderManager {
    private final Vector<Order> orders = new Vector<Order>();
    private final HashSet<String> uniqueCustomers = new HashSet<String>();
    private int orderCounter = 1;

    public String nextOrderId() {
        return "O" + (orderCounter++);
    }

    public synchronized void placeOrder(String customerId, LinkedList<Product> cart) {
        if (cart == null || cart.isEmpty()) return;
        double total = 0.0;
        for (Product p : cart) total += p.getPrice();
        Order o = new Order(nextOrderId(), cart, total);
        orders.add(o);              // stored in Vector (thread-safe)
        uniqueCustomers.add(customerId); // HashSet ensures uniqueness
    }

    public List<Order> getAllOrders() {
        return new Vector<Order>(orders); // return copy
    }

    public HashSet<String> getUniqueCustomers() {
        return new HashSet<String>(uniqueCustomers); // copy
    }
}
