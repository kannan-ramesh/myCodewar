package com.kannanrameshrk.raji;

public class DeleteConsecutiveString {

	public static void main(String[] args) {
		String s="abbaca";
		
		int n=s.length();
		int i=0,j=0;
		String res="";
		
		while(j<n) {
			
			if(s.charAt(i)==s.charAt(j)) {
				j++;
			}else if(s.charAt(i)!=s.charAt(j) || j==n-1) {
				res+=s.charAt(i);
				i=j;
				j++;
			}
		}
		res+=s.charAt(n-1);
		System.out.println(res);
	}

}
