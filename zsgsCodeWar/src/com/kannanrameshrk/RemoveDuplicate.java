package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter size of Array:");
		int n = input.nextInt();
		List<Integer> arr = new ArrayList<>(n);

		System.out.println("Enter Elements");
		for (int i = 0; i < n; i++) {
			int val = input.nextInt();
			arr.add(val);
		}
		System.out.println(arr);

		System.out.println(validateUnique(arr));
	}

	private static List<Integer> validateUnique(List<Integer> arr) {
		sortArray(arr);

		for (int i = 0; i < arr.size() - 1; i++) {
			if (arr.get(i) == arr.get(i + 1)) {
				arr.remove(i);
			}
		}
		return arr;
	}

	private static void sortArray(List<Integer> arr) {
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = 0; j < arr.size() - i - 1; j++) {
				if (arr.get(j) > arr.get(j + 1)) {
					int temp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, temp);
				}
			}
		}
	}

}
