        package com.array.program;

public class Q10MissingNumber {
	    public static void main(String[] args) {
	        int arr[] = {1,2,3,5};
	        int n = arr.length + 1;
	        int total = n * (n + 1) / 2;
	        int sum = 0;
	        for(int x : arr) {
	            sum += x;
	        }
	        int missing = total - sum;
	        System.out.println("Missing number: " + missing);
	    }
	}