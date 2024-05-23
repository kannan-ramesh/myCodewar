package com.kannanrameshrk.chennai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindStringRank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String:");
		String s=input.next();
		
		List<String> permutations=genratePermutations(s);
		Collections.sort(permutations);
		System.out.println("positions is:"+(permutations.indexOf(s)+1));
	}

	private static List<String> genratePermutations(String s) {
		List<String> result=new ArrayList<>();
		backtrack(result,s,"");
		return result;
	}

	private static void backtrack(List<String> result, String curr, String remain) {
		if(curr.length()==0) {
			result.add(remain);
			return;
		}
		
		for(int i=0;i<curr.length();i++) {
			String newRemain=remain+curr.charAt(i);
			String newCurr=curr.substring(0,i)+curr.substring(i+1);
			backtrack(result,newCurr,newRemain);
		}
	}

}
