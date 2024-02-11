import java.util.*;

public class Main {

	public static int binarySearch(int[] arr, int element) {

		int low = 0;
		int high = arr.length - 1;

		while(low <= high) {
			int mid = (low + high) / 2;

			if(arr[mid] == element) {
				return mid;
			}
			else if(element > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int element = scn.nextInt();

		int index = binarySearch(arr, element);
		System.out.println(index);

	}
}

/*

Input:
10
10 20 30 40 50 60 70 80 90 100
70

Output:
6

*/