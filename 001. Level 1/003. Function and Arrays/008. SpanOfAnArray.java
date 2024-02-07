import java.util.*;

public class Main {

	public static int spanOfArray(int[] arr) {

		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++) {
			minValue = Math.min(minValue, arr[i]);
			maxValue = Math.max(maxValue, arr[i]);
		}

		return (maxValue - minValue);

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int span = spanOfArray(arr);
		System.out.println(span);

	}
}

/*

Input:
6
15 30 40 4 11 9

Output:
36

*/