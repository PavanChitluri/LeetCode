package com.sortings;

class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 9, 3, 5, 23, 22, 1, 6, 9, 2 };
		MergeSort obj = new MergeSort();
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
		int mid = (min + max) / 2;
		int[] left = new int[mid];
		int[] right = new int[max - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		int k = 0;
		for (int i = mid; i <= arr.length - 1; i++) {
			right[k++] = arr[i];
		}

		left = sort(left);
		right = sort(right);
		merge(arr, left, right);
		return arr;
	}

	public int[] merge(int[] arr, int[] leftArr, int[] rightArr) {
		int lLen = leftArr.length;
		int rLen = rightArr.length;
		int i = 0, j = 0, k = 0;

		while (i < lLen && j < rLen) {
			if (leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < lLen) {
			arr[k] = leftArr[i];
			k++;
			i++;
		}

		while (j < rLen) {
			arr[k] = rightArr[j];
			k++;
			j++;
		}

		return arr;
	}
}
