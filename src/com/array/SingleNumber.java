package com.array;

/**
 * 
 * @author Pavan_Chitluri
 *         Given a non-empty array of integers, every element appears twice
 *         except for one. Find that single one.
 * 
 *         Note:
 * 
 *         Your algorithm should have a linear runtime complexity. Could you
 *         implement it without using extra memory?
 * 
 *         Example 1:
 * 
 *         Input: [2,2,1] Output: 1 Example 2:
 * 
 *         Input: [4,1,2,1,2] Output: 4
 *
 */

public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = { 3, 3, 4, 4, 5, 6, 5, 1, 6 };
		SingleNumber obj = new SingleNumber();
		obj.singleNumber(nums);
	}

	public int singleNumber(int[] nums) {
		int ans = 0;
		int len = nums.length;
		for (int i = 0; i != len; i++)
			ans ^= nums[i];
		System.out.println(ans);
		return ans;
	}
}
