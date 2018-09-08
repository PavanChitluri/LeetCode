package com.array;

import java.util.Arrays;

public class ArrayPartition {
	public static void main(String[] args) {

		ArrayPartition obj = new ArrayPartition();
		int[] nums = {1,1,2,2};
		System.out.println(obj.arrayPairSum(nums));

	}
	
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
	
	public int arrayPairSum1(int[] nums) {
		int i = 0;
		int j = nums.length - 1;
		int sum = 0;
		while (i < j) {
			sum += (nums[i] < nums[j]) ? nums[i] : nums[j];
			i++;
			j--;
		}

		return sum;
	}
}
