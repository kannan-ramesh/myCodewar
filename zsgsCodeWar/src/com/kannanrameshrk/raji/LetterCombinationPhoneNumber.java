package com.kannanrameshrk.raji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationPhoneNumber {

	public static void main(String[] args) {
		HashMap<Character, List<Character>> map = new HashMap<>();
		List<String> combinations = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Digit:");
		String digits = input.next();

		map.put('2', new ArrayList<>(Arrays.asList('a', 'b', 'c')));
		map.put('3', new ArrayList<>(Arrays.asList('d', 'e', 'f')));
		map.put('4', new ArrayList<>(Arrays.asList('g', 'h', 'i')));
		map.put('5', new ArrayList<>(Arrays.asList('j', 'k', 'l')));
		map.put('6', new ArrayList<>(Arrays.asList('m', 'n', 'o')));
		map.put('7', new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
		map.put('8', new ArrayList<>(Arrays.asList('t', 'u', 'v')));
		map.put('9', new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));


		if (digits.isBlank()) {
			System.out.println(combinations);
			return;
		}
		List<String> arr = solve(digits.trim(), map, 0, combinations, "");
		System.out.println(arr);
	}

	private static List<String> solve(String digits, HashMap<Character, List<Character>> map, int index,
			List<String> combinations, String str) {
		if (index == digits.length()) {
			combinations.add(str);
			return combinations;
		}
		List<Character> letters = map.get(digits.charAt(index));
		
		for (int i = 0; i < letters.size(); i++) {
			str = str + letters.get(i);
			solve(digits, map, index + 1, combinations, str);
			str = str.substring(0, str.length() - 1);
		}
		return combinations;
	}

}
