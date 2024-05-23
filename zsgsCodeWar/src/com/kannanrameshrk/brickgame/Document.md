                                                BRICK GAME

Description

Brick Game is a console-based game where the player places various shapes on a board. The objective is to fill rows completely to clear them and score points. The game ends when no more shapes can be placed on the board.

Features

1)Multiple shapes to place on the board.
2)Ability to rotate shapes up to 4 times (0 to 3 times).
3)Automatic detection of filled rows and clearing them.
4)Scoring based on the number of rows cleared, with bonuses for consecutive rows.
5)Game ends when no more shapes can be placed.

Game Rules

1)The player is prompted to enter the size of the board (number of rows and columns).
2)The player selects a shape and the number of rotations.
3)The player specifies the starting column for placing the shape.
4)Shapes are placed at the bottom-most available position in the specified column.
5)If a shape cannot be placed, the game ends and the final score is displayed.

Scoring

1)Each cleared row scores 10 points.
2)Consecutive rows score an additional 20 points per row after the first.

Classes and Methods

Brick
The main class that handles the game logic.

Methods

init(): Initializes the game, sets up the board, and starts the game loop.
startGame(char[][] arr, int row, int col): Main game loop where the player inputs their moves.
fillBoard(char[][] arr, char[][] shape, int startColumn): Places the shape on the board and clears any filled rows.
clearFilledRows(char[][] arr): Clears filled rows and calculates the score.
clearRow(char[][] arr, int row): Shifts rows down to clear the specified row.
findDropRow(char[][] arr, char[][] shape, int startColumn): Finds the appropriate row to place the shape.
rotateShape(char[][] arr, int count): Rotates the shape by 90 degrees the specified number of times.
rotateShape90(char[][] arr): Rotates the shape by 90 degrees once.
reverse(char[] cs): Reverses a row for rotation purposes.
fillArray(char[][] arr): Initializes the board with empty cells.
printArray(char[][] arr): Prints the current state of the board.

Shape Definitions

Shape 1: A 2x2 block
shell

##
##
Shape 2: A vertical line of 4 blocks
bash

#
#
#
#
Shape 3: An L-shape
shell

#
#
##
Shape 4: A Z-shape
##
 ##
Shape 5: A T-shape
 #
###

How to Play

1)Clone the repository and navigate to the project directory.
2)Compile the Java files using javac.
3)Run the game using java.
4)Follow the on-screen prompts to enter board size, shape, rotations, and column index.
5)Place shapes on the board and aim to clear rows for points.
6)The game ends when no more shapes can be placed. Your final score will be displayed.

Example Gameplay

    Brick Game
		-----------
Enter the size of Board:
Row:
5
Col:
6
-,-,-,-,-,-,
-,-,-,-,-,-,
-,-,-,-,-,-,
-,-,-,-,-,-,
-,-,-,-,-,-,
Enter your shape:
1
Enter Rotations Count(max 4):
0
Enter start column index:
0

#,#,
#,#,

-,-,-,-,-,-,
-,-,-,-,-,-,
-,-,-,-,-,-,
#,#,-,-,-,-,
#,#,-,-,-,-,
Enter your shape:
4
Enter Rotations Count(max 4):
1
Enter start column index:
3
-,#,
#,#,
#,-,

-,-,-,-,-,-,
-,-,-,-,-,-,
-,-,-,-,#,-,
#,#,-,#,#,-,
#,#,-,#,-,-,

Enter your shape:
5
Enter Rotations Count(max 4):
0
Enter start column index:
0
-,#,-,
#,#,#,

-,-,-,-,-,-,
-,#,-,-,-,-,
#,#,#,-,#,-,
#,#,-,#,#,-,
#,#,-,#,-,-,

-,-,-,-,-,-,
-,#,-,-,-,-,
#,#,#,-,#,-,
#,#,-,#,#,-,
#,#,-,#,-,-,
game over.....
Your Score: 0
