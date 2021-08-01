package com.sourav.problems;

public class MinimumCostMatrixPath {

	public static void main(String[] args) {
		int[] firstRow = {3,12,4,7,10};
		int[] secondRow = {6,8,15,11,4};
		int[] thirdRow = {19,5,14,32,21};
		int[] fourthRow = {1,20,2,9,7};
		int[][] matrix = new int[][] {firstRow,secondRow,thirdRow,fourthRow};

	}
	
	public int minimumCostPath(int[][] matrix) {
		int position = matrix[0][0];
		row: for (int i = 0; i < matrix.length; i++) {
			column: for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i + 1][j] < matrix[i][j + 1]) {
					position += matrix[i + 1][j];
					break column;
				} else {
					position += matrix[i][j + 1];
				}
			}
		}
		return position;
	}

}
