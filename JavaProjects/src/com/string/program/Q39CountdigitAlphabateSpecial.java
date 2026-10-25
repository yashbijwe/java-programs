package com.string.program;

public class Q39CountdigitAlphabateSpecial {
	public static void main(String[] args) {
		String str = "nnbkj&123%^456*()789";

		int alphabate = 0, digit = 0, special = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				alphabate++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				special++;
			}

		}

		System.out.println("Alphabate :" + alphabate);
		System.out.println("Digit :" + digit);
		System.out.println("Special :" + special);
	}

}
