package com.kannanrameshrk;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int i=90;
	int j=56;
}
public class Exce {
	
	public static void main(String[] args) throws IOException  {
		Dog d=new Dog();
		FileOutputStream fos=new FileOutputStream("Dog.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(d);
	
		System.out.println("success");
	}
}