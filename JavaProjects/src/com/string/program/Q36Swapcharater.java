package com.string.program;

public class Q36Swapcharater {
	public static String swapcharacter(String str) {
		String swap = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			} else {
				ch = (char) (ch - 32);
			}
			swap += ch;
		}
		return swap;
	}

	public static void main(String[] args) {
		String str = "yaSh";
		System.out.println(swapcharacter(str));
	}

}
