package com.matrix;

public class SetMatrixZeroes {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == 1 && j == 2) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		SetMatrixZeroes obj = new SetMatrixZeroes();
		obj.setZeroes(matrix);

	}

	public void setZeroes(int[][] matrix) {
		if (matrix == null) {
			return;
		}

		int rows[] = new int[matrix.length];
		int col[] = new int[matrix[0].length];
		for (int i = 0; i < rows.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {
					rows[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int i = 0; i < rows.length; i++) {
			if (rows[i] == 1) {
				for (int j = 0; j < col.length; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int j = 0; j < col.length; j++) {
			if (col[j] == 1) {
				for (int i = 0; i < col.length; i++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}

}
