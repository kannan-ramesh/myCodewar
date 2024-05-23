package com.kannanrameshrk;

import java.util.Arrays;

public class RevMaxDigit {
	public static void main(String[] args) {
		// int[] arr= {1,2,4,15,8};
		int[] arr = { 4, 3, 70, 15, 118 };

		int maxDigit = findMax(arr);
		findRes(arr, maxDigit);
	}

	private static void findRes(int[] arr, int maxDigit) {
		for (int i = 0; i < arr.length; i++) {
			int rev = revDigit(arr[i], maxDigit);
			arr[i] = rev;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static int revDigit(int num, int maxDigit) {
		int n = 0;
		while (maxDigit != 0) {
			n = n * 10 + num % 10;
			num /= 10;
			maxDigit--;
		}
		return n;
	}

	private static int findMax(int[] arr) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		String digit = max + "";
		return digit.length();
	}
}
