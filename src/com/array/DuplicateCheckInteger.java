package com.array;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCheckInteger {
	public static void main(String[] args) {
	int arr[] = {1,2,4,6,7,8,1};
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


