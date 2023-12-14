package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxGap {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter size:");
		int n=input.nextInt();
		
		List<Integer> arr =new ArrayList<>();
		
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			arr.add(input.nextInt());
		}
		System.out.println(arr);
		
		maxGap(arr,n);
	}

	private static void maxGap(List<Integer> arr, int n) {
		sortArray(arr,n);
		int max =Integer.MIN_VALUE;
		int start=-1;
		int end=-1;
		
		for(int i=0;i<n-1;i++) {
			int dif =arr.get(i+1)-arr.get(i);
			if(max < dif) {
				max=dif;
				start=i;
				end=i+1;
			}
		}
		System.out.println("diff->"+max+"-["+arr.get(start)+"]["+arr.get(end)+"]");
	}
	private static void sortArray(List<Integer> arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr.get(j) > arr.get(j + 1)) {
					int temp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, temp);
				}
			}
		}
	}
}
