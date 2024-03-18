package com.kannanrameshrk;

import java.util.Scanner;

public class MinSubString {

	public static void main(String[] args) {
//		Input: string = “this is a test string”, 
		// pattern = “tist”
//				Output: “t stri” 
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first String:");
		String str1 = input.nextLine();
		System.out.println("Enter second String:");
		String str2 = input.next();

		findSubString(str1, str2);
	}

	private static void findSubString(String str1, String target) {
		String minString = "";
		int tempLen = Integer.MAX_VALUE;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = i; j < str1.length(); j++) {
				String sub = str1.substring(i, j + 1);

				if (containsCharacter(sub, target)) {
					int len = sub.length();

					if (tempLen > len) {
						minString = sub;
						tempLen = len;
					}
				}
			}
		}
		System.out.println(minString);
	}

	private static boolean containsCharacter(String sub, String target) {
		int[] count = new int[256];

		for (char ch : target.toCharArray()) {
			count[ch]++;
		}

		for (char ch : sub.toCharArray()) {
			count[ch]--;
		}

		for (int i = 0; i < 256; i++) {
			if (count[i] > 0) {
				return false;
			}
		}
		return true;
	}
}