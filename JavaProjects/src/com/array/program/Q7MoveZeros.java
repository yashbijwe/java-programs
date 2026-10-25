
package com.array.program;

import java.util.Arrays;

public class Q7MoveZeros {
	public static void main(String[] args) {
		int arr[] ={4,5,0,7,0,2,3,6,9,4,5};
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
