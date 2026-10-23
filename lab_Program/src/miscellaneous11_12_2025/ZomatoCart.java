package miscellaneous11_12_2025;
/*-Allow the user to add food items into cart,where each entry will have food name and its price.
 *-Allow the user to modify the cart by removing a particular food item.
 *-Display the updated cart and the total price to be paid by the user. 
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ZomatoCart {
	public static void main(String[] args) {
		Map<String, Double> cart = new HashMap<String, Double>();
		cart.put("Hydrabadi biryani", 180.0);
		cart.put("Kaju paneer", 260.0);
		cart.put("Garlic Naan", 60.0);
		cart.put("Coke", 40.0);
		System.out.println("====================================================");
		System.out.println("Food in cart");
		System.out.println(cart);
		cart.remove("Coke");
		System.out.println("====================================================");
		System.out.println("Updated Food in cart");
		System.out.println(cart);
		System.out.println("=======================================================");
		double totalPrice=0.0;
		for(Entry<String, Double> e: cart.entrySet()) {
			System.out.println(e.getKey()+"          : \t Rs. "+e.getValue());
			totalPrice+=e.getValue();
			
		}
		System.out.println("=======================================================");
		System.out.println("Total price: "+totalPrice);

	}

}
