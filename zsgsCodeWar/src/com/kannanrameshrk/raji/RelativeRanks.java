package com.kannanrameshrk.raji;

import java.util.Arrays;
import java.util.PriorityQueue;

public class RelativeRanks {

	public static void main(String[] args) {
		int[] arr= {10,3,8,9,4};
		int n = arr.length;
	    String[] res = new String[n];
	        
	    PriorityQueue<Integer> pq =  new PriorityQueue<>((a,b)->arr[b]-arr[a]);
	        
	        for(int i=0;i<n;i++){
	            pq.add(i);
	        }
	        
	        System.out.println(pq);
	        int i=1;
	        
	        while(!pq.isEmpty()) {
	        	int idx=pq.poll();
	        	System.out.println("idx"+idx);
	        	if(i>3) {
	        		res[idx]=i+"";
	        	}else if(i==1) {
	        		res[idx]="Gold Medeol";
	        	}else if(i==2) {
	        		res[idx]="silver Medeol";
	        	}else if(i==3) {
	        		res[idx]="Bronze Medeol";
	        	}
	        	i++;
	        }
	        System.out.println(Arrays.toString(res));
	}
}
