package com.sortings;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 9, 3, 5, 23, 22, 1, 6, 9, 2 };
		QuickSort obj = new QuickSort();
		int[] sortedArray = obj.sort(arr);
		for (int i : sortedArray) {
			System.out.print(" " + i);
		}

	}

	public int[] sort(int[] arr) {

		if (arr.length < 2) {
			return arr;
		}
		int min = 0;
		int max = arr.length;
		quickSort(arr, min, max - 1);

		return arr;
	}

	private void quickSort(int[] arr, int min, int max) {

		if (min < max) {
			int pivotIndex = partiton(arr, min, max);
			quickSort(arr, min, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, max);
		}

	}

	public int partiton(int[] arr, int min, int max) {
		int pivot = arr[max];
		int partitionIndex = min;
		for (int i = min; i < max; i++) {
			if(arr[i] < pivot ) {
				int temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;
				
				partitionIndex++;
			}
		}
		int temp = arr[max];
		arr[max] = arr[partitionIndex];
		arr[partitionIndex] = temp;
		
		
		return partitionIndex;
	}

	private void swap(int i, int j) {
		int temp = i;
		i =j;
		j=temp;
	}
}
