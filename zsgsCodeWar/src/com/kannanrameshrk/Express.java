package com.kannanrameshrk;

public class Express {

	public static void main(String[] args) {
		String s="374291--*+-";
		int f=-1;
		int result=s.charAt(0)-'0';
		
		
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 if(!Character.isDigit(c)) {
				 f=i;
				 break;
			 }
		 }
		 int k=f;
		 
		 for(int i=1;i<f;i++) {
			 char c=s.charAt(i);
			 char operator=s.charAt(k);
			 System.out.println(operator+","+c+"->"+result);
			 switch(operator) {
			 case '+':{
				 result+=c-'0';
				 k++;
				 break;
			 }
			 case '-':{
				 result-=c-'0';
				 k++;
				 break;
			 }
			 case '*':{
				 result*=c-'0';
				 k++;
				 break;
			 }
			 case '/':{
				 result/=c-'0';
				 k++;
				 break;
			 }
			 default:{
				 System.out.println("Invalid Operator..");
				 break;
			 }
			 }
		 }
		 System.out.println("Result:"+result);
	}

}
