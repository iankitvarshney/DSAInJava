import java.util.*;

public class Main {

	public static void diagonalTraversal(int[][] matrix) {

		for(int gap = 0; gap < matrix.length; gap++) {
			for(int i = 0, j = gap; j < matrix.length; i++, j++) {
				System.out.println(matrix[i][j]);
			}
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] matrix = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = scn.nextInt();
			}
		}

		diagonalTraversal(matrix);

	}
}

/*

Input:
4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44

Output:
11
22
33
44
12
23
34
13
24
14

*/