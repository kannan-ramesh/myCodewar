package com.kannanrameshrk;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PerfactSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = input.nextInt();

		int ans = findPerfactSquare(n);
		System.out.println(ans);
	}

	private static int findPerfactSquare(int n) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[n + 1];

		queue.offer(0);
		int level = 0;
		visited[0] = true;

		while (!queue.isEmpty()) {
			level++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int curr = queue.poll();

				for (int j = 1; j * j <= n; j++) {
					int next = curr + j * j;

					if (next == n) {
						return level;
						
					}

					if (next < n && !visited[next]) {
						queue.offer(next);
						visited[next] = true;
					}
				}
			}
		}
		return level;
	}

}
