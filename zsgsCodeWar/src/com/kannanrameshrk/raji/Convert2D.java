package com.kannanrameshrk.raji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convert2D {

	public static void main(String[] args) {
//		nums = [1,3,4,1,2,3,1]
//		Output: [[1,3,4,2],[1,3],[1]]
		int[] nums = { 1, 3, 4, 1, 2, 3, 1 };
		// int[] nums= {1,2,3,4};

		change2d(nums);
	}

	private static void change2d(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		System.out.println(map);

		int maxFreq = 0;

		for (int fre : map.values()) {
			maxFreq = Math.max(maxFreq, fre);
		}
		System.out.println(maxFreq);
		List<List<Integer>> result = new ArrayList<>();
		
		for (int i = 0; i < maxFreq; i++) {
			result.add(new ArrayList<>());
		}
		for (int num : map.keySet()) {
			int frequency = map.get(num);
			System.out.println(frequency+" "+num);
			for (int i = 0; i < frequency; i++) {
				result.get(i).add(num);
			}
		}
		System.out.println(result);
	}

}
