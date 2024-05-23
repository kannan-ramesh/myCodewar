package com.kannanrameshrk;

import java.util.Scanner;
import java.util.LinkedList;

public class SnakeGame1 {
    static Scanner scanner = new Scanner(System.in);
    static LinkedList<int[]> snake = new LinkedList<>();
    static int[] food = new int[2];

    public static void main(String[] args) {
        System.out.println("Enter the Size of Matrix ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        char[][] arr = new char[row][col];
        food = getFood();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = '*';
            }
        }
        int[] start = {0, 0};
        snake.add(start);
        arr[0][0] = 'S';
        System.out.println("=====Start Game=====");

        while (true) {
            arr[food[0]][food[1]] = 'f';
            System.out.println("Enter Key: Left-->L Right R Down-->D  Up--->U");
            char choice = Character.toLowerCase(scanner.next().charAt(0));
            boolean flag = moveSnake(arr, choice);
            if (!flag) {
                System.out.println("Game Over");
                break;
            } else {
                print(arr);
            }
        }
    }

    private static boolean moveSnake(char[][] arr, char choice) {
        int[] head = snake.getFirst().clone();
        switch (choice) {
            case 'l':
                head[1]--;
                break;
            case 'r':
                head[1]++;
                break;
            case 'd':
                head[0]++;
                break;
            case 'u':
                head[0]--;
                break;
            default:
                System.out.println("Invalid Input");
                return true; 
        }

        if (head[0] >= arr.length || head[0] < 0 || head[1] >= arr[0].length || head[1] < 0) {
            return false;
        }

        if (arr[head[0]][head[1]] == 'S') {
            return false; 
        }

        snake.addFirst(head); 
        if (arr[head[0]][head[1]] == 'f') {
            food = getFood();
        } else {
            int[] tail = snake.removeLast(); 
            arr[tail[0]][tail[1]] = '*'; 
        }

        updateBoard(arr);
        return true; 
    }

    private static int[] getFood() {
    	 System.out.println("Enter the Location (Index) of food ");
         int[] temp = new int[2];
         temp[0] = scanner.nextInt();
         temp[1] = scanner.nextInt();
         return temp;
		//return null;
	}

	private static void updateBoard(char[][] arr) {
        for (int[] pos : snake) {
            arr[pos[0]][pos[1]] = 'S';
        }
    }

    private static void print(char[][] arr) {
        for (char[] row : arr) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

