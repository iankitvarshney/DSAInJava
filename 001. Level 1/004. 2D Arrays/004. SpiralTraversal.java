import java.util.*;

public class Main {

	public static void spiralTraversal(int[][] arr) {

		int minRow = 0;
		int minCol = 0;
		int maxRow = arr.length - 1;
		int maxCol = arr[0].length - 1;

		int count = 0;
		int totalCount = arr.length * arr[0].length;

		while(count < totalCount) {

			// left wall
			for(int r = minRow, c = minCol; r <= maxRow && count < totalCount; r++) {
				System.out.println(arr[r][c]);
				count++;
			}
			minCol++;

			// bottom wall
			for(int r = maxRow, c = minCol; c <= maxCol && count < totalCount; c++) {
				System.out.println(arr[r][c]);
				count++;
			}
			maxRow--;

			// right wall
			for(int r = maxRow, c = maxCol; r >= minRow && count < totalCount; r--) {
				System.out.println(arr[r][c]);
				count++;
			}
			maxCol--;

			// top wall
			for(int r = minRow, c = maxCol; c >= minCol && count < totalCount; c--) {
				System.out.println(arr[r][c]);
				count++;
			}
			minRow++;

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

		spiralTraversal(arr);

	}
}

/*

Input:
3 5
11 12 13 14 15
21 22 23 24 25
31 32 33 34 35

Output:
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24

Input:
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44

Output:
11
21
31
41
42
43
44
34
24
14
13
12
22
32
33
23

Input:
5 7
11 12 13 14 15 16 17
21 22 23 24 25 26 27
31 32 33 34 35 36 37
41 42 43 44 45 46 47
51 52 53 54 55 56 57

Output:
11
21
31
41
51
52
53
54
55
56
57
47
37
27
17
16
15
14
13
12
22
32
42
43
44
45
46
36
26
25
24
23
33
34
35

*/