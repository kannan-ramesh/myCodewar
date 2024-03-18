package com.kannanrameshrk.raji;

import java.util.ArrayList;
import java.util.List;

public class DecodeMessage {

	public static void main(String[] args) {
		String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
		//Output: "this is a secret"
		
		decodeMessage(key,message);
	}

	private static void decodeMessage(String key, String message) {
		key=key.replaceAll(" ", "");
		List<Character> list=new ArrayList<>();
		
		for(int i=0;i<key.length();i++) {
			if(list.contains(key.charAt(i))) {
				continue;
			}else {
				list.add(key.charAt(i));
			}
		}
		System.out.println(list);
		String str="";
		
		for(int i=0;i<message.length();i++) {
				int index=list.indexOf(message.charAt(i));
				char s=(char) (index+'a');
				str+=s;
			
		}
		str=str.replaceAll("`", " ");
		System.out.println(str);
		//StringBuilder str=new StringBuilder();
		
	}

}
