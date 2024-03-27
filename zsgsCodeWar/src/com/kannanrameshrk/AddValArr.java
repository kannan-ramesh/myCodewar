package com.kannanrameshrk;

import java.util.Arrays;
import java.util.Scanner;

public class AddValArr {

	public static void main(String[] args) {

//		Eg: arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8}
//		Output: 4 2 12 8 0 0 0 0 0 .
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size n:");
		int n = input.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		printArray(arr, n);
	}

	private static void printArray(int[] arr, int n) {
		int[] ans = new int[n];
		int j = 0;
		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != 0) {
				if (arr[i] == arr[i + 1]) {
					ans[j++] = arr[i] + arr[i + 1];
					arr[i + 1] = 0;
					count++;
				} else {
					ans[j++] = arr[i];
					count++;
				}
			}
		}

		if (arr[n - 1] != 0) {
			ans[j++] = arr[n - 1];
			count++;
		}

		for (int i = 0; i < n - count; i++) {
			ans[j++] = 0;
		}
		System.out.println(Arrays.toString(ans));
	}
}