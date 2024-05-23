package com.kannanrameshrk.raji;

import java.util.Arrays;

public class MaxhappinesSum {

	public static void main(String[] args) {
		int arr[]= {12,1,42};
		long val=maximumHappinessSum(arr,3);
		System.out.println(val);
	}

	 public static long maximumHappinessSum(int[] happiness, int k) {
	        long ans=0;
	        int n=happiness.length;
	        Arrays.sort(happiness);
	        
	        while(k>0){
	            boolean flag=true;
	            for(int i=n-1;i>=0;i--){
	                if(flag && happiness[i]>=0){
	                	System.out.println(happiness[i]);
	                    ans+=happiness[i];
	                    flag=false;
	                }
	                happiness[i]=happiness[i]-1;
	            }
	            flag=true;
	            n--;
	            k--;
	        }
	        return ans;
	    }
}
