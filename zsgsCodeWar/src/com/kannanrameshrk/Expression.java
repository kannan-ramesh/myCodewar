package com.kannanrameshrk;

import java.util.Scanner;
import java.util.Stack;

public class Expression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		String[] str=new String[n];
		
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++) {
			str[i]=input.next();
		}
		expCheck(str);
	}

	private static void expCheck(String[] str) {
		Stack<Integer> stack=new Stack<>();
		int a,b;
		for(int i=0;i<str.length;i++) {
			String c=str[i];
			switch(c) {
			case "+":{
				if(stack.size()>=2) {
					 a=stack.pop();
					 b=stack.pop();
					 stack.push(a+b);
				}
				break;
			}
			case "-":{
				if(stack.size()>=2) {
					 a=stack.pop();
					 b=stack.pop();
					 stack.push(a-b);
				}
				break;
			}
			case "*":{
				if(stack.size()>=2) {
					 a=stack.pop();
					 b=stack.pop();
					 stack.push(a*b);
				}
				break;
			}
			case "/":{
				if(stack.size()>=2) {
					 a=stack.pop();
					 b=stack.pop();
					 stack.push(a/b);
				}
				break;
			}
			default:
				int val=Integer.parseInt(c);
				stack.push(val);
				break;
			}
		}
		System.out.println("Total num is=>"+stack.peek());
	}

}
