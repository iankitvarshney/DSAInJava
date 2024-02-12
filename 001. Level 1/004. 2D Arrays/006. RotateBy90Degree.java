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

	public static void rotate90Degree(int[][] matrix) {

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for(int i = 0; i < matrix.length; i++) {
			
			int left = 0;
			int right = matrix[i].length - 1;

			while(left < right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;

				left++;
				right--;
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

		rotate90Degree(matrix);
		display(matrix);

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
41 31 21 11 
42 32 22 12 
43 33 23 13 
44 34 24 14 

*/

/*

Matrix:

a b c d
e f g h
i j k l
m n o p


Transpose:

a e i m
b f j n
c g k o
d h l p


Reverse Columns:

m i e a
n j f b
o k g c
p l h d


NOTE:
In transpose of a matrix, 
first row becomes first column and so on.

*/