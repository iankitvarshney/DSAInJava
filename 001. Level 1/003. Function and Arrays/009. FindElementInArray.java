import java.util.*;

public class Main {

	public static int getIndex(int[] arr, int element) {

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int element = scn.nextInt();

		int index = getIndex(arr, element);
		System.out.println(index);

	}
}

/*

Input:
6
15 30 40 4 11 9
40

Output:
2

*/