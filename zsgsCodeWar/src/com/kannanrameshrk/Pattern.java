package com.kannanrameshrk;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
//	0
//	1 0
//	0 1 0
//	1 0 1 0
//	0 1 0 1 0
		
	Scanner input =new Scanner(System.in);
	System.out.println("Enter size:");
	int n = input.nextInt();
	long start  =System.currentTimeMillis();
	Pattern.process(n);
	long end= System.currentTimeMillis();
	System.out.println((end-start)/60);
	}

	private static void process(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if((i+j) % 2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
