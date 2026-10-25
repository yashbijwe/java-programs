package com.array.program;

import java.util.ArrayList;
import java.util.List;

public class Q9UnionSorted {
	public static List<Integer> union(int[] a, int[] b) {
		int i = 0, j = 0;
		List<Integer> res = new ArrayList<>();

		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				if (res.isEmpty() || res.get(res.size() - 1) != a[i])
					res.add(a[i]);
				i++;
			} else {
				if (res.isEmpty() || res.get(res.size() - 1) != b[j])
					res.add(b[j]);
				j++;
			}
		}

		while (i < a.length) {
			if (res.get(res.size() - 1) != a[i])
				res.add(a[i]);
			i++;
		}

		while (j < b.length) {
			if (res.get(res.size() - 1) != b[j])
				res.add(b[j]);
			j++;
		}

		return res;
	}

	public static List<Integer> union2(int[] a, int[] b) {
		List<Integer> res = new ArrayList<>();
		for (int i : a) {
			if (!res.contains(i))
				res.add(i);
		}
		for (int i : b) {
			if (!res.contains(i))
				res.add(i);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 4, 5, 6, 7 };
		int[] union = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			union[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			boolean found = false;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				union[a.length + i] = b[i];
			}
		}

		System.out.println("Union of two sorted arrays:");
		for (int i = 0; i < union.length; i++) {
			if (union[i] != 0) {
				System.out.print(union[i] + " ");
			}
		}
	}
}