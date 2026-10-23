package Stream_05_12_25;

import java.util.stream.Stream;

/*
1.Write a program to create a stream with one element use terminal operation for each method 
that trigger the pipeline and display element.
  
2. write a program to create a stream that accept several elements and process each element 
   sequentially in the pipeline 
      
3. write a program to create a stream with no elements count and display the stream.*/
public class Sample {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("yash");
		stream.forEach(System.out::println);
	}

}
