package com.array.program;


public class Q4RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,4,5};

        int k = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1; 
    }
}