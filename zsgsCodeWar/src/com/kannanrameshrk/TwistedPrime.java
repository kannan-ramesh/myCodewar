package com.kannanrameshrk;

import java.util.Scanner;

public class TwistedPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=input.nextInt();
		
		if(isPrime(n) && isPrime(isReverse(n))) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

	private static int isReverse(int n) {
		int rev=0;
		
		while(n > 0) {
			rev = rev * 10 +n%10;
			n=n/10;
		}
		return rev;
	}

	private static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
