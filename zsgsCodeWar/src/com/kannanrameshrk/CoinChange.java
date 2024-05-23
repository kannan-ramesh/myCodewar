package com.kannanrameshrk;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		int[] coins= {1,2,5};
		int amount=11;
		
		System.out.println(findCoins(coins,amount));
	}

	private static int findCoins(int[] coins, int amount) {
		int[] dp=new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0]=0;
		
		for(int i=1;i<amount+1;i++) {
			for(int coin:coins) {
				if(i-coin>=0) {
					dp[i]=Math.min(dp[i], dp[i-coin]+1);
				}
			}
		}
		System.out.println(Arrays.toString(dp));
		return dp[amount] > amount ? -1:dp[amount];
	}

}
