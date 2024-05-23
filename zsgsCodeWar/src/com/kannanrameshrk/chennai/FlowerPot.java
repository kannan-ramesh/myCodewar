package com.kannanrameshrk.chennai;

public class FlowerPot {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0 };
		int n = 2;

		boolean bool = find(arr, n);
		System.out.println(bool);
	}

	private static boolean find(int[] arr, int n) {
		int len = arr.length;
		
		for(int i=0;i<len;i++) {
			if(arr[i]==0) {
				if((i==0 && len==1) ||(i==0 && i+1<len && arr[i+1]==0)|| (i==len-1 && arr[i-1]==0) || (i>0 && arr[i-1]==0 && arr[i+1]==0)) {
					n--;
					arr[i]=1;
				}
			}
		}
		return n <= 0;
	}
}
