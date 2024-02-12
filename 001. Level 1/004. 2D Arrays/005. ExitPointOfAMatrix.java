import java.util.*;

public class Main {

	public static void exitPointOfMatrix(int[][] matrix) {

		int direction = 0; // 0 - east, 1 - south, 2 - west, 3 - north
		int row = 0;
		int col = 0;

		while(true) {

			direction = (direction + matrix[row][col]) % 4;

			if(direction == 0) {
				col++;
			}
			else if(direction == 1) {
				row++;
			}
			else if(direction == 2) {
				col--;
			}
			else if(direction == 3) {
				row--;
			}

			if(row < 0) {
				row++;
				break;
			}
			else if(col < 0) {
				col++;
				break;
			}
			else if(row == matrix.length) {
				row--;
				break;
			}
			else if(col == matrix[0].length) {
				col--;
				break;
			}

		}

		System.out.println(row);
		System.out.println(col);

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

		exitPointOfMatrix(matrix);

	}
}

/*

Input:
4 4
0 0 1 0
1 0 0 0
0 0 0 0
1 0 1 0

Output:
1
3

Input:
4 4
0 0 1 0
1 0 0 1
0 0 0 0
1 0 1 0

Output:
3
3

Input:
4 4
0 0 0 1
0 0 0 0
1 0 0 1
0 1 1 0

Output:
0
0

Input:
4 4
0 0 1 0
1 0 0 1
0 0 0 1
1 0 1 0

Output:
2
0

*/