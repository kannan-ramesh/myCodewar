package com.kannanrameshrk;

interface Bank{
	float rateOfIntrest();
	
}

class SBI implements Bank{

	@Override
	public float rateOfIntrest() {
		return 9.15f;
	}
}

class HDFC implements Bank{

	@Override
	public float rateOfIntrest() {
		return 7.8f;
	}
	
}
public class InterfaceDemo{
	public static void main(String[] args) {
		
		Bank sbi=new SBI();
		System.out.println("Sbi:"+sbi.rateOfIntrest());
		Bank hdfc=new HDFC();
		System.out.println("HDFC:"+hdfc.rateOfIntrest());
	}
}
