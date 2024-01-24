package com.kannanrameshrk.raji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagonlMatrix2 {

	public static void main(String[] args) {
		 int[][] nums = {{1,2,3,4,5},
				 		 {6,7},
				 		 {8},
				 		 {9,10,11},
				 		 {12,13,14,15,16}};
		 Map<Integer,ArrayList<Integer>> map=new HashMap<>();
		 int len=0;
		
		 
		 for(int i=0;i<nums.length;i++) {
			 for(int j=0;j<nums[i].length;j++) {
				 int sum=i+j;
				 len++;
				 if(map.containsKey(sum)) {
					 map.get(sum).add(nums[i][j]);
				 }else {
					 ArrayList<Integer> arr =new ArrayList<>();
					 arr.add(nums[i][j]);
					 map.put(sum, arr);
				 }
			 }
		 }
		 
		 System.out.println(map);

		 int[] ans=new int[len];
		 len=0;
		 for(int i=0;i<map.size();i++) {
			ArrayList<Integer> temp=map.get(i);
			 for(int j=temp.size()-1;j>=0;j--) {
				 ans[len++]=temp.get(j);
			 }
		 }
		 System.out.println(Arrays.toString(ans));
	}

}
