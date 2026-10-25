package com.string.program;

public class Q31ComparewithoutEqualMethod {

	public static void main(String[] args) {

		String str = "yash";
		String str1 = "yash";
		boolean isequal = true;
		if(str.length()!=str1.length()) isequal=false;

		for (int i = 0; i < str.length(); i++) {
			for (int k = 0; k < args.length; k++) {
				if (str.charAt(i) != str1.charAt(k)) {
					isequal = false;
				}
			}
		}
		if (isequal) {
			System.out.println("String is equal.");
		} else {
			System.out.println("String is not equal.");
		}
	}

}
