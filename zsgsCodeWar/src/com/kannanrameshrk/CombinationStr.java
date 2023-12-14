package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationStr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> arr = new ArrayList<>();
		
		System.out.println("Enter String");
		String str = input.next();

		// findCombination(str);
		findCom(str, "", 0,arr);
		System.out.println(arr);
	}

	private static void findCom(String str, String s, int index, List<String> arr) {
		int n = str.length();
		
		if (n == index) {
			arr.add(s);
			return;
		}
		findCom(str, s + str.charAt(index), index + 1,arr);
		findCom(str, s, index + 1,arr);
	}

	private static void findCombination(String str) {
		List<String> list = new ArrayList<>();
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				s += str.charAt(j);
				list.add(s);
			}
			s = "";
		}
		System.out.println(list);
	}

}
