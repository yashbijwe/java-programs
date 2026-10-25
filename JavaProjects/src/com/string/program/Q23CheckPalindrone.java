package com.string.program;

public class Q23CheckPalindrone {

	public static void main(String[] args) {
		String str = "lol";
		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 += str.charAt(i);
		}
		
		if (str1.equals(str)) {
			System.out.println("palindrone.");
		} else {
			System.out.println("Not palindrone.");
		}

	}

}
