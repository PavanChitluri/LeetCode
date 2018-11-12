package com.array;

/**
 * 
 * @author Pavan_Chitluri 
 * 		   Given an integer array nums, find the contiguous
 *         subarray (containing at least one number) which has the largest sum
 *         and return its sum.
 * 
 *         Example:
 * 
 *         Input: [-2,1,-3,4,-1,2,1,-5,4], 
 *         Output: 6 
 *         Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaximumSubarray {
	public static void main(String[] args) {
		MaximumSubarray obj = new MaximumSubarray();
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(obj.maxSubArray(arr));
	}

	public int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			/*
			 * if (sum < nums[i]) { sum = nums[i]; }
			 */
			sum = Math.max(sum, nums[i]);
			/*
			 * if (max < sum) { max = sum; }
			 */
			max = Math.max(max, sum);
		}
		return max;
	}

	public int maxSubArray1(int[] nums) {

		if (nums.length == 0)
			return 0;
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > 0)
				nums[i] += nums[i - 1];
			max = Math.max(max, nums[i]);
		}
		return max;

	}

	public static int maxSubArray2(int[] A) {
		int maxSoFar = A[0], maxEndingHere = A[0];
		for (int i = 1; i < A.length; ++i) {
			maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

}
