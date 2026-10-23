package com.nit.Amezon10_12_2025;

import java.util.LinkedList;
import java.util.Date;

public class Order {
    private final String orderId;
    private final LinkedList<Product> products;
    private final double totalAmount;
    private final Date timestamp;

    public Order(String orderId, LinkedList<Product> products, double totalAmount) {
        this.orderId = orderId;
        this.products = new LinkedList<Product>(products);
        this.totalAmount = totalAmount;
        this.timestamp = new Date(); // uses Date (no LocalDateTime)
    }

    public String getOrderId() { return orderId; }
    public LinkedList<Product> getProducts() { return products; }
    public double getTotalAmount() { return totalAmount; }
    public Date getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderID: ").append(orderId)
          .append(" | Time: ").append(timestamp.toString())
          .append(" | Total: ₹").append(String.format("%.2f", totalAmount)).append("\n");
        sb.append(" Items:\n");
        for (Product p : products) sb.append("  - ").append(p.toString()).append("\n");
        return sb.toString();
    }
}
