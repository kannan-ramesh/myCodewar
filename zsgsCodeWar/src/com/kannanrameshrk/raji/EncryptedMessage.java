package com.kannanrameshrk.raji;

import java.util.Scanner;

public class EncryptedMessage {
//	Sample Input 1:
//		bigin
//		4
//		Sample output 1: fmkmr
//		Sample Input 2:
//		wake me early at 5 am 3
//		Sample output 2:
//		zdnh ph hduob dw 8 d.p
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = input.nextLine();
		System.out.println("ENter step:");
		int step = input.nextInt();

		findEncrypted(str, step);
	}

	private static void findEncrypted(String str, int step) {
		String ans = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				ans += " ";
			} else {
				int s = str.codePointAt(i);
				if (s >= 97 && s <= 122) {
					int c = (s - 97 + step) % 26 + 97;
					char letter = (char) c;
					ans += letter;
				} else {
					int c = (s - 48 + step) % 10 + 48;
					char letter = (char) c;
					ans += letter;
				}
			}
		}
		System.out.println(ans);
	}
}