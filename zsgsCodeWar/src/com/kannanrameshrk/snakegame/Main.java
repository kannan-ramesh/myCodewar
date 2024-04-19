package com.kannanrameshrk.snakegame;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Main m=new Main();
		m.start(input);
	}

	private void start(Scanner input) {
		
		System.out.println("\t\tSnake Game");
		System.out.println("\t\t**********");
		
		System.out.println("Enter row size:");
		int r=input.nextInt();
		System.out.println("Enter col size:");
		int c=input.nextInt();
		
		char[][] arr=new char[r][c];
		fillArray(arr,r,c);
		
		System.out.println("Snake starting position:");
		int i=input.nextInt();
		int j=input.nextInt();
		arr[i][j]='>';
		
		System.out.println("Enter food count:");
		int n=input.nextInt();
		int[][] foodSpot=new int[n][2];
		
		fillFoodPosition(foodSpot,input,n);
		int k=0;
		int point=0;
		fillFood(foodSpot[k],arr);
		printArray(arr);
		printArray(foodSpot);
		snakeMove(arr,foodSpot,input,i,j,k,point);
	}

	private void fillFood(int[] foodArr, char[][] arr) {
		int i=foodArr[0];
		int j=foodArr[1];
		System.out.println("("+i+","+j+")");
		arr[i][j]='F';
	}

	private void snakeMove(char[][] arr, int[][] foodSpot, Scanner input, int startR, int startC, int k, int point) {
		System.out.println("Enter Direction:(Top-T,Stright-S,Down-D,Back-B)");
		char choice=input.next().charAt(0);
		
		
		switch(choice) {
			case 'T':{
				checkPlace(arr,foodSpot,startR,startC,choice,point,startR-1,startC,k,input);
				break;
			}
			case 'D':{
				checkPlace(arr,foodSpot,startR,startC,choice,point,startR+1,startC,k,input);
				break;
			}
			case 'S':{
				checkPlace(arr,foodSpot,startR,startC,choice,point,startR,startC+1,k,input);
				break;
			}
			case 'B':{
				checkPlace(arr,foodSpot,startR,startC,choice,point,startR,startC-1,k,input);
				break;
			}
			default:{
				System.out.println("Invalid Move:End of Game...");
				break;
			}
		}
	}

	private void checkPlace(char[][] arr, int[][] foodSpot, int startR, int startC, char choice, int point, int i, int j, int k, Scanner input) {
		if((i<0|| i>=arr.length)||(j<0 || j>=arr[0].length) ||foodSpot.length<k ) {
			System.out.println("Your Score is:"+point);
			return;
		}
		if(arr[i][j]=='F') {
			point+=1;
			arr[i][j]='>';
			fillFood(foodSpot[++k],arr);
		}else if(arr[i][j]=='>') {
			System.out.println("Your Score is:"+point);
			return;
		}
		arr[i][j]='>';
		printArray(arr);
		snakeMove(arr,foodSpot,input,i,j,k,point);
	}

	private void printArray(int[][] foodSpot) {
		System.out.println(Arrays.deepToString(foodSpot));
	}

	private void fillArray(char[][] arr, int r, int c) {
		for (int i = 0; i < r; i++) {
		    for (int j = 0; j < c; j++) {
		        arr[i][j] = '*';
		    }
		}
	}

	private void printArray(char[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private void fillFoodPosition(int[][] foodSpot, Scanner input, int n) {
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter food: "+(i+1));
			for(int j=0;j<1;j++) {
				int r=input.nextInt();
				int c=input.nextInt();
				foodSpot[i][j]=r;
				foodSpot[i][j+1]=c;
			}
			System.out.println();
		}
	}

}
