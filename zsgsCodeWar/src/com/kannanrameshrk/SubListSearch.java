package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubListSearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = input.nextInt();
		System.out.println("Enter new Array Size:");
		int m = input.nextInt();

		List<Integer> arr = new ArrayList<>(n);
		List<Integer> newArr = new ArrayList<>(m);

		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			int val = input.nextInt();
			arr.add(val);
		}
		System.out.println("Enter new Array Elements:");
		for (int i = 0; i < m; i++) {
			int val = input.nextInt();
			newArr.add(val);
		}

		System.out.println(arr);
		System.out.println(newArr);
		if (findSubList(arr, newArr)) {
			System.out.println("sublist is contais newArray");
		} else {
			System.out.println("sublist is not contais newArray");
		}
	}

	private static boolean findSubList(List<Integer> arr, List<Integer> newArr) {
		if (newArr.isEmpty()) {
			return false;
		}
		int start = newArr.get(0);
		int end = newArr.get(newArr.size() - 1);

		int left = arr.indexOf(start);
		int right = arr.indexOf(end);

		if (left == -1 || right == -1) {
			return false;
		}
		int j = 0;
		while (left <= right) {
			if (arr.get(left) != newArr.get(j)) {
				return false;
			}
			left++;
			j++;
		}
		return true;
	}

}
