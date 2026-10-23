package com.nit.Amezon10_12_2025;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class AmazonMiniSystem {

    private final Catalog catalog = new Catalog();
    private final OrderManager orderManager = new OrderManager();
    private final RecommendationEngine recommender = new RecommendationEngine();
    private final Map<String, Customer> sessionCustomers = new HashMap<String, Customer>();

    private final Scanner sc = new Scanner(System.in);
    private int productCounterSeed = 1;

    // Create simple product IDs starting with P...
    private String nextProductId() {
        return "P" + (productCounterSeed++);
    }

    private void seedProducts() {
        catalog.addProduct(new Product(nextProductId(), "Wireless Mouse", "Electronics", 499.0, 4.2));
        catalog.addProduct(new Product(nextProductId(), "Mechanical Keyboard", "Electronics", 2399.0, 4.6));
        catalog.addProduct(new Product(nextProductId(), "Water Bottle 1L", "Home", 199.0, 4.0));
        catalog.addProduct(new Product(nextProductId(), "Running Shoes", "Footwear", 1999.0, 4.3));
        catalog.addProduct(new Product(nextProductId(), "Noise Cancelling Headphones", "Electronics", 8999.0, 4.7));
    }

    private void addProductMenu() {
        System.out.print("Enter product name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter category: ");
        String cat = sc.nextLine().trim();
        System.out.print("Enter price: ");
        double price = Double.parseDouble(sc.nextLine().trim());
        System.out.print("Enter rating (0.0 - 5.0): ");
        double rating = Double.parseDouble(sc.nextLine().trim());

        Product p = new Product(nextProductId(), name, cat, price, rating);
        catalog.addProduct(p);
        System.out.println("Added: " + p);
    }

    private void removeProductMenu() {
        System.out.print("Enter product id to remove: ");
        String id = sc.nextLine().trim();
        boolean removed = catalog.removeById(id);
        System.out.println(removed ? "Removed." : "Product not found.");
    }

    private void viewProductsMenu() {
        List<Product> all = catalog.listAll();
        if (all.isEmpty()) {
            System.out.println("Catalog is empty.");
            return;
        }
        System.out.println("----- Product Catalog -----");
        for (Product p : all) System.out.println(p);
        System.out.println("---------------------------");
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }

    private Customer getOrCreateCustomer(String cid) {
        Customer c = sessionCustomers.get(cid);
        if (c == null) {
            c = new Customer(cid, "User-" + cid);
            sessionCustomers.put(cid, c);
        }
        return c;
    }

    private void addToCartMenu() {
        System.out.print("Enter customer id: ");
        String cid = sc.nextLine().trim();
        Customer cust = getOrCreateCustomer(cid);

        System.out.print("Enter product id to add: ");
        String pid = sc.nextLine().trim();
        Product p = catalog.findById(pid);
        if (p == null) {
            System.out.println("Product not found.");
            return;
        }
        cust.getCart().add(p);
        System.out.println("Added to cart: " + p);
    }

    private void removeFromCartMenu() {
        System.out.print("Enter customer id: ");
        String cid = sc.nextLine().trim();
        Customer cust = sessionCustomers.get(cid);
        if (cust == null || cust.getCart().isEmpty()) {
            System.out.println("Cart empty or no such customer.");
            return;
        }
        LinkedList<Product> cart = cust.getCart();
        int idx = 1;
        for (Product p : cart) System.out.println((idx++) + ". " + p);
        System.out.print("Enter item number to remove: ");
        int num = Integer.parseInt(sc.nextLine().trim());
        if (num >= 1 && num <= cart.size()) {
            Product removed = cart.remove(num - 1);
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Invalid index.");
        }
    }

    private void viewCartMenu() {
        System.out.print("Enter customer id: ");
        String cid = sc.nextLine().trim();
        Customer cust = sessionCustomers.get(cid);
        if (cust == null || cust.getCart().isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("----- Cart Items -----");
        for (Product p : cust.getCart()) System.out.println(p);
    }

    private void moveRecentlyViewedToCartMenu() {
        System.out.print("Enter customer id: ");
        String cid = sc.nextLine().trim();
        Customer cust = sessionCustomers.get(cid);
        if (cust == null) {
            System.out.println("No such customer in session.");
            return;
        }
        if (cust.getRecentlyViewed().isEmpty()) {
            System.out.println("No recently viewed items.");
            return;
        }
        System.out.println("Recently Viewed:");
        int i = 1;
        for (Product p : cust.getRecentlyViewed()) System.out.println((i++) + ". " + p);
        System.out.print("Enter item number to move to cart (0 to move all): ");
        int choice = Integer.parseInt(sc.nextLine().trim());
        if (choice == 0) {
            for (Product p : cust.getRecentlyViewed()) cust.getCart().addFirst(p);
            cust.getRecentlyViewed().clear();
            System.out.println("Moved all recently viewed to cart.");
        } else if (choice >= 1 && choice <= cust.getRecentlyViewed().size()) {
            Product p = cust.getRecentlyViewed().remove(choice - 1);
            cust.getCart().addFirst(p);
            System.out.println("Moved to cart: " + p);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private void checkoutMenu() {
        System.out.print("Enter customer id: ");
        String cid = sc.nextLine().trim();
        Customer cust = sessionCustomers.get(cid);
        if (cust == null || cust.getCart().isEmpty()) {
            System.out.println("No items to checkout.");
            return;
        }
        LinkedList<Product> cartSnapshot = new LinkedList<Product>(cust.getCart());
        orderManager.placeOrder(cid, cartSnapshot);
        cust.getCart().clear();
        System.out.println("Checkout done. Order recorded at " + new Date().toString());
    }

    private void viewAllOrdersMenu() {
        List<Order> all = orderManager.getAllOrders();
        if (all.isEmpty()) {
            System.out.println("No orders yet.");
            return;
        }
        for (Order o : all) System.out.println(o);
    }

    private void viewUniqueCustomersMenu() {
        System.out.println("Unique customers who placed orders:");
        for (String cid : orderManager.getUniqueCustomers()) System.out.println(cid);
    }

    private void viewRecommendedMenu() {
        List<Product> all = catalog.listAll();
        if (all.isEmpty()) {
            System.out.println("Catalog empty.");
            return;
        }
        System.out.println("1) Sort by Rating (desc)\n2) Sort by Price (asc)");
        String ch = sc.nextLine().trim();
        if (ch.equals("1")) {
            List<Product> byRating = recommender.sortByRatingDesc(all);
            System.out.println("Top by Rating:");
            for (Product p : byRating) System.out.println(p);
        } else if (ch.equals("2")) {
            List<Product> byPrice = recommender.sortByPriceAsc(all);
            System.out.println("Sorted by Price:");
            for (Product p : byPrice) System.out.println(p);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // When a customer views product details, record it in recentlyViewed
    private void viewProductDetailMenu() {
        System.out.print("Enter product id to view: ");
        String pid = sc.nextLine().trim();
        Product p = catalog.findById(pid);
        if (p == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.println("Details: " + p);
        System.out.print("Enter customer id who viewed (optional - press Enter to skip): ");
        String cid = sc.nextLine().trim();
        if (!cid.isEmpty()) {
            Customer cust = getOrCreateCustomer(cid);
            // maintain size up to 5
            cust.getRecentlyViewed().remove(p); // remove duplicate if present
            cust.getRecentlyViewed().addFirst(p);
            while (cust.getRecentlyViewed().size() > 5) cust.getRecentlyViewed().removeLast();
            System.out.println("Recorded recently viewed for " + cid);
        }
    }

    public void start() {
        seedProducts();

        boolean running = true;
        while (running) {
            System.out.println("\n===== AMAZON MINI SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Add to Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Move Recently Viewed to Cart");
            System.out.println("7. Checkout");
            System.out.println("8. View All Orders");
            System.out.println("9. View Unique Customers");
            System.out.println("10. View Recommended Products (Sorted)");
            System.out.println("11. View Product Details (Record Recently Viewed)");
            System.out.println("12. Exit");
            System.out.print("Choose an option: ");
            String opt = sc.nextLine().trim();

            switch (opt) {
                case "1": addProductMenu(); break;
                case "2": viewProductsMenu(); break;
                case "3": addToCartMenu(); break;
                case "4": removeFromCartMenu(); break;
                case "5": viewCartMenu(); break;
                case "6": moveRecentlyViewedToCartMenu(); break;
                case "7": checkoutMenu(); break;
                case "8": viewAllOrdersMenu(); break;
                case "9": viewUniqueCustomersMenu(); break;
                case "10": viewRecommendedMenu(); break;
                case "11": viewProductDetailMenu(); break;
                case "12": running = false; break;
                default: System.out.println("Invalid option."); break;
            }
        }
        System.out.println("Exiting. Goodbye!");
        sc.close();
    }

    public static void main(String[] args) {
        new AmazonMiniSystem().start();
    }
}
