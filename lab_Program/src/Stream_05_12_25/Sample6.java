package Stream_05_12_25;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//write a program to create a stream of name of your friend, filter out the names starting with 'A' letter.
public class Sample6 {
	public static void main(String[] args) {
		Stream<String> names = Stream.of("Akash","Bobby","chinu","Akash","David","Anjali","Raj");
		Stream<String> filteredNames = names.filter(str->str.startsWith("A"));
		filteredNames.forEach(System.out::println);
		
		
		List<String> list = names.filter(str->str.startsWith("A")).collect(Collectors.toList());
          list.forEach(System.out::println);
	}

}
