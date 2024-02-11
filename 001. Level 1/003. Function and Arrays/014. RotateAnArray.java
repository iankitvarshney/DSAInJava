import java.util.*;

public class Main {

	public static void display(int[] arr) {

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

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

	public static void rotate(int[] arr, int k) {

		k %= arr.length;
		if(k < 0) {
			k += arr.length;
		}

		reverse(arr, 0, arr.length - k - 1);
		reverse(arr, arr.length - k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();

		rotate(arr, k);

		display(arr);

	}
}

/*

Input:
5
10 20 30 40 50
3

Output:
30
40
50
10
20

Input:
5
10 20 30 40 50
7

Output:
40
50
10
20
30

Input:
5
10 20 30 40 50
-2

Output:
30
40
50
10
20

*/

/*

Break the array into two parts: p1 and p2

Initial array: p1 + p2

Steps for rotation:
1. Reverse Part 1.
2. Reverse Part 2.
3. Reverse whole array.

=> p1 + p2
=> p1' + p2'
=> (p1' + p2')'
=> p2'' + p1''
=> p2 + p1

*/