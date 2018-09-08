package com.array;

public class MountainArray {

	public static void main(String[] args) {
		MountainArray obj = new MountainArray();
		int[] arr = { 0, 1, 0 };
		System.out.println(obj.peakIndexInMountainArray(arr));

	}

	public int peakIndexInMountainArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] < arr[j]) {
				i++;
			} else {
				j--;
			}
		}
		return (arr[i] > arr[j]) ? i : j;

	}

}
