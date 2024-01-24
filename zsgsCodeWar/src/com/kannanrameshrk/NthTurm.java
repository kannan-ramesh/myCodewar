package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NthTurm {

	public static void main(String[] args) {
		//3,7,33,37,73,77,333,337,373,3777
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the n:");
		int n = input.nextInt();
		
		findNTurm(n);
	}

	private static void findNTurm(int n) {
		int n1=0,n2=0;
		List<Integer> arr = new ArrayList<>();
		
		n1=n1*10+3;
		arr.add(n1);
		n2=n2*10+2;
		arr.add(n2);
		
		int j=0;
		for(int i=2;i<100;i++) {
			n1=arr.get(j)*10+3;
			arr.add(n1);
			n2=arr.get(j)*10+2;
			arr.add(n2);
			j++;
		}
		System.out.println(arr);
		
		System.out.println("The N th Number is:"+ arr.get(n-1));
	}

}
