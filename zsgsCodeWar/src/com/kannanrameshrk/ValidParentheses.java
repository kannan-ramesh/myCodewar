package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidParentheses {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n =input.nextInt();
		List<String> arr=new ArrayList<>();
		paranthese(0,0,"",n,arr);
		System.out.println(arr);
	}

	private static void paranthese(int open, int close, String str, int n, List<String> arr) {
		if(str.length()==2*n) {
			arr.add(str);
			return;
		}
		if(open<n) {
			paranthese(open+1, close, str+'(', n,arr);
		}
		if(close<open) {
			paranthese(open, close+1, str+')', n,arr);
		}
	}

}
