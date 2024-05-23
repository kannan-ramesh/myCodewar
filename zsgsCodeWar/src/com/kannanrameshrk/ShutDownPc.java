package com.kannanrameshrk;

import java.io.IOException;

public class ShutDownPc {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("shutdown /s /t 1");
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
