package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

	public static void main(String[] args) {
	String[] strs = {"eat","tea","tan","ate","nat","bat"};
		groupAnagram(strs);
	}

	private static void groupAnagram(String[] strs) {
		HashMap<String,List<String>> map = new HashMap<>();
		
		for(int i=0;i<strs.length;i++) {
			String s=strs[i];
			
			char[] arr=s.toCharArray();
			Arrays.sort(arr);
			String str=new String(arr);
			
			if(map.containsKey(str)) {
				map.get(str).add(s);
			}else {
				map.put(str, new ArrayList<>());
				map.get(str).add(s);
			}
		}
		System.out.println(map.values());
	}

}
