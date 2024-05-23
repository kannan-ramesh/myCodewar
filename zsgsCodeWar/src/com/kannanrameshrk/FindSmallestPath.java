package com.kannanrameshrk;

import java.util.LinkedList;
import java.util.Queue;

class QItem{
	int row;
	int col;
	int dist;
	
	public QItem(int row,int col,int dist) {
		this.row=row;
		this.col=col;
		this.dist=dist;
	}
}

public class FindSmallestPath {
	public static void main(String[] args) {
		char arr[][]={{'0', '*', '0', 's'},
					 {'*', '0', '*', '*'},
					 {'0', '*', '*', '*'},
					 {'d', '*', '*', '*'}
					};
		
		System.out.println(minDistance(arr));
	}

	private static int minDistance(char[][] arr) {
		QItem q=new QItem(0,0,0);
		
		one:for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]=='s') {
					q.row=i;
					q.col=j;
					break one;
				}
			}
		}
		
		Queue<QItem> queue=new LinkedList<>();
		queue.add(new QItem(q.row,q.col,0));
		
		boolean[][] visited=new boolean[arr.length][arr[0].length];
		
		visited[q.row][q.col]=true;
		
		while(queue.size()!=0) {
			QItem qi=queue.remove();
			
			if(arr[qi.row][qi.col]=='d') {
				return qi.dist;
			}
			
			 // moving up
		      if (isValid(qi.row - 1, qi.col, arr, visited)) {
		        queue.add(new QItem(qi.row - 1, qi.col,
		                            qi.dist + 1));
		        visited[qi.row - 1][qi.col] = true;
		      }
		      //moving down
		      if (isValid(qi.row + 1, qi.col, arr, visited)) {
			        queue.add(new QItem(qi.row + 1, qi.col,
			                            qi.dist + 1));
			        visited[qi.row + 1][qi.col] = true;
			  }
		      //moving left
		      if (isValid(qi.row , qi.col-1, arr, visited)) {
			        queue.add(new QItem(qi.row , qi.col-1,
			                            qi.dist + 1));
			        visited[qi.row][qi.col-1] = true;
			   }
		      
		      //moving right
		      if (isValid(qi.row, qi.col+1, arr, visited)) {
			        queue.add(new QItem(qi.row, qi.col+1,
			                            qi.dist + 1));
			        visited[qi.row][qi.col+1] = true;
			      }
		}
		return -1;
	}

	private static boolean isValid(int i, int col, char[][] arr, boolean[][] visited) {
		if(i>=0 && col>=0 && i<arr.length && col<arr[0].length && arr[i][col]!='0' && visited[i][col]==false) {
			return true;
		}
		return false;
	}

}
