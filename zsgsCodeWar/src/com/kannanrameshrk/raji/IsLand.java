package com.kannanrameshrk.raji;

import java.util.Arrays;
import java.util.Scanner;

public class IsLand {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter row size:");
		int r=input.nextInt();
		System.out.println("Enter col size:");
		int c=input.nextInt();
		
		char[][] arr=new char[r][c];
		
		System.out.println("Enter elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = input.next().charAt(0);
			}
			System.out.println();
		}
		
		printArr(arr,r,c);
		int count=0;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]=='1') {
					count++;
					isLand(arr,i,j);
				}
			}
		}
		System.out.println("Number of isLand:"+count);
	}

	private static void isLand(char[][] arr, int i, int j) {
		if((i<0 || i>=arr.length) || (j<0 || j>=arr[0].length)) {
			return;
		}
		if(arr[i][j]=='0' || arr[i][j]=='a') {
			return;
		}
		
		arr[i][j]='a';
		isLand(arr,i,j+1);
		isLand(arr,i,j-1);
		isLand(arr,i+1,j);
		isLand(arr,i-1,j);
	}

	private static void printArr(char[][] arr, int r, int c) {
		for(int i=0;i<r;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
