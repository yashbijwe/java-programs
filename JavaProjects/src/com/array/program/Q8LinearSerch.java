package com.array.program;

public class Q8LinearSerch {
	public static void main(String[] args) {
		int arr[] ={4,5,0,7,0,2,3,6,9,4,5};
		int key=5;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				System.out.println((i+1)+" ");
			}	
		}
	}

}
