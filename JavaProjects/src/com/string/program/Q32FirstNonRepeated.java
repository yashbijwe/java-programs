package com.string.program;

public class Q32FirstNonRepeated {

	public static char firstNonRepeated(String str) {
		int[] freq = new int[256];

		// Count frequency
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		// Find first non-repeated character
		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}

		return '\0';
	}

	public static void main(String[] args) {
		String str = "aabbcddeff";

		char ans = firstNonRepeated(str);

		if (ans != '\0') {
			System.out.println("First non-repeated character: " + ans);
		} else {
			System.out.println("No non-repeated character");
		}
	}
}
