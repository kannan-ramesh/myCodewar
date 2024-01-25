package com.kannanrameshrk.raji;

import java.util.Scanner;

public class Flames {

	public static void main(String[] args) {
		// FLAMES
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String s1=input.nextLine().toUpperCase().replace(" ", "");
		System.out.println("Enter Your Partner Name:");
		String s2=input.nextLine().toUpperCase().replace(" ", "");
		String male=s1;
		String feMale=s2;
		
		String s="FLAMES";
		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					s1=s1.replaceFirst(""+s1.charAt(i), "");
					s2=s2.replaceFirst(""+s2.charAt(j), "");
					break;
				}
			}
		}
		 
//		System.out.println(s1);
//		System.out.println(s2);
		int len=(s1.length()+s2.length()) % s.length();
//		System.out.println(s1.length()+s2.length());
//		System.out.println(len);
		
		char c=s.charAt(len-1);
		switch(c) {
			case 'F':
				System.out.println(male+" and "+feMale+" Friends...");
				break;
			case 'L':
				System.out.println(male+" and "+feMale+" Lovers...");
				break;
			case 'A':
				System.out.println(male+" and "+feMale+" Affection...");
				break;
			case 'M':
				System.out.println(male+" and "+feMale+" Married...");
				break;
			case 'E':
				System.out.println(male+" and "+feMale+" Enemy...");
				break;
			case 'S':
				System.out.println(male+"and"+feMale+"Sister...");
				break;
		}
	}

}
