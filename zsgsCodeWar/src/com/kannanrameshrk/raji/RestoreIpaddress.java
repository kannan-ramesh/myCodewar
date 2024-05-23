package com.kannanrameshrk.raji;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpaddress {

	public static void main(String[] args) {
		String s="25525511135";
		int n=s.length();
		List<String> ans=new ArrayList<>();
		
		for(int i=1;i<4 && i<n;i++) {
			for(int j=i+1;j<i+4 && j<n;j++) {
				for(int k=j+1;k<j+4 && k<n ;k++) {
					String seg1=s.substring(0,i),
							seg2=s.substring(i, j),
							seg3=s.substring(j,k),
							seg4=s.substring(k);
							
					if(check(seg1) && check(seg2) && check(seg3) && check(seg4) ) {
						ans.add(seg1+"."+seg2+"."+seg3+"."+seg4);
					}
				}
			}
		}
		System.out.println(ans);
	}

	private static boolean check(String s) {
		if(s.length()>3 || s.length()==0  || (s.charAt(0)=='0'&& s.length()>1) || Integer.parseInt(s)>255) {
			return false;
		}
		return true;
	}

}
