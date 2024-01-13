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

	

}
