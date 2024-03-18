package com.kannanrameshrk.raji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumDelete {

	public static void main(String[] args) {
		int[] arr= {4,3,1,1,3,3,2};
		int k=3;
		removeUnique(arr,k);
	}

	private static void removeUnique(int[] arr, int k) {
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		System.out.println(map);
		List<Integer> list=new ArrayList<>(map.values());
		Collections.sort(list);
		System.out.println(list);
		
		int count = list.size();
		
		for(int freq:list) {
			if(freq<=k) {
				k-=freq;
				count--;
			}else {
				break;
			}
		}
		System.out.println(count);
	}

}
