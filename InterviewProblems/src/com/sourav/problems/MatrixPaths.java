package com.sourav.problems;

public class MatrixPaths {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 0, 0 } };
		System.out.println(paths(matrix));
	}

	public static int paths(int[][] matrix) {
		int rowNumber = matrix.length;
		int columnNumber = matrix[0].length;
		int[][] adjacencyMatrix = new int[rowNumber][columnNumber];

		if (matrix[0][0] == 1) {
			return 0;
		} else {
			adjacencyMatrix[0][0] = 1;
		}

		for (int i = 1; i < columnNumber; i++) {
			if (matrix[0][i] == 1) {
				adjacencyMatrix[0][i] = 0;
			} else {
				adjacencyMatrix[0][i] = adjacencyMatrix[0][i - 1];
			}
		}
		
		for (int i = 1; i < rowNumber; i++) {
			if (matrix[i][0] == 1) {
				adjacencyMatrix[i][0] = 0;
			} else {
				adjacencyMatrix[i][0] = adjacencyMatrix[i - 1][0];
			}
		}

		for (int i = 1; i < rowNumber; i++) {
			for (int j = 1; j < columnNumber; j++) {
				if (matrix[i][j] == 1) {
					adjacencyMatrix[i][j] = 0;
				} else {
					adjacencyMatrix[i][j] = adjacencyMatrix[i - 1][j] + adjacencyMatrix[i][j - 1];
				}
			}
		}
		printAdjacencyMatrix(adjacencyMatrix);
		return adjacencyMatrix[rowNumber - 1][columnNumber - 1];
	}
	
	private static void printAdjacencyMatrix(int[][] adjacencyMatrix) {
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			for (int j = 0; j < adjacencyMatrix[0].length; j++) {
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
