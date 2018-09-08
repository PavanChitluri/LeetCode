package com.array;

public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = { 3, 3, 4, 4, 5, 6, 5,1,6 };
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
