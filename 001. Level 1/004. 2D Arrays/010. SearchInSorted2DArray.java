import java.util.*;

public class Main {

	public static void searchInSorted2D(int[][] matrix, int x) {

		int row = 0;
		int col = matrix[0].length - 1;

		while(row < matrix.length && col >= 0) {

			if(x == matrix[row][col]) {
				System.out.println(row);
				System.out.println(col);
				return;
			}
			else if(x < matrix[row][col]) {
				col--;
			}
			else {
				row++;
			}

		}

		System.out.println("Not Found");

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

		int x = scn.nextInt();

		searchInSorted2D(matrix, x);

	}
}

/*

Input:
4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
42

Output:
3
1

Input:
4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
25

Output:
Not Found

*/