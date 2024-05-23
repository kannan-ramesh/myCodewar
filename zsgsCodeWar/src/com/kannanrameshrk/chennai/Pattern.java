package com.kannanrameshrk.chennai;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of row:");
		int n=input.nextInt();
		System.out.println("Enter size of col:");
		int m=input.nextInt();
		
		int[][] arr=new int[n][m];
		
		pattern(arr,n,m);
		printArray(arr,n,m);
		System.out.println();
		System.out.println("Enter index:");
		int i=input.nextInt();
		int j=input.nextInt();
		displayVal(arr,n,m,i,j);
	}

	private static void displayVal(int[][] arr, int n, int m, int x, int y) {
		int count=n*m;
		
		while(count!=0) {
			if(x>0) {
				for(int i=x;i>=0;i--) {
					System.out.print(arr[i][y]+",");
					count--;
				}
				y++;
				x=0;
			}else {
				for(int i=x;i<n;i++) {
					System.out.print(arr[i][y]+",");
					count--;
				}
				y++;
				x=n-1;
			}
			if(y==m) {
				y=0;
				x=n-1;
			}
		}
		
	}

	private static void printArray(int[][] arr, int n, int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}

	private static void pattern(int[][] arr, int n, int m) {
		int end=n;
		int count=n*m;
		boolean flag=true;
		int y=0;
		
		int val=1;
		
		while(count!=0) {
			if(flag) {
				for(int i=end-1;i>=0;i--) {
					arr[i][y]=val++;
					count--;
				}
				flag=false;
				y++;
			}else {
				for(int i=0;i<n;i++) {
					arr[i][y]=val++;
					count--;
				}
				flag=true;
				y++;
			}
		}
		
	}

}
