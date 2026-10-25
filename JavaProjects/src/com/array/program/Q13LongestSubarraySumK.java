package com.array.program;

public class Q13LongestSubarraySumK {
     public static void main(String[] args) {
    	 int[] arr = {1,2,3,1,1,1,1};
         int k = 3;
         int maxLength = 0;
         int currentSum = 0;
         int start = 0;
         for (int end = 0; end < arr.length; end++) {
			 currentSum += arr[end];
			 while (currentSum > k) {
				 currentSum -= arr[start];
				 start++;
			 }
			 if (currentSum == k) {
				 maxLength = Math.max(maxLength, end - start + 1);
			 }
		 }
         System.out.println("Longest Subarray Length: " + maxLength);
         
		
	}
}
