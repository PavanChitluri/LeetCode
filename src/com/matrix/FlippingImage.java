package com.matrix;

public class FlippingImage {
	public static void main(String[] args) {
		FlippingImage obj = new FlippingImage();
		int[][] x = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
		obj.flipAndInvertImage(x);
	}

	public int[][] flipAndInvertImage(int[][] A) {
		if (A == null || A.length == 0)
			return new int[0][0];
		for (int i = 0; i < A.length; i++) {
			flip(A[i]);
			invert(A[i]);
		}
		return A;

	}

	public void flip(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public void invert(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 - arr[i];
		}
	}

	public int[][] flipAndInvertImage1(int[][] arr) {
		int[][] newarr = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n");
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[0].length - 1; j >= 0; j--) {
				newarr[i][row] = 1 - arr[i][j];

				row++;
			}
			row = 0;
		}

		for (int i = 0; i < newarr.length; i++) {
			for (int j = 0; j < newarr[0].length; j++) {
				System.out.print(newarr[i][j]);
			}
			System.out.println();
		}

		return null;
	}
}
