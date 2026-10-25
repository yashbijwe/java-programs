package com.array.program;

public class Q18Transpose {
	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int arr1[][] = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr1[i][j] = arr[j][i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
