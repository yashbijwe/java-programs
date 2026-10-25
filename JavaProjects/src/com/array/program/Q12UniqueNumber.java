package com.array.program;



public class Q12UniqueNumber {
	
	 public static int singleNumber(int[] arr) {
    int xor = 0;
    for (int num : arr) xor ^= num;
    return xor;
}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 1, 5};
		int []unique = new int[arr.length];
		
		
		
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(arr[i]);
			}
		}
		
//		System.out.println(Arrays.toString(unique));		
//		int[] arr = {2,3,2,4,4};
//      System.out.println("Single Number: " + singleNumber(arr));

	}

}
