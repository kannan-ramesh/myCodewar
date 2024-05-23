package com.kannanrameshrk.brickgame;

import java.util.Scanner;

public class Brick {
	private static final Scanner input=new Scanner(System.in);
	static boolean loop=true;
	
	public void init() {
		System.out.println("Enter the size of Board:");
		System.out.println("Row:");
		int row=input.nextInt();
		System.out.println("Col:");
		int col=input.nextInt();
		
		char[][] arr=new char[row][col];
		fillArray(arr);
		printArray(arr);
		startGame(arr,row,col);	
	}
	
	private void startGame(char[][] arr, int row, int col) {
		char[][] shape1= {{'#','#'},{'#','#'}};
		char[][] shape2= {{'#'},{'#'},{'#'},{'#'}};
		char[][] shape3= {{'#','-'},{'#','-'},{'#','#'}};
		char[][] shape4= {{'#','#','-'},{'-','#','#'}};
		char[][] shape5= {{'-','#','-'},{'#','#','#'}};
		
		int score=0;
			
		while(loop) {
			System.out.println("Enter your shape:");
			int shape=input.nextInt();
			System.out.println("Enter Rotations Count(max 4):");
			int rotation=input.nextInt();
			System.out.println("Enter start column index:");
			int startColumn=input.nextInt();
			
			switch(shape) {
			case 1:{
				char[][] shap1 =rotateShape(shape1,rotation);
				printArray(shap1);
				score+=fillBoard(arr,shap1,startColumn);
				printArray(arr);
				break;
			}
			case 2:{
				char[][] shap2 =rotateShape(shape2,rotation);
				printArray(shap2);
				score+=fillBoard(arr,shap2,startColumn);
				printArray(arr);
				break;
			}
			case 3:{
				char[][] shap3 =rotateShape(shape3,rotation);
				printArray(shap3);
				score+=fillBoard(arr,shap3,startColumn);
				printArray(arr);
				break;
			}
			case 4:{
				char[][] shap4 =rotateShape(shape4,rotation);
				printArray(shap4);
				score+=fillBoard(arr,shap4,startColumn);
				printArray(arr);
				break;
			}
			case 5:{
				char[][] shap5 =rotateShape(shape5,rotation);
				printArray(shap5);
				score+=fillBoard(arr,shap5,startColumn);
				printArray(arr);
				break;
			}
			default:{
				System.out.println("Invalid shape..");
				break;
			}
			}
		}
		 printArray(arr);
		 System.out.println("game over.....");
         System.out.println("Your Score: " + score);
	}
	private int fillBoard(char[][] arr, char[][] shape, int startColumn) {
		int startRow=findDropRow(arr,shape,startColumn);
		
		for(int i=0;i<shape.length;i++) {
			for(int j=0;j<shape[i].length;j++) {
				if(shape[i][j]=='#') {
					arr[startRow+i][startColumn+j]=shape[i][j];
				}
			}
		}
		return clearFilledRows(arr);
	}
	
	private int clearFilledRows(char[][] arr) {
		int consecutiveRowsCleared=0;
		int score=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			boolean filled=true;
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]!='#') {
					filled=false;
					break;
				}
			}
			if(filled) {
				clearRow(arr,i);
				consecutiveRowsCleared++;
				i++;
			}
		}
		if(consecutiveRowsCleared>0) {
			score=consecutiveRowsCleared*10;
			if(consecutiveRowsCleared>1) {
				score+=(consecutiveRowsCleared-1)*20;
			}
			 System.out.println("Score: " + score);
		}
		return score;
	}

	private void clearRow(char[][] arr, int row) {
		for(int i=row;i>0;i--) {
			System.arraycopy(arr[i-1], 0, arr[i], 0,arr[0].length);
		}
		
		for(int j=0;j<arr[0].length;j++) {
			arr[0][j]='-';
		}
	}

	private int findDropRow(char[][] arr, char[][] shape, int startColumn) {
		for(int i=arr.length-shape.length;i>=0;i--) {
			boolean canPlace=true;
			for(int j=0;j<shape.length;j++) {
				for(int k=0;k<shape[j].length;k++) {
					if(shape[j][k]=='#' && arr[i+j][startColumn+k]=='#') {
						canPlace=false;
						loop=false;
						break;
					}
				}
				if(!canPlace) {
					break;
				}
			}if(canPlace) return i;
		}
		return 0;
	}

	private static char[][] rotateShape(char[][] arr, int count) {
        char[][] res = arr; // Start with the original array
        
        while (count > 0) {
            res = rotateShape90(res);
            count--;
        }
        
        return res;
    }
	private static char[][] rotateShape90(char[][] arr) {
		int n=arr.length;
		int m=arr[0].length;
		char[][] res=new char[m][n];
		
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					res[j][i]=arr[i][j];
				}
			}
			for(int i=0;i<m;i++) {
				reverse(res[i]);
			}
		
		return res;
	}
	
	private static void reverse(char[] cs) {
		int i=0;
		int j=cs.length-1;
		
		while(i<j) {
			char temp=cs[i];
			cs[i]=cs[j];
			cs[j]=temp;
			i++;
			j--;
		}
	}

	private void fillArray(char[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]='-';
			}
		}
	}
	private void printArray(char[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}
}