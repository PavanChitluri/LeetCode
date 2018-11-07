package com.array;

/**
 * Given two arrays, write a function to compute their intersection.
	Example 1:
	Input: nums1 = [1,2,2,1], nums2 = [2,2]
	Output: [2,2]
	
	Example 2:
	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
	Output: [4,9]
	
	Note:
	Each element in the result should appear as many times as it shows in both arrays.
	The result can be in any order.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionTwoArrays {
	public static void main(String[] args) {

	}

	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> result = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int n1 = 0;
		int n2 = 0;
		while (n1 < nums1.length && n2 < nums2.length) {
			if (nums1[n1] < nums2[n2]) {
				n1++;
			} else if (nums1[n1] > nums2[n2]) {
				n2++;
			} else {
				result.add(nums1[n1]);
				n1++;
				n2++;
			}

		}
		int arr[] = new int[result.size()];

		for (int i = 0; i < result.size(); i++) {
			arr[i] = result.get(i);
		}

		return arr;

	}

	public int[] intersect1(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int num : nums2) {
			int n = map.getOrDefault(num, 0);
			if (n != 0) {
				result.add(num);
				map.put(num, n - 1);
			}
		}

		int[] r = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			r[i] = result.get(i);
		}

		return r;
	}

}
