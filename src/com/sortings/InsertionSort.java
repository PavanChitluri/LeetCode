package com.sortings;

/**
 * @author Pavan_Chitluri
 * Best case O(n)
 * Aberage and Worst case O(n2)
 */

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 9, 3, 5, 23, 22, 1, 6, 9, 2 };
		InsertionSort obj = new InsertionSort();
		int[] sortedArray = obj.sort(arr);
		for (int i : sortedArray) {
			System.out.print(" " + i);
		}
	}

	public int[] sort(int[] arr) {

		if (arr.length < 2)
			return arr;

		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j >= 1 && arr[j - 1] > arr[j]) {
//				we can keep if condition in while loop 
//				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
//				}
				j--;
			}
		}

		return arr;
	}
}
