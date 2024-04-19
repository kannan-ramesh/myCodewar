package com.kannanrameshrk;

import java.util.Scanner;

public class PermutationString {
	public static String ans;
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter String:");
		String str=input.next();
		ans=str;
		permutation(str,"");
	}

	private static void permutation(String str, String res) {
		if(str.length()==0) {
			if(Integer.parseInt(res)>Integer.parseInt(ans)) {
				int first=Integer.parseInt(res.substring(0,2));
				int second=Integer.parseInt(res.substring(2));
				
				if(first<24 && second<60) {
					ans=res+"";
					System.out.println(ans+"");
				}	
			}
		}
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			String rem=str.substring(0,i)+str.substring(i+1);
			permutation(rem,res+c);
		}
		
	}

}
