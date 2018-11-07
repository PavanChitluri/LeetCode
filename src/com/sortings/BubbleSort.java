package com.sortings;

/**
 * @author Pavan_Chitluri Time complexity Best case
 *	Best case : O(n) - (Array already sorted ) so only second loop executes once  
 *  Average and worest case O(n2)
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 9, 3, 5, 23, 22, 1, 6, 9, 2 };
		BubbleSort obj = new BubbleSort();
		int[] sortedArray = obj.sort(arr);
		for (int i : sortedArray) {
			System.out.print(" " + i);
		}

	}

	public int[] sort(int[] arr) {
		if (arr.length < 2) {
			return arr;
		}

		for (int k = 0; k < arr.length; k++) {
			boolean swapCheck = false;
			// here after each iteration maximum element will goes to last position
			for (int i = 0; i < arr.length - k - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapCheck = true;
				}
			}
			if (swapCheck == false) {
				break;
			}

		}
		return arr;
	}
}
