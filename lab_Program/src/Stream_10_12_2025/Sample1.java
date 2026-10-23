package Stream_10_12_2025;

import java.util.stream.Stream;

//write a program to generate a stream of multiple names and then display them.
public class Sample1 {
	public static void main(String[] args) {
		Stream<String> names = Stream.of("yash", "Sumit", "Prasad", "Prajwal", "Bobby");
		names.forEach(System.out::println);
	}

}
