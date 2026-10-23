package Stream_05_12_25;

import java.util.stream.Stream;
//of(T..t) :return a stream of several elements

public class Sample1 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("apple","banana","kiwi","grape");
		stream.forEach(System.out::println);
	}

}
