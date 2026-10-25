package com.string.program;

public class Q25CountWordInString {
	public static void main(String[] args) {

		String str = "yash";
		int count = 0;
//		if (str.length() == 0) {
//			count = 0;
//		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total words in string: " + count);
	}

}
