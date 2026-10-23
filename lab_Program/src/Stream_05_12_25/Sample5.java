package Stream_05_12_25;

import java.util.stream.Stream;

//	write a program to generate first five even numbers and display.
//  iterate (final T seed, final UnaryOperator<T> f):
//  Returns an infinite sequential ordered Stream

public class Sample5 {
	public static void main(String[] args) {
		Stream<Integer> evenNumbers =Stream.iterate(2, n ->n+2).limit(5);
		evenNumbers.forEach(System.out::println);
	}

}
