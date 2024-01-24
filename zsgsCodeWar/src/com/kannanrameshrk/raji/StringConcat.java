package com.kannanrameshrk.raji;

import java.util.Arrays;

public class StringConcat {

	public static void main(String[] args) {
		//String[] arr = { "cha", "r", "act", "ers" };
		String[] arr={"un","iq","ue"};

		Arrays.sort(arr, (a, b) -> Integer.compare(b.length(), a.length()));
		System.out.println(Arrays.toString(arr));

		StringBuilder str = new StringBuilder();
		
		str.append(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			String s = arr[i];
			
			if (check(s,str)) {
				str.append(s);
			}
		}
		System.out.println(str.length());
		System.out.println(str+"");
	}

	private static boolean check(String s, StringBuilder str) {
		for(int i=0;i<str.length();i++) {
			if(s.indexOf(str.charAt(i))!=-1) {
				return false;
			}
		}
		return true;
	}

}
