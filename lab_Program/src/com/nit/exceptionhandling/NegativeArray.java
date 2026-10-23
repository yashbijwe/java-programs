package com.nit.exceptionhandling;

public class NegativeArray {
	public static void main(String[] args) {
		try {
			int[] arr = new int[-5];
		}

		catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException");
		}

	}

}
