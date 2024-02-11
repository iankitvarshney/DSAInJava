import java.util.*;

public class Main {

	public static int firstIndex(int[] arr, int element) {

		int low = 0;
		int high = arr.length - 1;
		int fi = -1;

		while(low <= high) {
			int mid = (low + high) / 2;

			if(element > arr[mid]) {
				low = mid + 1;
			}
			else if(element < arr[mid]) {
				high = mid - 1;
			}
			else {
				fi = mid;
				high = mid - 1;
			}
		}

		return fi;

	}

	public static int lastIndex(int[] arr, int element) {

		int low = 0;
		int high = arr.length - 1;
		int li = -1;

		while(low <= high) {
			int mid = (low + high) / 2;

			if(element > arr[mid]) {
				low = mid + 1;
			}
			else if(element < arr[mid]) {
				high = mid - 1;
			}
			else {
				li = mid;
				low = mid + 1;
			}
		}

		return li;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int element = scn.nextInt();

		int fi = firstIndex(arr, element);
		int li = lastIndex(arr, element);

		System.out.println(fi);
		System.out.println(li);

	}
}

/*

Input:
10
10 10 10 20 20 20 20 30 40 40
20

Output:
3
6

Input:
10
10 10 10 20 20 20 20 30 40 40
10

Output:
0
2

*/