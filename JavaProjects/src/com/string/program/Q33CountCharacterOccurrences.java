package com.string.program;

public class Q33CountCharacterOccurrences {

	public static void countChars(String str) {
		int[] freq = new int[256];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		System.out.println("Character occurrences:");
		for (int i = 0; i < 256; i++) {
			if (freq[i] > 0) {
				System.out.println((char) i + " : " + freq[i]);
			}
		}
	}

	public static void main(String[] args) {
		String str = "programming";
		countChars(str);
	}
}