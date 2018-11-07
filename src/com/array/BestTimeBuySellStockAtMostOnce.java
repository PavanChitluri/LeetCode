package com.array;

/**
 * @author Pavan_Chitluri
 * Say you have an array for which the ith element is the price of a given stock on day i.
	If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), 
	design an algorithm to find the maximum profit.

	Note that you cannot sell a stock before you buy one.

	Example 1:

	Input: [7,1,5,3,6,4]
	Output: 5
	Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
	Example 2:

	Input: [7,6,4,3,1]
	Output: 0
	Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * 
 *
 */

public class BestTimeBuySellStockAtMostOnce {

	public static void main(String[] args) {
		BestTimeBuySellStockAtMostOnce obj = new BestTimeBuySellStockAtMostOnce();
		int[]  arr = {7,1,5,3,6,4};
		System.out.println(obj.getMaxProfit(arr));
	}

	public int getMaxProfit(int[] prices) {

		if (prices.length < 2) {
			return 0;
		}
		int profit = 0;
		int min = prices[0];
		for (int i = 1; i <= prices.length - 1; i++) {
			if (prices[i] < prices[i - 1]) {
				min = Math.min(min, prices[i]);
			}
			if (prices[i] > prices[i - 1]) {
				profit = Math.max(profit, prices[i] - min);
			}
		}

		return profit;
	}

}
