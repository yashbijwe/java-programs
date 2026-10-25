   package com.array.program;

import java.util.Arrays;

public class Q6RotateLeftD {
//	    static void reverse(int[] arr, int l, int r) {
//	        while (l < r) {
//	            int t = arr[l]; arr[l] = arr[r]; arr[r] = t;
//	            l++; r--;
//	        }
//	    }
//
//	    static void leftRotateD(int[] arr, int d) {
//	        int n = arr.length;
//	        d %= n;
//	        reverse(arr, 0, d - 1);
//	        reverse(arr, d, n - 1);
//	        reverse(arr, 0, n - 1);
//	    }
	
	public static void leftRotateD(int[] arr, int d) {
		for(int i=0; i<d; i++) {
			int first = arr[0];
			for(int j=0; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = first;
		}
	}

	    public static void main(String[] args) {
	        int[] arr = {1,2,3,4,5,6};
//	        leftRotateD(arr, 2);
	        leftRotateD(arr, 1);
	        System.out.println(Arrays.toString(arr));
	    }
	}


