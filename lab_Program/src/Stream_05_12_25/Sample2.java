package Stream_05_12_25;

import java.util.stream.Stream;
//empty(): returns a empty stream
public class Sample2 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.empty();
		System.out.println("Empty stream created.");
		System.out.println("No. of elements: "+stream.count());
	}

}
