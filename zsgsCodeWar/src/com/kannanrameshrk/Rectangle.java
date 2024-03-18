package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {

	public static void main(String[] args) {
//		1.There are Two Rectangles coordinates given. print the clipped coordinates.
//		int[][] r1 = {{50,50},{150,50},{150,150},{50,150}};
//		int[][] r2 ={{100,100},{200,1000},{200,200},{100,200}};
		int[][] r1 = {{0, 0}, {10, 0}, {10, 10}, {0, 10}};
		int[][] r2 = {{5, 5}, {15, 5}, {15, 15}, {5, 15}};
//		Output : {{100,100},{150,100},{150,150},{100,150}
		
		List<List<Integer>> list=new ArrayList<>();
		
		for(int i=0;i<r1.length;i++) {
			List<Integer> arr=new ArrayList<>();
			for(int j=0;j<r1[i].length;j++) {
				int temp=r2[i][j] - r1[i][j];
				
				if(temp==r1[i][j]) {
					arr.add(r2[i][j]);
				}else {
					arr.add(r1[i][j]);
				}
			}
			list.add(arr);
		}
		System.out.println(list);
	}

}
