package com.sortings;

/**
 * 
 * @author Pavan_Chitluri
 *	
 *	Time complexity O(n2)
 */
public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 9, 3, 5, 23, 22, 1, 6, 9, 2 };
		SelectionSort obj = new SelectionSort();
		int[] sortedArray = obj.sort(arr);
		for (int i : sortedArray) {
			System.out.print(" " + i);
		}
	}

	public int[] sort(int[] arr) {

		if (arr.length < 2) {
			return arr;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				System.out.println(" swapping " + arr[i] + " and " + arr[minIndex]);
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return arr;
	}
}
