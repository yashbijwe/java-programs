package com.string.program;

public class Q26LowercaseUppercase {

	public static String lowercase(String str) {
		String lower = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			lower += ch;
		}
		return lower;
	}

	public static String uppercase(String str) {
		String upper = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			}
			upper += ch;
		}
		return upper;
	}

	public static void main(String[] args) {
		String str = "yaSh";
//		System.out.println(lowercase(str));
		System.out.println(uppercase(str));
	}

}
