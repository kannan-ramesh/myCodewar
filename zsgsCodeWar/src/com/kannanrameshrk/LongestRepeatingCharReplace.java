package com.kannanrameshrk;

import java.util.Arrays;
import java.util.Scanner;

public class LongestRepeatingCharReplace {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=input.next();
		System.out.println("Enter replace count:");
		int k=input.nextInt();
		
		int n=findLength(s,k);
		System.out.println("Length is:"+n);
	}

	private static int findLength(String s, int k) {
		int[] arr=new int[26];
		int left=0;
		int right=0;
		int count=0;
		int ans=0;
		
		for(right=0;right<s.length();right++) {
			arr[s.charAt(right)-'A']++;
			
			count=Math.max(count, arr[s.charAt(right)-'A']++);
			if(right-left+1-count>k) {
				arr[s.charAt(right)-'A']--;
				left++;
			}
			ans=Math.max(ans, right-left+1);
		}
		System.out.println(Arrays.toString(arr));
		return ans;
	}

}
