package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumArray {

	public static void main(String[] args) {
		//int[] arr= {8,3,4,7,9};
		List<Integer> arr=new ArrayList<>(Arrays.asList(8,3,4,7,9));
		int n=7;
		System.out.println(arr);
		List<List<Integer>> res=new ArrayList<>();
		
		for(int i=0;i<arr.size();i++) {
			int rem=n-arr.get(i);
			if(arr.get(i)==n) {
				List<Integer> arr2=new ArrayList<>();
				arr2.add(arr.get(i));
				res.add(arr2);
			}
			if(arr.contains(rem)) {
				List<Integer> arr2=new ArrayList<>();
				int v=arr.indexOf(rem);
				if(v>=i || i==v) {
					arr2.add(arr.get(i));
					arr2.add(arr.get(v));
					res.add(arr2);
				}
			}
		}
		System.out.println(res);
	}
	

}
