package miscellaneous11_12_2025;

import java.util.Map;
import java.util.TreeMap;

/*
 -Add items to cart
 -make payment
 -Payment successful then cart is empty
 -Display Cart
 * */
public class AmezonCartSystem {
	public static void main(String[] args) {
		Map<String, Double> cart = new TreeMap<String, Double>();
		cart.put("pen", 10.0);
		cart.put("Book", 70.0);
		cart.put("pencil", 15.0);
		cart.put("marker", 20.0);
		System.out.println("Products in cart");
		cart.forEach((p, a) -> System.out.println(p + " Rs. " + a));
		double totalBill = 0.0;
		for (Map.Entry<String, Double> e : cart.entrySet()) {
			totalBill += e.getValue();
		}
		System.out.println("Total Bill: Rs." + totalBill);
		boolean paymentDone = true;
		if (paymentDone == true) {
			cart.clear();
		}
		System.out.println("Payment Done.");
		if (cart.isEmpty() == true) {
			System.out.println("No product available in cart. Add Product");
		} else {
			cart.forEach((p, a) -> System.out.println(p + " Rs. " + a));
		}

	}

}
