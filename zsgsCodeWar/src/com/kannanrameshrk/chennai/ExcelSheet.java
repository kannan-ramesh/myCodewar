package com.kannanrameshrk.chennai;

import java.util.Scanner;

public class ExcelSheet {

	public static void main(String[] args) {
//		Input          Output
//		 26             Z
//		 51             AY
//		 52             AZ
//		 80             CB
//		 676            YZ
//		 702            ZZ
//		 705            AAC
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=input.nextInt();
		
		String res="";
		
		while(n>0) {
			n--;
			int digit=n%26;
			res=(char)(digit+'A') +res;
			n/=26;
		}
		System.out.println(res);

	}

}
