package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindSubArray {

	public static void main(String[] args) {
		//10
		//3
		//2 5 3 8 9 1 0 5 8 3
		//3 8 5
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of First Array:");
		int n=input.nextInt();
		List<Integer> arr=new ArrayList<>(); 
		
		System.out.println("Enter size of Second Array:");
		int m=input.nextInt();
		List<Integer> arr2=new ArrayList<>(); 
		
		System.out.println("Enter elements first Array:");
		for(int i=0;i<n;i++) {
			arr.add(input.nextInt());
		}
		
		System.out.println("Enter elements Second Array:");
		for(int i=0;i<m;i++) {
			arr2.add(input.nextInt());
		}
		System.out.println(arr);
		System.out.println(arr2);
		
		findSubArrayIndex(arr,n,arr2,m);
	}

	private static void findSubArrayIndex(List<Integer> arr, int n, List<Integer> arr2, int m) {
		int[] result=new int[m];
		boolean subArr=false;
		
		for(int i=0;i<n;i++) {
			boolean flag=true;
			int startIndex=i;
			int endIndex=i+m-1,index=0;
			
			if(i+m<=n) {
				for(int j=i;j<i+m;j++) {
					if(arr2.contains(arr.get(j))) {
						result[index++]=arr.get(j);
						subArr=true;
					}else {
						flag=false;
						break;
					}
				}
				if(flag) {
					System.out.println("Matching sub Array From Start Index "+startIndex+"to End Index "+endIndex+Arrays.toString(result));
				}
			}
		}
		if(!subArr) {
			System.out.println("No Matching Sub Array");
		}
	}

}
