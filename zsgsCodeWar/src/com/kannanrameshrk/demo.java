package com.kannanrameshrk;

public class demo {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer a=new Integer(5);
		change(a);
		System.out.println(a);
	}

	private static void change(Integer a) {
		a=10;
		System.out.println(a);
	}

}
