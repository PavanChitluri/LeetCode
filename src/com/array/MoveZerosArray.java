package com.array;

public class MoveZerosArray {

	/**
	 * Given an array nums, write a function to move all 0's to the end of it while
	 * maintaining the relative order of the non-zero elements.
	 * 
	 * Example:
	 * 
	 * Input: [0,1,0,3,12] Output: [1,3,12,0,0]
	 */
	
	public static void main(String[] args) {
		
		MoveZerosArray obj = new MoveZerosArray();
		int[] nums = { 1, 3, 0, 2, 0, 6, 0};
		obj.moveZeros(nums);
	}
	
	public void moveZeros(int[] nums) {
		if (nums == null || nums.length < 2) {
			return;
		}
		int length = nums.length;
		int index = 0;
		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
		}
		while (index < nums.length) {
			nums[index++] = 0;
		}
		for (int i = 0; i < length; i++) {
			System.out.println(nums[i]);
		}
	}
	
}
