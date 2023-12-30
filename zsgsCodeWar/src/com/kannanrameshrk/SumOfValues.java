package com.kannanrameshrk;

import java.util.Scanner;

public class SumOfValues {
//	Hi,
//
//	It is time for problem solving. Solve the below problem in optimised way within 30 mins. 
//
//	Your have chosen the question number : 4
//
//	Do the following problems without using multiplication or division operators
//	a) Multiply a given integer with 15
//	b) Multiply a given even integer with 7.5
//	c) Calculate value of 15 × n/16

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("ENter number:");
		int n = input.nextInt();
		
		int result=sumA(n,15);
		 System.out.println("n*15:"+result);
		sumB(result,7.5f);
		sumC(result,16);
	}

	private static void sumC(int a, int b) {
		int result=a>>4;
		System.out.println("Result in 15*n/16:"+result);
	}
	private static void sumB(int n, float d) {
		
	    int ans =n>>1; 
	    System.out.println("result n*7.5:" + ans);
	}

	private static int sumA(int n, int b) {
		 int result = (n << 4) - n; 
		return result;
	}
}
