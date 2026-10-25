package com.array.program;

public class Q1Largestnumber {
	public static void main(String[] args) {
		int arr[]= {5,6,8,6,4,1,5,6,2,1,5,10,14};
		int largestNo=arr[0];

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largestNo) {
			
				largestNo=arr[i];
			}
		}
		System.out.println(largestNo);
		
	}

}
