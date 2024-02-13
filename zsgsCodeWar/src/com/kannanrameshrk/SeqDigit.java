package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeqDigit {

	public static void main(String[] args) {

		System.out.println(sequentialDigits(1000, 13000));
	}

	public static List<Integer> sequentialDigits(int low, int high) {
		List<Integer> arr = new ArrayList<>();

		for (int i = 1; i <= 9; i++) {
			int num = 0;
			for (int j = i; j <= 9; j++) {
				num = num * 10 + j;

				if (num >= low && high >= num) {
					arr.add(num);
				} else {
					if (num > high) {
						break;
					}
				}
			}
		}
		Collections.sort(arr);
		return arr;
	}

}
