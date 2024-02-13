package com.kannanrameshrk.raji;

import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
//		. Print the total number of odd and even digits in the given number.
//
//		  
//		  Ex.  Input  :  1234567
//
//		    Output  :  ODD 4
//		        EVEN 3
		
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		
		int oddCount=0;
		int evenCount=0;
		
		while(num>0) {
			int n=num%10;
			
			if(n%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("Odd"+oddCount);
		System.out.println("Even"+evenCount);

	}

}
