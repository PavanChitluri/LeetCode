package com.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Pavan_Chitluri
 * 
 *         Given an array of integers, find if the array contains any
 *         duplicates.
 * 
 *         Your function should return true if any value appears at least twice
 *         in the array, and it should return false if every element is
 *         distinct.
 *         Example 1:
 * 
 *         Input: [1,2,3,1] Output: true Example 2:
 * 
 *         Input: [1,2,3,4] Output: false Example 3:
 * 
 *         Input: [1,1,1,3,3,4,3,2,4,2] Output: true
 *
 */

public class DuplicateCheckInteger {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 7, 8, 1 };
		DuplicateCheckInteger obj = new DuplicateCheckInteger();
		boolean check = obj.containsDuplicate(arr);
		System.out.println(check);
	}

	public boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length < 1)
			return true;
		Set<Integer> numSet = new HashSet<>();
		for (Integer integer : nums) {
			if (!numSet.add(integer)) {
				return true;
			}
		}

		return false;
	}

}
