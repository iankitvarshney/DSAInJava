import java.util.*;

public class Main {

	public static void display(int[][] matrix) {

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[] fillArrayFromMatrix(int[][] matrix, int shell) {

		int minRow = shell - 1;
		int minCol = shell - 1;
		int maxRow = matrix.length - shell;
		int maxCol = matrix[0].length - shell;

		// int shellSize = 2 * (maxRow - minRow + 1) + 2 * (maxCol - minCol + 1) - 4;
		int shellSize = 2 * (maxRow - minRow + maxCol - minCol);

		int[] arr = new int[shellSize];
		int index = 0;

		// left wall
		for(int i = minRow, j = minCol; i <= maxRow; i++) {
			arr[index] = matrix[i][j];
			index++;
		}
		minCol++;

		// bottom wall
		for(int i = maxRow, j = minCol; j <= maxCol; j++) {
			arr[index] = matrix[i][j];
			index++;
		}
		maxRow--;

		// right wall
		for(int i = maxRow, j = maxCol; i >= minRow; i--) {
			arr[index] = matrix[i][j];
			index++;
		}
		maxCol--;

		// top wall
		for(int i = minRow, j = maxCol; j >= minCol; j--) {
			arr[index] = matrix[i][j];
			index++;
		}
		minRow++;

		return arr;

	}

	public static void reverse(int[] arr, int start, int end) {

		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

	}

	public static void rotate(int[] arr, int rotations) {

		rotations %= arr.length;
		if(rotations < 0) {
			rotations += arr.length;
		}

		reverse(arr, 0, arr.length - rotations - 1);
		reverse(arr, arr.length - rotations, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

	}

	public static void fillMatrixFromArray(int[][] matrix, int shell, int[] arr) {

		int minRow = shell - 1;
		int minCol = shell - 1;
		int maxRow = matrix.length - shell;
		int maxCol = matrix[0].length - shell;
		int index = 0;

		for(int i = minRow, j = minCol; i <= maxRow; i++) {
			matrix[i][j] = arr[index];
			index++;
		}
		minCol++;

		for(int i = maxRow, j = minCol; j <= maxCol; j++) {
			matrix[i][j] = arr[index];
			index++;
		}
		maxRow--;

		for(int i = maxRow, j = maxCol; i >= minRow; i--) {
			matrix[i][j] = arr[index];
			index++;
		}
		maxCol--;

		for(int i = minRow, j = maxCol; j >= minCol; j--) {
			matrix[i][j] = arr[index];
			index++;
		}
		minRow++;

	}

	public static void rotateShell(int[][] matrix, int shell, int rotations) {

		int[] arr = fillArrayFromMatrix(matrix, shell);
		rotate(arr, rotations);
		fillMatrixFromArray(matrix, shell, arr);

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] matrix = new int[n][m];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix[i][j] = scn.nextInt();
			}
		}

		int shell = scn.nextInt();
		int rotations = scn.nextInt();

		rotateShell(matrix, shell, rotations);
		display(matrix);

	}
}

/*

Input:
6 6
11 12 13 14 15 16
21 22 23 24 25 26
31 32 33 34 35 36
41 42 43 44 45 46
51 52 53 54 55 56
61 62 63 64 65 66
2
1

Output:
11 12 13 14 15 16 
21 23 24 25 35 26 
31 22 33 34 45 36 
41 32 43 44 55 46 
51 42 52 53 54 56 
61 62 63 64 65 66 

*/