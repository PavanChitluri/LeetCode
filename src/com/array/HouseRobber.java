package com.array;

public class HouseRobber {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 1, 2 };
		HouseRobber obj = new HouseRobber();
		System.out.println(obj.rob(arr));

	}

	public int rob(int[] nums) {

		if (nums.length < 1) {
			return 0;
		}

		if (nums.length == 1) {
			return nums[0];
		}

		if (nums.length == 2) {
			return Math.max(nums[1], nums[0]);
		}

		int evenSum = nums[0];
		int oddSum = nums[1];

		for (int i = 2; i < nums.length; i++) {
			if (i % 2 == 0) {
				evenSum += nums[i];
			} else {
				oddSum += nums[i];
			}
		}

		return Math.max(evenSum, oddSum);

	}
}
