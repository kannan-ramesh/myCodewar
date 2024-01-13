package com.kannanrameshrk.raji;

import java.util.Scanner;

public class RotateArray {
//	Given a 2D square matrix find whether the row values are rotated value of previous row.
//
//	input: [1,2,3,4][4,1,2,3][3,4,1,2][2,3,4,1]
//	output : true.
//	input : [5,6,7,8][7,8,5,6][6,7,8,5][5,6,7,8]
//	output : false.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//int[][] arr = { { 1, 2, 3, 4 }, { 4, 1, 2, 3 }, { 3, 4, 1, 2 }, { 2, 3, 4, 1 }, };
		int[][] arr = { { 5, 6, 7, 8 }, { 7, 8, 5, 6 }, { 6, 7, 8, 5 }, { 5, 6, 7, 8 }, };
		boolean flag = false;
		for (int i = 1; i < arr.length; i++) {
			flag=findRotate(arr[i], arr[i - 1]);
			if(flag==false) {
				break;
			}else {
				continue;
			}
		}
		System.out.println(flag);
	}

	private static boolean findRotate(int[] arr2, int[] arr1) {
		if(!(arr2[0]==arr1[arr1.length-1])) {
			return false;
		}else {
			for(int i=1;i<arr2.length-1;i++) {
				if(!(arr2[i]==arr1[i-1])) {
					return false;
				}
			}
		}
		return true;
	}

}
