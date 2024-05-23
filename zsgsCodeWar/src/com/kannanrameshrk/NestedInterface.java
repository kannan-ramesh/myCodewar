package com.kannanrameshrk;

interface one{
	void print();
	
	interface two{
		void display();
	}
}

class A implements one,one.two{

	@Override
	public void print() {
		System.out.println("Welcome");
	}

	@Override
	public void display() {
		System.out.println("display");
		
	}
	
}
public class NestedInterface {

	public static void main(String[] args) {
		one.two obj=new A();
		obj.display();
	}

}
