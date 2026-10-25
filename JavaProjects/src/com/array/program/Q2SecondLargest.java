package com.array.program;

public class Q2SecondLargest {
	
	public static void main(String[] args) {
		int arr[]= {35,50,20};
		int secondLargest=arr[0];
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("Second Largest Number is: "+secondLargest);
		System.out.println("Second Largest Number is: "+largest);
		
	}

}
