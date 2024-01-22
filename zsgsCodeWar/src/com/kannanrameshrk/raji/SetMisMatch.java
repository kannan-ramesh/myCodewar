package com.kannanrameshrk.raji;

import java.util.Arrays;

public class SetMisMatch {

	public static void main(String[] args) {
		
		int[] nums = {1,2,2,3,4,5,6,7,8,9};
		
		findSetArr(nums);
	}

	private static void findSetArr(int[] nums) {
		int[] arr=new int[2];
		int[] freq=new int[nums.length+1];
		
		for(int i=0;i<nums.length;i++) {
			freq[nums[i]]++;
		}
		
		for(int i=1;i<=nums.length;i++) {
			if(freq[i]>1) {
				arr[0]=i;
			}
			if(freq[i]==0) {
				arr[1]=i;
			}
		}
		
		System.out.println(Arrays.toString(freq));
		System.out.println(Arrays.toString(arr));
		
	}

}
