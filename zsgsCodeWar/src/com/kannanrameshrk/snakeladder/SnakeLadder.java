package com.kannanrameshrk.snakeladder;

import java.util.Arrays;
import java.util.Scanner;

public class SnakeLadder {
	Scanner input = new Scanner(System.in);

	public void start() {
		System.out.println("Snake Ladder");
		System.out.println("**************");
		System.out.println("Enter board size:");
		System.out.println("Enter Row size:");
		int row = input.nextInt();
		System.out.println("Enter Col size:");
		int col = input.nextInt();

		int[][] arr = new int[row][col];

		fillNumber(arr);

	}

	private void fillNumber(int[][] arr) {
		int n = arr.length * arr[0].length;
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}

//# Design a snake and ladder game.
//
//Level 1: 
//Get the below inputs 
//1. board size, 
//2. no of snakes and it's head and tail, 
//3. no of ladders and it's bottom and top, 
//4. no of players with their names.
//
//Randomly roll a dice and update commentary as " Mani rolled a 6 and moved from 0 to 6." 
//for each move until the first winning with the winning message "Mani wins the game".
//
//Rules : 
//1. Each player has a piece which is initially kept outside the board (i.e., at position 0).
//2. After the dice roll, if a piece is supposed to move outside position n*n, it does not move.
//3. There could be another snake/ladder at the tail of the snake or the end position of the ladder and the piece should go up/down accordingly.
//
//Level 2
//Complete Level 1 and update me in Arattai to enter into level 2. 
//
//Time starts Now....