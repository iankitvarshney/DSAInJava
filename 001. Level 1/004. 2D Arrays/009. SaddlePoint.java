import java.util.*;

public class Main {

	public static void saddlePoint(int[][] matrix) {

		for(int i = 0; i < matrix.length; i++) {

			int leastValIndex = 0;

			for(int j = 1; j < matrix[0].length; j++) {
				if(matrix[i][j] < matrix[i][leastValIndex]) {
					leastValIndex = j;
				}
			}

			boolean flag = true;
			for(int k = 0; k < matrix.length; k++) {
				if(matrix[k][leastValIndex] > matrix[i][leastValIndex]) {
					flag = false;
					break;
				}
			}

			if(flag == true) {
				System.out.println(matrix[i][leastValIndex]);
				return;
			}

		}

		System.out.println("Invalid input");

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

		saddlePoint(matrix);

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
41

*/

/*

Saddle point is an element in a matrix, 
which is least in its row and max in its column.

There can never be two saddle points in a matrix.

Proof:

a b c d
e f g h
i j k l
m n o p

Let's suppose, f and l, both are saddle points.

If f is a saddle point, then
j < f < h

If l is a saddle point, then
h < l < j

First equation says that j < h
Second equation says that h < j

Now, both of the statements can't be true at the same time.
So, it states that there can't be more than one saddle point in a matrix.

NOTE:
It can be possible that there is no saddle point in a matrix.

*/