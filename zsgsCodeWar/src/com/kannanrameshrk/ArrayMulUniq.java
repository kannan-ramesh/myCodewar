package com.kannanrameshrk;

import java.util.Arrays;

public class ArrayMulUniq {

	public static void main(String[] args) {
		int[] arr= {50,75,100};
		System.out.println(canMakeEqual(arr));
	}

	private static boolean canMakeEqual(int[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				continue;
			}
			
			while(arr[i]%2==0) {
				arr[i]/=2;
			}
			
			while(arr[i]%3==0) {
				arr[i]/=3;
			}
            System.out.println(Arrays.toString(arr));
			if(arr[i]!=arr[0]) {
				return false;
			}
        }
        return true;
	}

}
