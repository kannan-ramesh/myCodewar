package com.kannanrameshrk;

import java.util.Scanner;

public class Pattern123 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number n:");
		int n = input.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			// print space
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			int num = i * (i + 1) / 2;
			for (int j = 1; j <= i; j++) {
				System.out.print(num-- + " ");
			}
			System.out.println();
		}
		
		for (int i = n-1; i >=1; i--) {
			// print space
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			int num = i * (i + 1) / 2;
			for (int j = 1; j <= i; j++) {
				System.out.print(num-- + " ");
			}
			System.out.println();
		}
	}

}
