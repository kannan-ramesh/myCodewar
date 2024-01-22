package com.kannanrameshrk.raji;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixString {

	public static void main(String[] args) {
//		Input: ["technique", "technician", "technology", "technical"]
//				Output: "techn"
//
//				Input: ["techie delight", "tech", "techie", "technology", "technical"]
//				Output: "tech"
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENter size of arr:");
		int n = input.nextInt();
		input.nextLine();
		String[] str =new String[n];
		
		System.out.println("Enter String:");
		for(int i=0;i<n;i++) {
			str[i]=input.nextLine();
		}
		String ans=findPrefix(str,n);
		System.out.println(ans);
	}

	private static String findPrefix(String[] str, int n) {
		StringBuilder res=new StringBuilder();
		String first=str[0];
		
		for(int i=0;i<first.length();i++) {
			for(int j=1;j<str.length;j++) {
				if(i>=str[j].length() || first.charAt(i) != str[j].charAt(i)) {
					return res+"";
				}
			}
			res.append(first.charAt(i));
		}
		return null;
	}

}
