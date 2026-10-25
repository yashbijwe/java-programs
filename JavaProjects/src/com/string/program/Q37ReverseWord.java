package com.string.program;

import java.util.Arrays;

public class Q37ReverseWord {

	    public static void main(String[] args) {
	        String str = "Java is very easy";
	        String[] words = str.split(" ");
	        String result = "";

	        for (String w : words) {
	            String rev = "";
	            for (int i = w.length() - 1; i >= 0; i--) {
	                rev += w.charAt(i);
	            }
	            result += rev + " ";
	        }

	        System.out.println(result.trim());
	        System.out.println(Arrays.toString(words));
	    }
	}


