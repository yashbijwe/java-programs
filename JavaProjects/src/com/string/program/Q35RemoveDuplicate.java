package com.string.program;

public class Q35RemoveDuplicate {
	public static void main(String[] args) {
		String str = "eye";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!result.contains(String.valueOf(ch))) {
				result += ch;

			}
		}
		System.out.println(result);

	}

}
