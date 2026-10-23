package Stream_05_12_25;

import java.util.List;
import java.util.stream.Collectors;
//of method introduced to make unmodifiable elements

public class Sample7 {
	public static void main(String[] args) {
		List<String> courses = List.of("java","python","go");
		List<String> coursesInUC=	courses.stream().
									filter(n->n.startsWith("j")).map(String::toUpperCase).
									collect(Collectors.toList());
		coursesInUC.forEach(System.out::println);
	}

}
