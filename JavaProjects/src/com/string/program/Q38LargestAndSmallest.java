package com.string.program;

public class Q38LargestAndSmallest {

	    public static void main(String[] args) {
	        String str = "Java is very powerful language";
	        String[] words = str.split(" ");

	        String smallest = words[0];
	        String largest = words[0];

	        for (String w : words) {
	            if (w.length() < smallest.length()) {
	                smallest = w;
	            }
	            if (w.length() > largest.length()) {
	                largest = w;
	            }
	        }

	        System.out.println("Smallest word: " + smallest);
	        System.out.println("Largest word: " + largest);
	    }
	}