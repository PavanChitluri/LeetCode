package com.array;

import java.util.Arrays;
/**
 * 
 * @author Pavan_Chitluri
 *	Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
	Example 1:
		Input: [3,0,1]
		Output: 2

	Example 2:
		Input: [9,6,4,2,3,5,7,0,1]
		Output: 8
 *
 */

public class MissingNumber {
	public static void main(String[] args) {
		MissingNumber obj = new MissingNumber();
		int[] arr = {1};
		int missingNumber = obj.missingNumber(arr);
		System.out.println(missingNumber);
	}
	
	private int missingNumber(int[] nums) {
		int sum =0;
		for (int i : nums) {
			sum += i;
		}
		int length = nums.length;
		return ((length * (length + 1)) / 2) - sum;
	}

	public int missingNumber1(int[] nums) {
		if(nums.length<1) {
			return 0;
		}
		
		if(nums.length<2) {
			if(nums[0]==1) {
				return 0;
			} else {
				return 0;
			}
		}
		
        Arrays.sort(nums);
		int diff = nums[0] - nums[nums.length - 1]; 
        int j = nums.length-2;
        int i=1;
        
        while( i < j) {
        	if( diff-2 != (nums[i] - nums[j])) {
        		break;
        	}
        	
        }
        
        if(nums[i]-nums[i-1]!=1) {
        	return nums[i]-1;
        } else {
        	return nums[j]+1;
        }
    }
}
