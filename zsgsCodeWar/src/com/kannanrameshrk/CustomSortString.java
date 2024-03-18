package com.kannanrameshrk;

public class CustomSortString {

	public static void main(String[] args) {
		String order = "kqep", s = "pekeq";
		sortString(order,s);
	}

	private static void sortString(String order, String s) {
		StringBuilder str=new StringBuilder();
		StringBuilder st=new StringBuilder(s);
		
		for(int i=0;i<order.length();i++) {
//			if(s.contains(order.charAt(i)+"")) {
//				int j=s.indexOf(order.charAt(i));
//				System.out.println(order.charAt(i) +" "+j);
//				str.append(order.charAt(i));
//				s=s.replace(s.charAt(j), '+');
//			}
			
		}
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='+') {
				str.append(s.charAt(i));
			}
		}
		System.out.println(str);
	}
}