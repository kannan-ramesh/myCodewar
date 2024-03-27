package com.kannanrameshrk;

import java.util.Arrays;

public class BallonsShoot {

	public static void main(String[] args) {
		int arr[][]= {{10,16},{2,8},{1,6},{7,8}};
		
		Arrays.sort(arr,(a,b)-> Integer.compare(a[1], b[1]));
		System.out.println(Arrays.deepToString(arr));
		int res=1;
		int prv=0;
		
		for(int current=1;current<	arr.length;current++) {
			if(arr[current][0]>arr[prv][1]) {
				res++;
				prv=current;
			}
		}
		System.out.println(res);
	}
}
//[[1, 6], [2, 8], [7, 8], [10, 16]]