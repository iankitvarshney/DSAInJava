import java.util.*;

public class Main {

	public static void display(int[] arr) {

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int[] inverse(int[] arr) {

		int[] inv = new int[arr.length];

		for(int i = 0; i < arr.length; i++) {
			int index = i;
			int value = arr[i];

			inv[value] = index;
		}

		return inv;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int[] inv = inverse(arr);

		display(inv);

	}
}

/*

Input:
5
3 4 1 2 0

Output:
4
2
3
0
1

Input:
5
4 1 0 2 3

Output:
2
1
3
4
0

*/