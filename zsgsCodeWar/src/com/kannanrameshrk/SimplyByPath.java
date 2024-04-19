package com.kannanrameshrk;

import java.util.Deque;
import java.util.LinkedList;

public class SimplyByPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home//foo/";
		
		//Stack<String> stack=new Stack<>();
		Deque<String> stack=new LinkedList<>();
		
		StringBuilder str=new StringBuilder();
		
		String[] s=path.split("/");
		
		for(int i=0;i<s.length;i++) {
			if(!stack.isEmpty() && s[i].equals("..")) {
				stack.pop();
			}else if(!s[i].equals("") && !s[i].equals(".") && !s[i].equals("..")) {
				stack.push(s[i]);
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("/");
			return;
		}
		
		while(!stack.isEmpty()) {
			//str.insert(0, stack.pop()).insert(0, "/");
			str.append("/").append(stack.pollLast());
		}
		System.out.println(str.toString());
	}

}
