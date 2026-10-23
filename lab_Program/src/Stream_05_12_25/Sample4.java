package Stream_05_12_25;

import java.util.stream.Stream;

//write a program to create two different stream of element merge them 
//and display all
public class Sample4 {
	public static void main(String[] args) {
		Stream<String> a = Stream.of("Rin","Santoor");
		Stream<String> b = Stream.of("Biscult","ThumsUp","Salt");
		Stream<String> cart=Stream.concat(a,b );
		cart.forEach(System.out::println);
	}

}
