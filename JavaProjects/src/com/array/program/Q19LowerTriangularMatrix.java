package com.array.program;

public class Q19LowerTriangularMatrix {
	
	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int arr1[][] = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<arr.length;j++) {
			   if(i>j) {
				   arr[i][j]=0
						   ;
			   }
		
		   }
		}
		System.out.println("Lower Triangular Matrix");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
