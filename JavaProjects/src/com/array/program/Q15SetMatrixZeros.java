package com.array.program;

import java.util.Arrays;

public class Q15SetMatrixZeros {

	    public static void setZeroes(int[][] mat) {
	        int r = mat.length, c = mat[0].length;
	        boolean[] row = new boolean[r];
	        boolean[] col = new boolean[c];

	        for (int i = 0; i < r; i++)
	            for (int j = 0; j < c; j++)
	                if (mat[i][j] == 0) {
	                    row[i] = true;
	                    col[j] = true;
	                }

	        for (int i = 0; i < r; i++)
	            for (int j = 0; j < c; j++)
	                if (row[i] || col[j])
	                    mat[i][j] = 0;
	    }

	    public static void main(String[] args) {
	        int[][] mat = {
	                {1,1,1},
	                {1,1,1},
	                {1,0,1}
	        };

	        setZeroes(mat);

	        for (int[] row : mat)
	            System.out.println(Arrays.toString(row));
	    }
	}