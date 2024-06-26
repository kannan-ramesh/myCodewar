package com.kannanrameshrk.snakeladder;

public class Main {
	public static void main(String args) {
		SnakeLadder sl=new SnakeLadder();
		sl.start();
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