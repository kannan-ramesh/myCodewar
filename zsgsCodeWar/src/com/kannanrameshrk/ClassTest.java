package com.kannanrameshrk;

import java.util.Arrays;
import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=input.next();
		System.out.println("Enter digit of k:");
		int k=input.nextInt();
		
		int ans=maxConsecutiveAns(str,k);
		System.out.println(ans);
	}

	private static int maxConsecutiveAns(String str, int k) {
//		int[] count=new int[2];
//		int maxLen=0;
//		int s=0;
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)=='T') {
//				count[0]++;
//			}else {
//				count[1]++;
//			}
//			
//			while(count[0]>k && count[1]>k) {
//				System.out.println("i->"+i);
//				if(str.charAt(i)=='T') {
//					count[0]--;
//				}else {
//					count[1]--;
//				}
//				s++;
//			}
//			if(count[0]<=k || count[1]<=k) {
//				maxLen=Math.max(maxLen, i-s+1);
//			}
//		}
//		
//		System.out.println(Arrays.toString(count));
//		return maxLen;
		int end=0,countT=0,countF=0;
		int start1=0,start2=0;
		
		while(end<str.length()) {
			if(str.charAt(end)=='T') {
				countT++;
			}else {
				countF++;
			}
			end++;
			
			if(countT>k) {
				if(str.charAt(start1)=='T') {
					countT--;
				}
				start1++;
			}
			
			if(countF>k) {
				if(str.charAt(start2)=='F') {
					countF--;
				}
				start2++;
			}
		}
		return Math.max(end-start1, end-start2);
	}

}
