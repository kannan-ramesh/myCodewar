package com.kannanrameshrk.raji;

import java.util.Arrays;

public class DiagnolTravarase {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		printDiagnol(arr);
	}

	private static void printDiagnol(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int[] ans = new int[m * n];
		int j=0;
		int i=0;
		
		for (int k = 0; k <m*n; k++) {
			ans[k] = arr[i][j];

			if ((i + j) % 2 == 0) {
				
				if (j == m - 1) {
					i++;
				}else if (i == 0) {
					j++;
				} 
				else {
					i--;
					j++;
				}
			} else {
				
				if (i == n - 1) {
					j++;
				}else if (j == 0) {
					i++;
				}else {
					i++;
					j--;
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}
