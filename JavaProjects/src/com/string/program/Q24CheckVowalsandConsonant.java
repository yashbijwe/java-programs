package com.string.program;

public class Q24CheckVowalsandConsonant {
	public static void main(String[] args) {
		String str = "yash";
		int vowalscount = 0;
		int consonantcount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowalscount++;
			} else {
				consonantcount++;
			}
		}
		System.out.println("vowals character : "+vowalscount);
		System.out.println("consonant character : "+consonantcount);
	}

}
