package com.string.program;

import java.util.Arrays;

public class Q34AnagramCheck {
	
	public static void main(String[] args) {
		String str="listen";
		String str1="slient";
		
		char[] ch=str.toLowerCase().toCharArray();
		char[] ch1=str1.toLowerCase().toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch, ch1)) {
			System.out.println("Anagram.");
		}
		else {
			System.out.println("Not Anagram.");
		}
	}
	

}
