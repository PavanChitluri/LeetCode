package com.matrix;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Pavan_Chitluri
 * 
 *         A matrix is Toeplitz if every diagonal from top-left to bottom-right
 *         has the same element.
 * 
 *         Now given an M x N matrix, return True if and only if the matrix is
 *         Toeplitz.
 * 
 * 
 *         Example 1:
 * 
 *         Input: matrix = [ [1,2,3,4], [5,1,2,3], [9,5,1,2] ] Output: True
 *         Explanation: In the above grid, the diagonals are: "[9]", "[5, 5]",
 *         "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]". In each diagonal all
 *         elements are the same, so the answer is True.
 *
 */
public class ToeplitzMatrix {
	public static void main(String[] args) {
		ToeplitzMatrix obj = new ToeplitzMatrix();
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };

		System.out.println(obj.isToeplitzMatrix1(matrix));
	}

	public boolean isToeplitzMatrix(int[][] matrix) {

		int[] prevRow = matrix[0];
		for (int i = 1; i < matrix.length; i++) {
			int[] currRow = matrix[i];
			for (int j = 1; j < currRow.length; j++) {
				if (currRow[j] != prevRow[j - 1]) {
					return false;
				}
			}
			prevRow = currRow;

		}

		return true;
	}

	public boolean isToeplitzMatrix1(int[][] matrix) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (map.containsKey(i - j)) {
					if (map.get(i - j) != matrix[i][j]) {
						return false;
					}
				} else {
					map.put(i - j, matrix[i][j]);
				}
			}
		}
		System.out.println(map);
		return true;
	}

}
