package com.array;

/**
 * 
 * @author Pavan_Chitluri You are a professional robber planning to rob houses
 *         along a street. Each house has a certain amount of money stashed, the
 *         only constraint stopping you from robbing each of them is that
 *         adjacent houses have security system connected and it will
 *         automatically contact the police if two adjacent houses were broken
 *         into on the same night.
 * 
 *         Given a list of non-negative integers representing the amount of
 *         money of each house, determine the maximum amount of money you can
 *         rob tonight without alerting the police.
 * 
 *         Example 1:
 * 
 *         Input: [1,2,3,1] 
 *         Output: 4 
 *         Explanation: Rob house 1 (money = 1) and
 *         then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.
 *         Example 2:
 * 
 *         Input: [2,7,9,3,1] 
 *         Output: 12 
 *         Explanation: Rob house 1 (money = 2),
 *         rob house 3 (money = 9) and rob house 5 (money = 1). Total amount you
 *         can rob = 2 + 9 + 1 = 12.
 *
 */

public class HouseRobber {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 1, 2 };
		HouseRobber obj = new HouseRobber();
		System.out.println(obj.rob(arr));

	}

	public int rob(int[] nums) {
		int prev = 0; // prev: the best rob for house 1.... (current - 1)
		int prev_prev = 0; // prev_prev: the best rob for house 1.... (current - 2)
		for (int n : nums) {
			int temp = prev; // temp for assigning prev_prev in next loop
			prev = Integer.max(prev_prev + n, prev); // assign prev to for the next loop
			prev_prev = temp; // assigned prev_prev for the next loop
		}
		return Integer.max(prev, prev_prev);
	}
}
