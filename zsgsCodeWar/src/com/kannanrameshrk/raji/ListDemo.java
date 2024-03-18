package com.kannanrameshrk.raji;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class ListDemo {
	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(2,10);
		map.put(1, 20);
		map.put(3,30);
		map.put(4, 40);
		map.put(1, 50);
		
		int i=map.getOrDefault(5,34);
		System.out.println(i);
	}
}