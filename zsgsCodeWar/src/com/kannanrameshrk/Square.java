package com.kannanrameshrk;

import java.util.Scanner;

public class Square {



//	Given a rectangular sheet of length l and width w. we need to divide this sheet into square sheets such that the number of square sheets should be as minimum as possible.
//
//	Examples:
//
//	Input :l= 4 w=6
//
//	Output :6
//
//	We can form squares with side of 1 unit, But the number of squares will be 24, this is not minimum. If we make square with side of 2, then we have 6 squares. and this is our required answer.
//
//	And also we can’t make square with side 3, if we select 3 as square side, then whole sheet can’t be converted into squares of equal length.
//
//	Input :l=3 w=5
//	Output :15
//

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENter length:");
		int l=input.nextInt();
		System.out.println("Enter width:");
		int w=input.nextInt();
		
		int ans =  findSquare(l,w);
		System.out.println(ans);
	}

	private static int findSquare(int l, int w) {
		if(l==w) {
			return 1;
		}
		 int a = l, b = w;

	        while (a != b) {
	            if (a > b) {
	                a = a - b;
	            } else {
	                b = b - a;
	            }
	        }
	        return (l * w) / (a*a);
	}
}
