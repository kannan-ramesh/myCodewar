package com.kannanrameshrk;

import java.util.Scanner;

public class EncryptionDecryption {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String:");
		String password=input.next();
		System.out.println("password:"+password);
		
		String encryptPass=encription(password);
		System.out.println("Encrypt Password:"+encryptPass);
		String decryptPass=decreption(encryptPass);
		System.out.println("Decrypt Password:"+ decryptPass);
	}

	private static String decreption(String encryptPass) {
		StringBuilder str=new StringBuilder();
		
		for(int i=0;i<encryptPass.length();i++) {
			char c=encryptPass.charAt(i);
			c=(char)((int)c-1);
			str.append(c);
		}
		return str.toString();
	}

	private static String encription(String password) {
		StringBuilder str=new StringBuilder();
		
		for(int i=0;i<password.length();i++) {
			char c=password.charAt(i);
			c=(char)((int)c+1);
			str.append(c);
		}
		return str.toString();
	}
}