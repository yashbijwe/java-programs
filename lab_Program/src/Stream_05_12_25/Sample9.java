package Stream_05_12_25;

import java.util.List;
import java.util.stream.Collectors;

public class Sample9 {
	public static void main(String[] args) {
		List<String> names = List.of("jethalal","daya","shreyash","aman");
		List<String> sorting = names.stream().sorted().collect(Collectors.toList());
		sorting.forEach(System.out::println);
	}

}
