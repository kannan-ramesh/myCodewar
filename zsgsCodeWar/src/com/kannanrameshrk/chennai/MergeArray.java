package com.kannanrameshrk.chennai;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] arr= {1,3,5,7,9};
		
		int[] arr1= {2,4,6,12,55,77};
		int n=arr.length;
		int m=arr1.length;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Enter index:");
		int index=input.nextInt();
		
		int val=findIndex(arr,arr1,n,m,index);
		System.out.println("value:"+val);
	}

	private static int findIndex(int[] arr, int[] arr1, int n, int m, int index) {
		int i=0,j=0;
		int k=0;
		int[] ans=new int[n+m];
		
		while(i<n && j<m) {
			if(arr[i]<arr1[j]) {
				ans[k]=arr[i++];
				if(k==index-1) {
					System.out.println(Arrays.toString(ans));
					return ans[k];
				}
				k++;
			}else {
				ans[k]=arr1[j++];
				if(k==index-1) {
					System.out.println(Arrays.toString(ans));
					return ans[k];
				}
				k++;
			}
		}
		
		while(i<n) {
			ans[k]=arr[i++];
			if(k==index-1) {
				System.out.println(Arrays.toString(ans));
				return ans[k];
			}
			k++;
		}
		while(j<m) {
			ans[k]=arr1[j++];
			if(k==index-1) {
				System.out.println(Arrays.toString(ans));
				return ans[k];
			}
		}
		return 0;
	}

}
