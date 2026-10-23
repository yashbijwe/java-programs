package Test;

import java.util.Arrays;
import java.util.Objects;

class Student {
	String name;
	int id;

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + name.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

public class Main {
	public static void main(String[] args) {
		int[] a= {5,6,4,23,5};
		System.out.println(Arrays.toString(a));
	}

}
