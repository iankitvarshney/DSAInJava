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

	public static int[][] matrixMultiplication(int[][] one, int[][] two) {

		int[][] three = new int[one.length][two[0].length];

		for(int i = 0; i < three.length; i++) {
			for(int j = 0; j < three[i].length; j++) {
				for(int k = 0; k < one[0].length; k++) {
					three[i][j] += (one[i][k] * two[k][j]);
				}
			}
		}

		return three;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int r1 = scn.nextInt();
		int c1 = scn.nextInt();
		int[][] one = new int[r1][c1];

		for(int i = 0; i < one.length; i++) {
			for(int j = 0; j < one[i].length; j++) {
				one[i][j] = scn.nextInt();
			}
		}

		int r2 = scn.nextInt();
		int c2 = scn.nextInt();
		int[][] two = new int[r2][c2];

		for(int i = 0; i < two.length; i++) {
			for(int j = 0; j < two[i].length; j++) {
				two[i][j] = scn.nextInt();
			}
		}

		if(one[0].length == two.length) {
			int[][] three = matrixMultiplication(one, two);
			display(three);
		}
		else {
			System.out.println("Invalid input");
		}

	}
}

/*

Input:
2 3
10 0 0
0 1 20
3 4
10 1 1 1
20 1 1 1
3 2 0 30

Output:
100 10 10 10 
80 41 1 601 

*/