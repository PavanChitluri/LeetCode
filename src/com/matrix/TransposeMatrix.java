package com.matrix;

public class TransposeMatrix {
	public static void main(String[] args) {
		TransposeMatrix obj = new TransposeMatrix();
		int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		obj.transpose(x);

	}

	public int[][] transpose(int[][] mat) {
		int rows = mat[0].length;
		int cols = mat.length;
		int[][] newMat = new int[rows][cols];
		int rowIndex = 0, colIndex = 0;
		for (int j = 0; j < rows; j++) {
			for (int i = 0; i < cols; i++) {
				newMat[rowIndex][colIndex] = mat[i][j];
				colIndex++;
			}
			colIndex = 0;
			rowIndex++;
		}

		for (int i = 0; i < newMat.length; i++) {
			for (int j = 0; j < newMat[0].length; j++) {
				System.out.print(newMat[i][j]);
			}
			System.out.println();
		}
		return newMat;
	}
}
