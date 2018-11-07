package com.array;

/**
 * 
 * @author Pavan_Chitluri
 *
 *         Given an array A of non-negative integers, return an array consisting
 *         of all the even elements of A, followed by all the odd elements of A.
 * 
 *         You may return any answer array that satisfies this condition.
 * 
 *         Example 1: Input: [3,1,2,4] Output: [2,4,3,1] The outputs [4,2,3,1],
 *         [2,4,1,3], and [4,2,1,3] would also be accepted.
 */

public class ArrayByParity {
	public static void main(String[] args) {
		ArrayByParity obj = new ArrayByParity();
		int[] arr = { 9, 0, 1, 2, 4, 6, 3, 7 };
		int[] sortedArray = obj.sortArrayByParity(arr);
		for (int i : sortedArray) {
			System.out.print(i + " ");
		}
	}

	public int[] sortArrayByParity(int[] arr) {
		int j = arr.length - 1;
		for (int i = 0; i < j; i++) {
			int num = arr[i];
			if (num % 2 == 0) {
				continue;
			} else {
				while (j > i) {
					if (arr[j] % 2 == 0)
						break;
					j--;
				}
				int temp = arr[j];
				arr[j] = num;
				arr[i] = temp;
				j--;
			}
		}
		return arr;
	}

}
