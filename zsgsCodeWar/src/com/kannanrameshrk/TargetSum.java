package com.kannanrameshrk;

import java.util.HashSet;

public class TargetSum {

	public static void main(String[] args) {
		 int A[] = { 1, 4, 45, 6, 10, 8 };
	        int n = 16;
	        printpairs(A, n);

	}

	private static void printpairs(int[] a, int n) {
		HashSet<Integer> map = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			int diff=n-a[i];
			
			if(map.contains(diff)) {
				System.out.println("Yes");
				return;
			}
			map.add(a[i]);
		}
		System.out.println("No");
	}

}
