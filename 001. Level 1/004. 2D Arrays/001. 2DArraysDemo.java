import java.util.*;

public class Main {

	public static void display(int[][] arr) {

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		display(arr);

	}
}

/*

Input:
3 4
11 12 13 14
21 22 23 24
31 32 33 34

Output:
11 12 13 14 
21 22 23 24 
31 32 33 34 

*/