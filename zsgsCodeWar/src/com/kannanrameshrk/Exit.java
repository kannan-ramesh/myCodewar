package com.kannanrameshrk;

import java.util.Properties;
import java.util.logging.Logger;

public class Exit {

	public static void main(String[] args) {
		Properties p=System.getProperties();
		System.out.println(p.getProperty("os.name"));
		System.out.println(p.getProperty("os.version"));
		for(int i=0;i<5;i++) {
			if(i==2) System.exit(0);
			System.out.println(i);
			System.out.println(Logger.getLogger("hi"));
		}

	}

}
