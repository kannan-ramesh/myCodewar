package com.kannanrameshrk;

public class ArrayXOR {

	public static void main(String[] args) {
		int[] arr= {2,1,3,4};
		int k=1;
		
		for(int i=0;i<arr.length;i++) {
			k^=arr[i];
			System.out.println(i+"-"+k);
		}
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.bitCount(k));
	}

}
