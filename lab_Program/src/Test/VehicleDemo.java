package Test;

public class VehicleDemo {
	public static void main(String[] args) {

		vehicle v = vehicleFactory.get("car");
		v.drive();

	}
}

class Bike implements vehicle {
	public void drive() {
		System.out.println("Bike56464");
	}

}

class Car implements vehicle {
	public void drive() {
		System.out.println("car646545");
	}
}

class vehicleFactory {

	public static vehicle get(String str) {
		if (str.equals("car")) {
			return new Car();
		} else if (str.equals("bike")) {
			return new Bike();
		} else
			return null;
	}

}