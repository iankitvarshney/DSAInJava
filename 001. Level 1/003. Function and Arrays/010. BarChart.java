import java.util.*;

public class Main {

	public static int maxElementInArray(int[] arr) {

		int max = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}

		return max;

	}

	public static void barChart(int[] arr) {

		int max = maxElementInArray(arr);

		for(int floor = max; floor >= 1; floor--) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] >= floor) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		barChart(arr);

	}
}

/*

Input:
5
3 1 0 7 5

Output:
			*		
			*		
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*	

*/