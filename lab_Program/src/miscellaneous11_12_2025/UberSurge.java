package miscellaneous11_12_2025;
/*
 * Place:price
 * Rain Starts:
 *        Place: price *1.5
 *        Hint: replaceAll
 * */

import java.util.LinkedHashMap;
import java.util.Map;

public class UberSurge {
   public static void main(String[] args) {
	Map<String,Double> location = new LinkedHashMap<String, Double>();
	location.put("Gachibowli", 200.0);
	location.put("Secundarabad", 120.0);
	location.put("Hitech City", 150.0);
	location.put("JNTU", 180.0);
	
	System.out.println("Price chart of Taxi fare as per location in normal time");
	for(Map.Entry<String, Double> e: location.entrySet()) {
		System.out.println(e.getKey()+" :Rs. "+e.getValue());
	}
	System.out.println("============================================================="
			+ "==================");
	System.out.println();
	System.out.println("Rain Starts");
	System.out.println("Price surge increase by 1.5 X times");
	location.replaceAll((loc,price)-> price*1.5);
	location.forEach((l,a)-> System.out.println(l + "  Rs. "+a));
}
}
