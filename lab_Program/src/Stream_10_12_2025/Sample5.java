package Stream_10_12_2025;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*Write a program to create a list of products, each product has name,id,price.
There may be chance that products are added into the list with same id.
Filter out the unique products and display them */
class Product {
	String name;
	int id;
	double price;

	public Product(String name, int id, double price) {

		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Product))
			return false;

		Product p = (Product) o;
		return id == p.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}

public class Sample5 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Laptop", 101, 55000), 
										new Product("Mobile", 102, 25000),
										new Product("Tablet", 103, 30000),
										new Product("SmartWatch", 104, 15000),
										new Product("HeadPhone", 105, 5000), 
										new Product("Laptop", 101, 55000),
										new Product("Mobile", 102, 25000));
		products.stream().distinct().forEach(System.out::println);

	}

}
/* distinct(): */
