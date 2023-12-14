package com.kannanrameshrk;

import java.util.Scanner;

public class KthMaxArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = input.nextInt();

		int[] arr = new int[n];

		System.out.println("Enetr Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();

		int k = input.nextInt();

		int ans = findKSmall(arr, k);
		System.out.println("The Kth smallest elemnent is->" + ans);
	}

	private static int findKSmall(int[] arr, int k) {
		if (arr.length < k) {
			return -1;
		}
		sortArray(arr);

		return arr[k - 1];
	}

	private static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - i - 1; j++) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}

}
