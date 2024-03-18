package com.kannanrameshrk.raji;

import java.util.PriorityQueue;

public class BuildingReach {

	public static void main(String[] args) {
		 int[] heights = {4,2,7,6,9,14,12};
		 int bricks = 5, ladders = 1;
		 
		 findBuildingReach(heights,bricks,ladders);
	}

	private static void findBuildingReach(int[] heights, int bricks, int ladders) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		
		for(i=0;i<heights.length-1;i++) {
			int diff=heights[i+1]-heights[i];
			System.out.println(diff=heights[i+1]-heights[i]);
			
			if(diff>0) {
				pq.add(diff);
			}
			
			if(pq.size()>ladders) {
				bricks-=pq.poll();
			}
			if(bricks<0) {
				break;
			}
		}
		System.out.println(pq);
		System.out.println(i);
	}

}
