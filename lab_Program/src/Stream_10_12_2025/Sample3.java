package Stream_10_12_2025;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a program to  create list of words convert each one of them into uppercase and then
//display
public class Sample3 {
	public static void main(String[] args) {
		Stream<String> words = Stream.of("Albatross","Rainbow","Six","Developer","Dabba");
		List<String> upper=words.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upper);
	}
	
/*
 map(): It applies a given function to each element of the stream and returns a stream containing
  the transformed elements
*/
}
