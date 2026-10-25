package com.string.program;

public class Q30RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str = "yash bijwe";

		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				str1 += str.charAt(i);
			}
		}
		System.out.println(str.replaceAll("\\s+", ""));
	}
}
