package com.stream.part2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
	public static void main(String[] args) {
		List<String> names = List.of("Apple", "Grapes", "Banana", "Mango", "Kiwi");

		Map<String, Integer> map = names.
				                 stream().
				              collect(Collectors.toMap(name -> name, String::length));
		System.out.println(map);

	}

}
