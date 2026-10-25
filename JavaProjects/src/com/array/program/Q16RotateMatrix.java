package com.array.program;

import java.util.Arrays;

public class Q16RotateMatrix {
    static void rotateClockwise(int[][] mat) {
        int n = mat.length;

        // transpose
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }

        // reverse rows
        for (int[] row : mat) {
            int l = 0, r = n - 1;
            while (l < r) {
                int t = row[l];
                row[l] = row[r];
                row[r] = t;
                l++; r--;
            }
        }
    }

    static void rotateAntiClockwise(int[][] mat) {
        int n = mat.length;

        // transpose
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }

        // reverse columns
        for (int j = 0; j < n; j++) {
            int top = 0, bottom = n - 1;
            while (top < bottom) {
                int t = mat[top][j];
                mat[top][j] = mat[bottom][j];
                mat[bottom][j] = t;
                top++; bottom--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotateClockwise(mat);
        System.out.println("Clockwise:");
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
    }
}