package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortArrayFreq {

	public static void main(String[] args) {
		//int[] nums = {1,1,2,2,2,3};
		//Output: [3,1,1,2,2,2]
		int[] nums = {2,3,1,3,2};
		//Output: [1,3,3,2,2]
		
		Map<Integer,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
		}
		System.out.println(map);
		
		ArrayList<Integer> arr=new ArrayList<>(map.keySet());
		System.out.println(arr);
		
		Collections.sort(arr,(a,b)->{
			if(map.get(b)==map.get(a)) {
				return b-a;
			}else {
				return map.get(a)-map.get(b);
			}
		});
		System.out.println(map);
		System.out.println(arr);
		
		int[] res=new int[nums.length];
		
		int index=0;
		
		for(int list:arr) {
			for(int i=0;i<map.get(list);i++) {
				res[index++]=list;
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
