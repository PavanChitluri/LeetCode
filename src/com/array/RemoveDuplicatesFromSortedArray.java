package com.array;

/**
 * 
 * @author Pavan_Chitluri Given a sorted array nums, remove the duplicates
 *         in-place such that each element appear only once and return the new
 *         length.
 * 
 *         Do not allocate extra space for another array, you must do this by
 *         modifying the input array in-place with O(1) extra memory.
 * 
 *         Example 1:
 * 
 *         Given nums = [1,1,2],
 * 
 *         Your function should return length = 2, with the first two elements
 *         of nums being 1 and 2 respectively.
 * 
 *         It doesn't matter what you leave beyond the returned length. 
 *         
 *         
 *         Example 2:
 *         Given nums = [0,0,1,1,1,2,2,3,3,4],
 * 
 *         Your function should return length = 5, with the first five elements
 *         of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * 
 *         It doesn't matter what values are set beyond the returned length.
 *         Clarification:
 * 
 *         Confused why the returned value is an integer but your answer is an array?
 * 
 *         Note that the input array is passed in by reference, which means
 *         modification to the input array will be known to the caller as well.
 */

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(obj.removeDuplicates(arr));

	}

	public int removeDuplicates(int[] nums) {

		// for first element its not duplicate, count by default 1 and index will have
		// first unique element
		int count = 1;
		// we need save next unique elements from index 1
		int index = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[index] = nums[i + 1];
				index++;
				count++;
			}
		}
		return count;
	}
}
