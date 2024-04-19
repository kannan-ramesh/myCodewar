package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortCharFreq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = input.next();
		
		findFreq(str);
//		 s = "tree"
//		 Output: "eert"
		
	}

	private static void findFreq(String str) {
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, (a,b) -> b.getValue().compareTo(a.getValue()));
		
		System.out.println(map);
		StringBuilder s=new StringBuilder();
		for(Map.Entry<Character, Integer> val:list) {
			
			for(int i=0;i<val.getValue();i++) {
				s.append(val.getKey());
			}
		}
		System.out.println(s+"");
	}

}
