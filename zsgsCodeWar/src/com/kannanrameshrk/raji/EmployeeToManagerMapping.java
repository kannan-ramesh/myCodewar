package com.kannanrameshrk.raji;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class EmployeeToManagerMapping {

	public static void main(String[] args) {
//		Map managers to employee who reports both directly or inderectly

//		A A
//		B A
//		C B
//		D B
//		E D
//		F E

		int[][] arr = { { 1, 1, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0, 0 } };

		Graph graph = new Graph(arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					graph.add(i, j);
				}
			}
		}
		graph.print();
		graph.bfs(3);
	}
}

class Graph {
	ArrayList<ArrayList<Integer>> list = new ArrayList<>();

	public Graph(int length) {
		for (int i = 0; i < length; i++) {
			list.add(new ArrayList<>());
		}
	}

	public void add(int u, int v) {
		char manager = (char) ('A' + u);
		char employee = (char) ('A' + v);
		list.get(u).add(v);
		// list.get(u).add(v);
		// list.get(v).add(manager);
	}

	public void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print("List of Vertax" + (char) ('A' + i) + "->");
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print((char) ('A' + list.get(i).get(j)) + " ");
			}
			System.out.println();
		}

	}

	public void bfs(int v) {
		boolean[] visited = new boolean[list.size()];
		visited[v] = true;

		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);

		while (queue.size() != 0) {
			int val = queue.poll();
			System.out.print(" " + (char) ('A' + val));

			for (int i = 0; i < list.get(val).size(); i++) {
				int vertex = list.get(val).get(i);

				if (!visited[vertex]) {
					queue.add(vertex);
					visited[vertex] = true;
				}
			}
		}
	}

}
