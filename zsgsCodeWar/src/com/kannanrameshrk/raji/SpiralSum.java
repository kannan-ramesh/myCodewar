package com.kannanrameshrk.raji;

import java.util.Scanner;

public class SpiralSum {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n=input.nextInt();
		
		printSpiral(n);
	}

	private static void printSpiral(int n) {
		int num=n*n;
		
		int[][] arr= new int[n][n];
		int rowStart=0,rowEnd=n-1,colStart=0,colEnd=n-1;
		
		while(num>=1) {
			for(int i=colEnd;i>=colStart;i--) {
				arr[rowStart][i]=num--;
			}
			rowStart++;
			
			for(int i=rowStart;i<=rowEnd;i++) {
				arr[i][colStart]=num--;
			}
			colStart++;
			
			for(int i=colStart;i<=colEnd;i++) {
				arr[rowEnd][i]=num--;
			}
			rowEnd--;
			
			for(int i=rowEnd;i>=rowStart;i--) {
				arr[i][colEnd]=num--;
			}
			colEnd--;
		}
		
		printArr(arr);
		diagnolSum(arr);
	}

	private static void diagnolSum(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j || i+j==arr.length-1) {
					sum+=arr[i][j];
				}
			}
		}
		System.out.println("Sum:"+sum);
	}

	private static void printArr(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}

}
