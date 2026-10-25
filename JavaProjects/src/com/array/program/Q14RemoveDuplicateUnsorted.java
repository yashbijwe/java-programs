package com.array.program;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q14RemoveDuplicateUnsorted {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++)
                        arr[k] = arr[k + 1];
                    n--;
                } else {
                    j++;
                }
            }
        }
        return n;
    }
    
    public static Set<Integer> removeDuplicatesHashSet(int[] arr) {
    	Set<Integer> set = new LinkedHashSet<>();
    	
    	for(int num : arr) set.add(num);
    	return set;
    }
    
    public static int[] removeDuplicatesStream(int[] arr) {
    	return Arrays.stream(arr).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4,2,4,3,2,1};
//        int len = removeDuplicates(arr);
//        System.out.println("After removing duplicates: "
//                + Arrays.toString(Arrays.copyOf(arr, len)));
//        removeDuplicatesHashSet(arr).forEach(i -> System.out.print(i+" "));
        System.out.println(Arrays.toString(removeDuplicatesStream(arr)));
    }
}