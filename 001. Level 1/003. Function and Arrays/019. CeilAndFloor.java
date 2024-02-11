import java.util.*;

public class Main {

	public static void ceilAndFloor(int[] arr, int element) {

		int low = 0;
		int high = arr.length - 1;
		int floorValue = Integer.MIN_VALUE;
		int ceilValue = Integer.MAX_VALUE;

		while(low <= high) {
			int mid = (low + high) / 2;

			if(arr[mid] == element) {
				floorValue = arr[mid];
				ceilValue = arr[mid];
				break;
			}
			else if(element > arr[mid]) {
				low = mid + 1;
				floorValue = arr[mid];
			}
			else {
				high = mid - 1;
				ceilValue = arr[mid];
			}
		}

		System.out.println(floorValue);
		System.out.println(ceilValue);

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int element = scn.nextInt();

		ceilAndFloor(arr, element);

	}
}

/*

Input:
10
10 20 30 40 50 60 70 80 90 100
72

Output:
70
80

*/